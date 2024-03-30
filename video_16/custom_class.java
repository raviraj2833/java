class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " +id);
        System.out.println("My name is " +name);
    }
    public int getSalary(){
        return salary;
    }
}

public class custom_class {
    
    public static void main(String[] args) {
        System.out.println("This is our costume class");
        Employee code=new Employee();    //Instantiating a new employee Object:
        Employee code2=new Employee();  
        // Setting Attributes for code:

        code.id=13;
        code.salary=14;
        code.name="Ravi";

        // Setting Attributes for code2:
        code2.id=18;
        code2.salary=19;
        code2.name="Monu";
        

        // printing the attributes
           
         code.printDetails();
         code2.printDetails();
         int salary=code2.getSalary();
         System.out.println(salary);
        // System.out.println(code.id);
        // System.out.println(code.name);


    }
}
