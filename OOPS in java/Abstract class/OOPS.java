import java.util.*;
public class OOPS {

    public static void main(String[] args) {
// hierarchy of constructor calls: Animal-->> horse--->> mustang..
   

        // horse hor=new horse();
        // hor.eat();
        // hor.walk();
        // // hor.changeColor();
        // System.out.println(hor.color);
        // chicken ch=new chicken();
        // ch.eat();
        // ch.walk();
        // System.out.println(ch.color);
         mustang myhorse=new mustang();

    }
}
 
abstract class Animal{
    
    String color;
    Animal(){
        System.out.println("Animal contructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animal{
    horse(){
        System.out.println("horse contructor is called");
    }
    void changeColor(){
        color="brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class mustang extends horse{
    mustang(){
       System.out.println("mustang contructor called");
    }
}

class chicken extends Animal{
    chicken(){
        System.out.println("chicken contructor is called");
    }
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}