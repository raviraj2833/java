public class varArg {

    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b,int c,int d){
    //     return a+b+c+d;
    // }
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // Here we are using Variable arguements ::::::
    static int sum(int x ,int ...arr){
        // available as int [] array
        int result=x;
    for(int a: arr ){
        result+=a;
    }
    return result;
    }
    public static void main(String[] args) {
      System.out.println("Welcome in VarArgs tutorials:");  
      System.out.println("the sum of 3:" +sum(3));  
      System.out.println("the sum of 1 :" +sum(1));  
      System.out.println("The sum of 3,5 and 4 is: " +sum(3,5,4));
      System.out.println("The sum of 2,3,4 and 8: " +sum(2,3,4,8));
      System.out.println("The sum of 2 and 8: " +sum(2,8));
      System.out.println("The sum of 2 ,4,6,7,8,and 8: " +sum(2,4,6,7,8,8));
    }
}