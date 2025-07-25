public class OOPS {

    public static void main(String[] args) {
        vehicle obj1=new car();
        obj1.print1(); // error 

        vehicle obj2=new vehicle();
        obj2.print();
        
    }
}
class vehicle{
    void print(){
        System.out.println("base class(vehicle)");
    }
}

class car extends vehicle{
    void print1(){
        System.out.println("Derived class(car)");
    }
}