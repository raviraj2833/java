// question no 1:


class Employee{
    String name;
    int salary;
public int getSalary(){
    return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name=n;
}

}
 class cellphone{
    public void ring(){
        System.out.println("ringing......");
    }
    public void vibrate(){
        System.out.println("vibrating.......");
    }
    public void callFriend(){
        System.out.println("Calling Ravi.....");
    }
 }

public class question_class {


    public static void main(String[] args) {
        Employee first=new Employee();
        Employee second =new Employee();
        first.name="Ravi";
        first.setName("UPSC");
        first.salary=78;
        second.name="Rahul";
        second.salary=232;
 
        // printing the attributes of first:

        
        // System.out.println(first.name);
        // System.out.println(first.salary);
        // System.out.println(first.getName());

        // printing the attributes of second:



        // System.out.println(second.name);
        // System.out.println(second.salary);
    

        // using getsalary
        int salary=first.getSalary();
        System.out.println(salary);
        // using getname
        String name=first.getName();
        System.out.println(name);


        // Question no 2:

          cellphone asus=new cellphone();
          asus.callFriend();
          asus.vibrate();
          asus.ring();

        
    }
}