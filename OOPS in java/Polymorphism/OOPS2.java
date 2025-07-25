public class OOPS2 {
    public static void main(String[] args) {
        // Animal an=new Animal();
        // an.eat();
        deer dee=new deer();
        dee.eat();
    }
    
}
 class Animal{
    void eat(){
        System.out.println("Eat anything");
    }

 }
 class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
 }