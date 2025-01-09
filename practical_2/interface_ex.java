public class interface_ex {
    static interface animal{
        void sound();
        void sleep();
    }
    static class dog implements animal{
        // @Override
        public void sound(){
            System.out.println("woof");
        }
        // @Override
        public void sleep(){
            System.out.println("Zzz");

        }
    }
    public static void main(String[] args) {
        dog myanimal = new dog();

        myanimal.sound();
        myanimal.sleep();
    }
}
