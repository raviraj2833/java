import java.util.Scanner;

public class condition_3 {
    public static void main(String[] args) {
        System.out.println("Enter you age:");
        Scanner age=new Scanner(System.in);
        int y=age.nextInt();
        if(y>56)
        {
            System.out.println("you are applicable");
        }
        else if(y>46)
        {
            System.out.println("you are semi applicable");
        }
        else if(y>36)
        {
            System.out.println("You are not applicable");
        }
        else
        {
            System.out.println("not found");
        }

    }
}
