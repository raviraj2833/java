import java.util.Scanner;

public class convert3 {

    public static void main(String[] args){
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num >9){
        int rem,ans=0,mul=1;
        while(num>0){
            rem=num%10;
            num=num/10;
            ans=ans+rem;
        }
        num=ans;
        }
       System.out.println(num);
    }
    
}
