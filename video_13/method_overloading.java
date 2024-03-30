public class method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+"bro!");
        System.out.println("good morning "+b+"bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
//    static void telljoke(){
//     System.out.println("• What do you call a pony with a cough?\n" + //
//                 "\n" + //
//                 "A little horse.");
//    }
    public static void main(String[] args) {
        // telljoke();
       
        //  case 1: Changing the integer:


        // int x=45;
        // change(x);
        // System.out.println("the value of x after change:" +x);
       
     
    
        // case 2: Changing the array:.>>>>>>>>>>>>>  In case of Array reference is passed.Same is the case for object passing  methods:

        // int [] marks={23,54,34,89,76};
        // change2(marks);
        // System.out.println("The value of arr after change:"+marks[0]);

        // method Overloading:
        foo();
        foo(2000,4000);
        // arguments are actual...
    }

}