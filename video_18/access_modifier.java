class Student{
    private int id;
    private String name;
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
public class access_modifier {

    public static void main(String[] args){
        Student st=new Student();
        st.SetName("Jai Shree Ram");
        System.out.println(st.getName());
        st.setId(22424);
        System.out.println(st.getId());


    }
}