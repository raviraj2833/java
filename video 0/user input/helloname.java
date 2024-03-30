import java.util.Scanner;

public class helloname {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner st=new Scanner(System.in);
        String name=st.next();
        System.out.println("Hello " + name + " have a good day ");
        System.out.println("What is your hobbies:");
        String hobbies=st.next();
        System.out.println("Nice " + hobbies + " is good game ");
        
    }
}
