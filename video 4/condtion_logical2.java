public class condtion_logical2 {
    public static void main(String[] args) {
        // for Logical AND &&
        boolean a = true;
        boolean b = true;
        boolean c = true;
        // logical AND &&
        // logical OR ||
        // logical NOT !
        if (a && b && c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // for logical OR ||
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a1 || b1 || c1) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        // logical NOT !

        boolean a2 = false;
        if (!a2) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

    }
}
