class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    static int classRoll;
    void setRoll(int roll){
        this.roll=roll;
    }
    int getRoll(){
        return this.roll;
    }
}

public class OOPs {
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolName="JMV";
        Student s2=new Student();
        System.out.println(s2.schoolName);
        Student s3=new Student();
        s3.schoolName="JPS";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }

    
}
