public class question_string {
    public static void main(String[] args) {
        // question 1:
        String que1="Ravi kumar";
        String value=que1.toLowerCase();
        System.out.println(value);

        // question 2: to replace spaces with underscores:
        System.out.println(que1.replace(" ", "_"));

        // question 3: to fill in a letter template which looks like below:
           // letter="Dear<|name|> , Thanks a lot"
           // replace <|name|> with a string(some name):


          System.out.println("Letter=\"Dear<|name|> , Thanks a lot\"");
          System.out.println("replace <|name|> with a string(Ravi)");

           // question 4: to detect double and triple spaces in a string:
           String s2="Ravi     kumar";
           String s3="Raj      kumar";
           char space=' ';
     int answer=s2.indexOf(space);
           int answer1=s3.indexOf(space);
           System.out.println(answer1);
       System.out.println(answer);


       // question 5: to format the following letter using escape sequence character:
       //   letter="Dear Ravi, This java course is nice .thanks"

       System.out.println("Letter=\"Dear Ravi, This java is nice.Thanks\"");
        
    }
}