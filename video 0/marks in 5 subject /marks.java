import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("Taking input of marks from users");
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter marks in English:");
        int english=marks.nextInt();
        System.out.println("Enter marks in maths:");
        int maths=marks.nextInt();
        System.out.println("Enter marks in science:");
        int science=marks.nextInt();
        System.out.println("Enter marks in SocialScience:");
        int SocialScience=marks.nextInt();
        System.out.println("Enter the marks in computer:");
        int computer=marks.nextInt();
        int sum= english + maths+ science+SocialScience+computer;
        System.out.println("Sum of marks in 5 subject:");
        System.out.println(sum);
        float percentage=((sum)/500.0f)*100;
        System.out.println("Percentage in 5 subject:");
        System.out.println(percentage);
        
    }
}
