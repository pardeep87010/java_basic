public class exception_ex {
    public static void main(String[] args) {
        try {
            int arr[] = {4,5,3,5,3};
            System.err.println("value of at index 3 : " + arr[3]);
            int result = 10/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("exception : " + e.getMessage());
        }
          catch (ArithmeticException e) {
            System.err.println("exception : " + e.getMessage());
        }
        finally{
            System.err.println("code fnish");
            
        }
    }
}
