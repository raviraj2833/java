import java.util.Scanner;

public class dowhileloop {

  public static void main(String[] args) {
    // do-while loop -----excute the code and check the condition:::::

    /*
     * int b=0;
     * do{
     * System.out.println(" " +b);
     * b++;
     * }
     * while(b<10);
     * }
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
     while (i <= n);
  }
}