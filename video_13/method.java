public class method {
    //  static int logic(int x,int y){}
    int logic(int x, int y) {
        int z;
        if (x > y) { // Here we use method function which avoid repeatating ................
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 17;
        // int c = logic(a, b);
        method obj=new method();              // We use calling a method:
        int c= obj.logic(a,b);
        int a1 = 8;
        int b1 = 18;
        // int c1 = logic(a1, b1);
        int c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

       
       
    }
}
