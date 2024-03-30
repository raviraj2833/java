import java.util.Scanner;

public class conditon_logical {
    public static void main(String[] args) {
        System.out.println("Enter the age of person:");
        Scanner age=new Scanner(System.in);
        int y=age.nextInt();
        if(y>=15 && y<=25)
        {
            System.out.println("Yes you can drive!");
        }
        else
        {
            System.out.println("No you cannot drive!");
        }
    }
}
