public class array2D {
    public static void main(String[] args) {
             int [][] marks=new int[2][3];
             marks[0][0]=100;
             marks[0][1]=104;
             marks[0][2]=103;
             marks[1][0]=107;
             marks[1][1]=105;
             marks[1][2]=101;
            //  printing 2D array:
             for(int i=0;i<=marks.length;i++){
                for(int j=0;j<marks[i].length;j++)
                {
             System.out.println(marks[i][j]);
             System.out.println(" ");
             }
             //System.out.println("");
            }
            }
        }
    