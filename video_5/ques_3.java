import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        // cacluate income tax paid by an employee to the government as per the slabs mentioned below:
        // income slab     Tax
        // 2.5l-5.0L       5%
        // 5.0L-10.0L      20%
        // above 10.0L     30%
          double tax=0;
        double income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income range from income slab (in lakh ):");
        income=sc.nextDouble();

        if(income<250000)
        {
            tax=tax+0;
        }

        if(income>=250000 && income<=500000){
            tax=0.05*(income-250000);
        }
        else if(income>500000 && income<=1000000)
        {
            tax=tax + 0.05*(500000-250000);
            tax= tax + 0.20*(income-500000);
            
        }
        else if(income>1000000)
        {
            tax=tax+0.05*(500000-250000);
            tax=tax+0.20*(1000000-500000);
            tax=0.30*(income-1000000);
        }
        System.out.println("The tax you have to pay " +tax);
        
        
    }
}
