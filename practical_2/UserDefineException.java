class AgeNotValid extends Exception{
    public AgeNotValid(String message){
        super(message);
    }
}

public class UserDefineException {
    // A method that checks age and throws the custom exception
    public static void checkAge(int age) throws AgeNotValid{
        if (age < 18 ){
            throw new AgeNotValid("age is less then 18 ");
        }
        System.err.println("Register succ");
    }
    public static void main(String[] args){
        try {
            checkAge(8);
        } catch (AgeNotValid e) {
            System.err.println("ex" + e.getMessage());

        }
    }
}