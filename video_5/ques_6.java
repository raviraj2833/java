import java.util.Scanner;

public class ques_6 {
    public static void main(String[] args) {
         
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL of website:");
        String website=sc.next();
        if(website.endsWith(".org"))
{
    System.out.println("Organisation website");
}        
else if(website.endsWith(".com")){
System.out.println("Commercial website");
    } 
    else if(website.endsWith(".in")){
        System.out.println("Indian website");
    }
}

    }
