public class OOPS {

    public static void main(String[] args) {
      person pe=new person();
      pe.weight=34;
      pe.name="Ravi";
      
   Vehicle ve=new car(); // possible
   car ca=new car(); //  possible
//    car c=new Vehicle(); // this is not possible 
   Vehicle ver=new Vehicle(); //  possible

   // parents reference= child object......

        
    }
}

class person{
    String name;
    int weight;
}

class student extends person{
    int roll;
    String Schoolname;
}

class Vehicle{

}

class car extends Vehicle{

}