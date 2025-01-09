import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// reader - read() , read(char[] c) , clsoe()
// write - write(int c) , write(string str) , close()

public class file_R_W_stream {
    public static void main(String[] args) throws IOException {

        try{    
            // file reader 
            FileWriter fw = null;
            FileReader fr = null;

            fr = new FileReader("text.txt");
            fw = new FileWriter("output.txt");

            int content;
            while ((content = fr.read()) != -1) { 
                System.out.println((char) content);
            }
            
            // file writer 
            String data = "hello, pardeep how are you ";
            fw.write(data);

            fr.close();
            fw.close();
        }catch(Exception e ){
             System.out.println("Ex" + e.getMessage());
        }

    }
}
