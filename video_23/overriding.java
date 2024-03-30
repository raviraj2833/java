class A{
    int a;
    public int Ravi(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
    public void meth3(){
        System.out.println("I am method 3 of class A");
    }
}
class B extends A{
    @Override   //>>>>> here overridng is used :
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class overriding {

    public static void main(String[] args){
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}