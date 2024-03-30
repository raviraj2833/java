import java.util.Scanner;

class randomnumber{
    private int guess;
 public int getguess(){
     return guess;
 }
 public void setguess(int n){
     this.guess=n;
 }

 }
public class exercise {
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        
        randomnumber first=new randomnumber();
        first.setguess(number);
        System.out.println(first.getguess() );
        

        // game is guess the number

        /*  Games have following method :
           1.constructor to generate the random number
           2.userInput() to take input from the user:
           3.iscorrectNumber() to detect whether the number is choosen by the user is correct or not:
           4.Number of getter and setter  for no of guess:
           Use properties of number of guesses etc to take this task done:
         * 
         */

         


    }
}