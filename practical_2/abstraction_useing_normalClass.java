public class abstraction_useing_normalClass {
    static abstract class animal{
        public abstract void animalsound();
        public void animal_sleep(){
            System.out.println("Zzz");
        }
    }
    static class Dog extends animal{ 
        @Override
        public void animalsound(){
            System.out.println("woof");
        }
    }
    public static void main(String[] args) {
        Dog myanimal = new Dog();

        myanimal.animal_sleep();
        myanimal.animalsound();
    }
}

