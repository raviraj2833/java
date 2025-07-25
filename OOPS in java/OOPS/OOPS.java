public class OOPS{

    public static void main(String args[]){
        pen p1=new pen();
        p1.setColor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(6);
        System.out.println(p1.getTip());

        student s1=new student();
        s1.setpercentage(90, 90, 90);
        System.out.println(s1.percentage);
        s1.setname("Ravi");
        System.out.println(s1.name);
        s1.setAge(21);
        System.out.println(s1.age);

        BankAccount myAcc=new BankAccount();
        myAcc.username="Rohit";
        System.out.println(myAcc.username);
        myAcc.setPassword("ABDccccddd");
        System.out.println(myAcc.getpassword());
    }


}

class BankAccount{
     public String username;
     private  String password;

     String getpassword(){
        return this.password;
     }

     public void setPassword(String pwd){
        password=pwd;
     }
}

class pen{
   private String color;
     private int tip;
    String getcolor(){  //  Getter
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){  // Setter
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
 class student{
    String name;
    int age;
    float percentage;

    void setpercentage(int phy,int che,int math){
        percentage=(phy+che+math)/3;

    }
    void setname(String newName){
        name=newName;

    }
    void setAge(int newAge){
        age=newAge;
    }

 }