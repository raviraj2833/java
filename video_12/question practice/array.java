public class array {
    
    public static void main(String[] args) {
        //  Question 1:
        // float [] marks={2.5f,2.6f,1.5f,1.9f,2.0f};
        // float sum=0;
        // for(float elements:marks)
        // {
        //     sum=sum+elements;
        // }
        //  System.out.println("the value of sum " +sum);

         // Question 2:
          
         float [] marks={2.5f,2.6f,1.5f,1.9f,2.0f};
         float num=1.9f;
          boolean isInArray=false;
         for(float element:marks){
            if(num==element)
            {
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in this array");
        }
            else
            {
                System.out.println("the value  is not present in this array");
            }
          }
         }
