import java.util.*;
public class OOPS {
public static void main(String[] args) {
    Animal an=new Animal();
    // an.eat();
    dog dg=new dog();
    dg.breathe();
    peacock pea=new peacock();
    pea.eat();
    shark shar=new shark();
    shar.legs=2;
    System.out.println(shar.legs);

}
    
}
class Animal{
    int legs;
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }

}
class fish extends Animal{
     void swim(){
        System.out.println("swim");
     }

}
class shark extends fish{
    void fins(){
        System.out.println("fins");

    }
}

class birds extends Animal{
     void fly(){
        System.out.println("fly");
     }
}

class peacock extends birds{
    void beautiful(){
        System.out.println("beautiful");
    }
}

class mammals extends Animal{
    void walk(){
        System.out.println("walk");
    }
}
class dog extends mammals{
    void bark(){
       System.out.println("bark");
    }
}