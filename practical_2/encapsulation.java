public class encapsulation {
    static public class Person{
        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setage(int age){
            if (age > 0){
                this.age = age;
            }
        }

        public int getage(){
            return age;
        }
    }
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("pardeep");
        person.setage(22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getage());
    }
    
}
