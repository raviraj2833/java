// Creating a superClass  A:
class A{
    int i,j;
    void showij(){
     System.out.println("i and j: " + i + " " + j);
    }
}
// Creating subclass B 
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " +k);
    }
void sum(){
    System.out.println("i+j+k: " +(i+j+k));
}
}
public class Inheritance {
    public static void main(String[] args) {
      A superClass =new A();
      B subClass=new B();
      superClass.i=10;
      superClass.j=10;
      System.out.println("COntents of SuperClass");
      superClass.showij();
      System.out.println();

      /* The subclass has access to all public members of its superclass */
      subClass.i=10;
      subClass.j=10;
      subClass.k=10;
      System.out.println("Contents of subclass");
      subClass.showij();
      subClass.showk();
      System.out.println();
      System.out.println("Sum of i,j and k in subclass");
      subClass.sum();

    }
}
