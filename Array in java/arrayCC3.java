 import java.util.*;

public class arrayCC3 {
   public static int getlargest(int number[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
    if(largest<number[i]){
        largest=number[i];
    }
}
return largest;
   }
    public static void main(String args[]){
    int number[]={2,8,9,4,5,7};
    System.out.println("The laregst element at: "+getlargest(number));
    
    }

    }
