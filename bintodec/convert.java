import java.util.Scanner;

public class convert {

    public static void main(String[] args){

        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,ans=0,mul=1;

    while(num>0)
    {
        rem=num%2;
        num=num/2;
        ans=rem*mul+ans;
        mul=mul*10;
    }
    System.out.println(ans);
    }
}