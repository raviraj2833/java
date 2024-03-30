class Sigma{
    int a;
    public int getA(){
        return a;
    }
    Sigma(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
    }

    class Sigma1 extends Sigma{
        Sigma1(int b){
        super(b);
        System.out.println("I am constructor");
    }
}
public class this_super {

    public static void main(String[] args){
        Sigma s=new Sigma(5);
        Sigma1 s1=new Sigma1(6);

        System.out.println(s.getA());
        System.out.println(s1.getA());
    }

}