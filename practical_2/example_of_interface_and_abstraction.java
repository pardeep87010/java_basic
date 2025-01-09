public class example_of_interface_and_abstraction {
    // abstract  class with abstraction method
    static abstract class animal{
        public void sleep(){
            System.out.println("Zzz");
        }
        public abstract void sound();
    }
    
    static class dog extends animal{
        public void sound(){
            System.out.println("woof");

        }
    }
    static class cat extends animal{
        public void sound(){
            System.out.println("meow");
        }
    }

    // interface with interface mehtod
    static interface product{
        void price();
        void quality();
    }

    static class Iphone implements product{
        public void price(){
            System.err.println("1000$");
        }
        public void quality(){
            System.err.println("very good");

        }
    }

    static class android implements product{
        public void price(){
            System.err.println("100$");
        }
        public void quality(){
            System.err.println("good");

        }
    }

    public static void main(String[] args) {
        // abstraction object 
        dog mydog = new dog();
        cat mycat = new cat();

        System.err.println("abstraction class \n");
        System.err.println("\nmydog");
        mydog.sleep();
        mydog.sound();
        
        System.err.println("\nmycat");
        mycat.sleep();
        mycat.sound();
        
        // intreface object 
        System.err.println("interface class \n");
        Iphone myIphone = new Iphone();
        android myandroid = new android();
        
        System.err.println("\nmyiphone");
        myIphone.price();
        myIphone.quality();
        
        System.err.println("\nmyandroid");
        myandroid.price();
        myandroid.quality();


    }
}
