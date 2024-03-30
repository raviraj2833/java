class Rockstargame{

    public  void hit(){
        System.out.println("Hiting");
    }
    public void fire(){
        System.out.println("Firing");
    }
    public void run(){
        System.out.println("Running");
    }
}
public class oops2 {

    public static void main(String[] args){
        Rockstargame rg=new Rockstargame();
        rg.hit();
        rg.fire();
        rg.run();
    }
}