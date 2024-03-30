class base{
    int x;
   public int getX(){
    return x;
   } 
   public void setX(int n){
    System.out.println("I am in base and setting x now");
    this.x=n;
   }
   public void printMe(){
    System.out.println("hello i am constructor");
   }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class constructor {

    public static void main(String[] args){
// Creating a class of  base class
        base b=new base();
        b.setX(56);
        System.out.println(b.getX());
        // Creating a class of derived class:
        Derived d=new Derived();
        d.setY(722);
        System.out.println(d.getY());

    }
} 