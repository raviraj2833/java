class Mystudent{
    private int id;
    private String name;
  
    public Mystudent(String myname,int myid){
        id=myid;
        name=myname;
    }

     public int getId(){
        return id;
     }
     public void setId(int i){
        this.id=i;
     }
     public String getName(){
        return name;
     }
     public void SetName(String n){
        this.name=n;

     }
}
public class contructor {

    public static void main(String[] args){
        Mystudent first=new Mystudent("ravi",76);
        // first.SetName("ravi is a good boy");
        //  first.setId(29);
        System.out.println(first.getName());
        System.out.println(first.getId());

    }
}