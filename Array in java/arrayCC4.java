import java.util.*;
public class arrayCC4 {

    public static int binarySearch(int number[],int key){
        int start=0,end=number.length-1;
       
        while(start<=end){
            int mid=(start+end)/2;
        
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int number[]={3,6,4,5,9,8};
        int key=9;
        System.out.println("Index for the key: "+binarySearch(number, key));
    }
}