
import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        // weeks ----days name
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days in week:");
        int ndays=sc.nextInt();
        switch(ndays){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Satuday");
            break;
            default:
            System.out.println("invalid days");
        }
    }
}
