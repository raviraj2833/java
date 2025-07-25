public class OOPS{
public static void main(String args[]){
    student s1=new student();
    // System.out.println(s1.name);
    student s2=new student("Ravi");
    System.out.println(s2.name);
    student s3=new student(20);
    System.out.println(s3.age);
}
}
class student{
    String name;
    int age;
    student(){   /// Non parametrised constructor
        // this.name=name;
        System.out.println("constructor is called....");
    }
    student(String name){
        this.name=name;
    }
    student(int Age){
        this.age=Age;
    }
}