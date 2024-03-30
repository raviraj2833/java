import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        // taking input as marks to determine the pass or fail and also get 40% in whole
        // three subject or 33% at least to pass in each subject;

        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Physics :");
        m1 = sc.nextByte();
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter marks in Chemistry :");
        m2 = sd.nextByte();
        Scanner st = new Scanner(System.in);
        System.out.println("Enter marks in Mathematics :");
        m3 = st.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("your overall percentage is: " +avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) 
        {
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }

    }
}
