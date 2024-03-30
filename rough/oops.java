class Employee{
    int fees;
    String name;

    public int getFee(){
        return fees;
    }
    public String getName(){
        return name;
    }
    public void Setname(String n){
        name=n;
    }
}
public class oops {

    public static void main(String[] args){
        Employee first=new Employee();
        first.fees=3200;
        first.Setname("Jai shree Ram");
        System.out.println(first.getFee());
        System.out.println(first.getName());

    }
}