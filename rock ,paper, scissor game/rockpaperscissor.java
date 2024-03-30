import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        System.out.println("Now it's your turn:");
        int human=sc.nextInt();
        if(human==0)
        {
            System.out.println("You have choosen rock");
        }
         if(human==1)
        {
            System.out.println("You have choosen scissor");
        }
         if(human==2)
        {
            System.out.println("You have choosen paper");
        }
        System.out.println("Now computer's turn:");
        int computer=rc.nextInt(3);
        if(computer==0)
        {
            System.out.println("Computer choose scissor");
        }
         if(computer==1)
        {
            System.out.println("Computer choose rock");
        }
         if(computer==2)
        {
            System.out.println("computer choose paper");
        }
        if(human==computer)
        {
            System.out.println("Match is draw");
        }
        else if(human==0 && computer==2 || human==1 && computer==0|| human==2 && computer==1)
        {
            System.out.println("congratulation ! you have won");
        }
        else{
            System.out.println("Better luck next time");
        }

        
    }
}
