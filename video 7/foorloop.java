import java.util.Scanner;

public class foorloop {

    public static void main(String[] args) {
        // syntax of for loop..... a for loop is usually used to excute a piece of code
        // for specific numbers of times;
        // for( initialize,boolean conditon,update)
        // {
        // statement;
        // }

        //

       /*  int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
        }*/
          /*  int n=9;
           for(int i=1;i<=n;i++){
            System.out.println(2*i+1);
           }

   /*  Decreament for loop
   for(int i=7;i!=0;i--){
    System.out.println(i);
    >>>>>>>>>>>>>>>>>   This loop keeps  running until i become 0;
   }
    * 


    */
      //for(int i=9;i!=0;i--){
      //  System.out.println(i);
     //  }
       
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the limit:  ");
       n=sc.nextInt();
       for(int i=n;i!=0;i--){
        System.out.println(i);
       }


    }
}