import java.sql.*;

public class database_connectivity {
    public static void main(String[] args) {

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // establish a connection 
            String url = "jdbc:mysql://localhost:5505/mydb";
            String username = "root";
            String password = "password";

            Connection conn = DriverManager.getConnection(url,username,password);

            // create a statement 
            Statement stmt = conn.createStatement();

            // execute queries
            String querie = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(querie);
            
            // close the conncection 
            conn.close();

        }
        catch(Exception e){
            System.err.println("ex : " + e.getMessage());
        }
    }
}
