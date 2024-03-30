class constructor{
   private int salary;
     private String name;
public constructor(int salary){
    salary=10000;
}

    public int getSalary(){
        return salary;
    }
        public void setSalary(int n){
            this.salary=n;

        }
        public String getName(){
            return name;
        }
        public void setName(){
            this.name="Your name here";
        }
    }

public class question1 {
    public static void main(String[] args) {
        constructor co=new constructor(10000);
        co.setName();
        co.setSalary(10000);
        System.out.println(co.getSalary());
    }
    
}
