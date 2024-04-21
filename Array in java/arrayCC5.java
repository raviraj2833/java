import java.util.*;
public class arrayCC5 {
    public static void reversed(int number[]){
        int start=0,last=number.length-1;
        while(start<last)
        {
            // swapping
            int temp=number[last];
            number[last]=number[start];
            number[start]=temp;
    
        start++;
        last--;
        }
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        reversed(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    
}
