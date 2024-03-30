class base1 {
    base1() {
        System.out.println("I am a constructor");
    }

    base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base1 {
    derived1() {
        super(0);
        System.out.println("I am derived class constructor");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("I am overloaded derived class constructor with value of y as: " + y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class childOfderived extends derived1 {

    childOfderived() {
        System.out.println("I am child of derived constructor");
    }

    childOfderived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an  overloaded child derived constructor   with value of z: " + z);
    }

}
class grandchildofDerived extends childOfderived{
    grandchildofDerived(){
        System.out.println("I am grandchild class  constructor");
    }
    grandchildofDerived(int x,int y,int z,int w){
        super(x, y, z);
        System.out.println("I am  grandchild of child derived class constructor with value of w: " +w);
    }
    
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
        // base1 b =new base1();
        // derived1 d=new derived1();
        // derived1 d=new derived1(3,5);
    childOfderived c = new childOfderived(2, 5, 7);
      // grandchildofDerived g=new grandchildofDerived(2,5,6,8);

    }
}
