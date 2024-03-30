public class array {

    public static void main(String[] args) {
        // int [] marks={24,23,90,76,25};
        // for(int i=marks.length;i>0;i--){
        //     System.out.println(marks[i]);
        // }
        // float [] marks={23.5f,56.5f,34.6f,87.6f,79.5f};
        // String [] students={"Ravi","Monu","Rahul","Sonu","Dev"};
   

        // below method is normal or native method:

        // System.out.println(marks.length);<<<<<< marks.length show how many elements are you taking ;
        // System.out.println(marks.length);
        // System.out.println(students.length);

        // DISPLAY ALL THE ELEMENTS OF AN ARRAY ONCE TIME>>>>>>>>>>>> THE METHOD IS KNOWN AS (FOR EACH LOOP)
        int [] marks={13,76,45,34,87};
         for(int elements:marks){
            System.out.println(elements);
         }

        // question 1: wwrite a program to print an array of elements in reverse order:
        //  int [] arr={2,7,3,5,9};
        //  for(int i=arr.length-1;i>=0;i--){
        //  System.out.println(arr[i]);
        //  }
    }
}