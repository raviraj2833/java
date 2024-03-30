import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
            System.out.println("You are become an adult!");
           break;
        case 21:
        System.out.println("You are going to join a job!");
        break;
        case 60:
        System.out.println("You are going to retaired!");
        break;
        default:
        System.out.println("Enjoy your life!");
    }
}
}