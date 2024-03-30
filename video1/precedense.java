public class precedense {
public static void main(String[] args) {
    //int a=2*2+5-2/2;
     //int b=9+a*3/3;
     //int c=9/3-7*3;
     //int d=7*3-9/3;
     // highest precedense * or / , they are evaluated on the basis of left to right associativity
   // System.out.println(c);
    // left to right precedense
   // System.out.println(d);

    //Quiz quick: How will you write the following expression in java:
    int x=9;
    int y=3;
    int l=x*y/9;
    int k=x/3*9;
    int b=9;
    int c=9;
    int a=4;
    int d=b*b-4*a*c/2*a;
    System.out.println(l);
    System.out.println(k);
    System.out.println(d);

}
}