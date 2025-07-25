public class OOPS {

    public static void main(String[] args) {
       fish fi=new fish();
       fi.color="black";
       bird bi=new bird();
       bi.fly();
       mammals mam=new mammals();
       mam.walk();
       Animal an=new Animal();
    //    an.eat();
    //    an.color="red";
       
        
        
    }
}
// base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
// derived class
class mammals extends Animal{ // hierarchial inheritance......
   int legs;
   void walk(){
    System.out.println("mammals can walk");
   }

   }
class dog extends Animal{ // hierarchial inheritance......
    String breeds;
}
class fish extends Animal{
    void swim(){
        System.out.println("fish can swim");
    }
}

class bird extends Animal{  // hierarchial inheritance......
    void fly(){
        System.out.println("birds can fly");
    }
}
