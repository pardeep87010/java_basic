import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// fileouputstream - write(int b), write(byte[] b), close()
// dataOutputstream - writeInt(int v) , writeDouble(double v) , writeBoolean(boolean v)

// fileinpustream - real(), real(byte[] b) , clsoe()
// dataIntputstream -readInt(), realDouble(),realBooean()

public class handling_primitive_datatypes {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{
            // dataouputstream 
            dos = new DataOutputStream(new FileOutputStream("output.txt"));
            
            // write data primitive data types in output.txt
            dos.writeInt(33);
            dos.writeDouble(42.4);
            dos.writeBoolean(true);
            
            // DataInputStream 
            dis = new DataInputStream(new FileInputStream("output.txt"));

            // read data primitive data types in output.txt
            int intValue = dis.readInt();
            double doubleValue =  dis.readDouble();
            boolean booleanValue =  dis.readBoolean();
            
            // print real data 
            System.out.println("Read Integer: " + intValue);
            System.out.println("Read Double: " + doubleValue);
            System.out.println("Read Boolean: " + booleanValue);

        }catch(Exception e){
            System.err.println("Ex : " + e.getMessage());
        }
    }
}
