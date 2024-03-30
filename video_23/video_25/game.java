import java.util.Random;
import java.util.Scanner;
    class Game{
        public int number;
        public int inputNumber;
        public int noOfGuessess;
        public int getNoofguesses(){
            return noOfGuessess;
        }
        public void setNoofguesses(int noOfGuessess){
            this.noOfGuessess=noOfGuessess;
        }
     
        void Game(){
            Random rand=new Random();
    
        this.number=rand.nextInt();
    }
    void takeUserInput()
    {
        System.out.println("Guess the number: ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    
    }
    boolean isCorrectNumber(){
        if(inputNumber==number){
            return true;
        }
        else if(inputNumber<number){
        System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("too high...");
        }
        return false;
    }
     } 
    
    
    public class game {
    
        public static void main(String[] args){
            // Create a class  game ,which allows  a user to play "Guess the number game once . Game should have the following methods:"
            /*  1.constructor to generate the random number
            2.takeUserInput() to take a user input of number 
            3. isCorrectNumber()  to detect whether the number entererd by the users is true
            4. getter and setter for noOfGuessess
            5.use properties such as noOfGuessess(int) , etc  to get this task done:        * 
             */
    


             Game g=new Game();
             g.takeUserInput();
             boolean b=g.isCorrectNumber();
             System.out.println(b);
             
    
        }
    }
