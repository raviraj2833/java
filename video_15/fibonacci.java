public class fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printfibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printfibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 3;
        System.out.println(n1 + "" + n2);
        printfibonacci(count - 2);

    }
}
