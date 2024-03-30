import java.util.Scanner;

public class question_loops {

    public static void main(String[] args) {
        // question 1: to make reversed right angled star pattern using any loop:
        // int i;
        // int j;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the limit: ");
        // int n=sc.nextInt();
        // for( i=n;i>=0;i--){
        // for(j=0;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println("\n");
        // }
        // }

        // question 2: write a program to sum of first n even number using while loop
        // int n;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the limit");
        // n=sc.nextInt();
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        // sum=sum+(2*n);
        // }
        // System.out.println("Sum of first n even number");
        // System.out.println(sum);
        // 0 2 4 6

        // question 3: write a program to print multiplication table of a given number
        // n;
        // int n=4;
        // for(int i=1;i<=10;i++){
        // int mul=n*i;
        // System.out.println(mul);
        // }

        // question 4: Write a program to print multiplication tbale of 10 in reverse
        // order :
        // int n=10;
        // for(int i=10;i>=1;i--){
        // int mul=n*i;
        // System.out.println(mul);
        // }

        // question 5: Write a program to print factorial of any number;
        // int n=4;
        // int fact=1;
        // for(int i=1;i<=n;i++){
        // fact=fact*i;
        // }
        // System.out.println("Factorial of " +n+ "is:"+fact);

        // question 6:
        // facorial of any number using while loop
        int i = 1;
        int n = 5;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

    }
}
