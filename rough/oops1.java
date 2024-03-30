class square{
    int side;

    public int perimeter(){
        return 4*side;
    }
    public int Area(){
        return side*side;
    }
    
}
public class oops1 {
    public static void main(String[] args){
        square one=new square();
      one.side=8;
        System.out.println(one.Area());
        System.out.println(one.perimeter());


    }
    
}
