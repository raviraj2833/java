public class break_continue {

    public static void main(String[] args) {

        // break and continue statement:

        // 1. Break statement:
        // for(int i=0;i<=7;i++){
        // System.out.println(i);
        // if(i==3){
        // System.out.println(" ending the loop");
        // break;
        // }
        // }




        // using while loop for break statement:

        // int i=0;
        // while(i<9){
        // System.out.println(i);
        // if(i==3){
        // System.out.println("The loop is end.....");
        // break;
        // }
        // i++;
        // }


          // using do-while loop for break statement:

          //int i=1;
         // do{
           // if(i==5){
               // i++;
               // break;
           // }
           // System.out.println(i);
           // i++;
      //  }
          //  while(i<9);

          
       // 2.continue statement:
       // for(int i=0;i<=10;i++){
        //if(i==5){
       //     continue;
       // }
       //     System.out.println(i);
       // }
         
        // continue statement for while loop

       /*  *********************************/
       // int i=0;
       // while(i<9){
       //     if(i==4){
       //         i++;
       //         continue;
       //     }
       //     System.out.println(i);
       //     i++;
       // }

        // continue statement for do-while loop
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
        }
        while(i<9);
            System.out.println("loops end here");
         
    }
}