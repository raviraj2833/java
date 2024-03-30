class Phone{
        public void greet(){
            System.out.println("Good morning");
        }
        public void name(){
        System.out.println("My name is java");
    }
    }
    class SmartPhone extends Phone{
        public void swagat(){
            System.out.println("Subhprabhat");
        }
        public void name(){
            System.out.println("My name is java in class smartphone");
        }
    }
    public class dynamic_method {
    public static void main(String[] args) {
        // Phone ph=new Phone();  allowed 
        // SmartPhone sph=new SmartPhone(); >>>> allowed
        // ph.name();
        Phone ph=new SmartPhone();
       ph.name();
    //    SmartPhone sph=new Phone(); >>>>> Not allowed
       ph.greet();

    // }
    }
}