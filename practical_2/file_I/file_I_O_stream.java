import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

// fileouputstream - write(int b) , write(byte[] b), close()
// fileinputstream - real(), real(byte[] b),close()

public class file_I_O_stream{
    public static void main(String[] args){
      try {
        // finle input stree 
          FileInputStream fis = new FileInputStream("example.txt");
          FileOutputStream fos = new FileOutputStream("example.txt");
          int content;
          while((content = fis.read()) != -1){
            System.err.println((char) content);
        }
        // file ouput stre 
        String data = "hello , pardeep"; 
        fos.write(data.getBytes());
        fis.close();
        fos.close();

    } catch (IOException e) {
          System.err.println("Exception : " + e.getMessage());
      }
     
}
}
