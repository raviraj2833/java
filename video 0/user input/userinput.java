import java.util.Scanner; 
public class userinput {
   
     public static void main(String[] args) {
        System.out.println("Taking input from User:");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number 1:");
        int a=sc.nextInt();
        System.out.println("Enter the second number 2:");
        int b=sc.nextInt();
        Scanner r=new Scanner(System.in);
      System.out.println("Enter the third number:");
      int c=r.nextInt();
      Scanner ankit=new Scanner(System.in);
      System.out.println("Enter the age of Aditya:");
      int age=ankit.nextInt();
      System.out.println("Enter the number which you want:");
      int i=sc.nextInt();
      System.out.println("Enter the value of a and b");
      Scanner sum=new Scanner(System.in);
      int a1=sum.nextInt();
      int b1=sum.nextInt();
      int Sum=a+b;
      System.out.println("The sum of two  number:");
      System.out.println(Sum);
      
     }
    }