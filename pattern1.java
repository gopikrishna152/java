public class pattern1 {
    public static void main(String[] args) {
        pattern4(5);
    }

    public static void pattern0(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void pattern1(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
    }

    // public static void pattern2(int rows) {
    // for (int i = 0; i < rows; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }
    // for (int i = 0; i < rows; i++) {
    // for (int j = rows - i; j > 0; j--) {
    // System.out.print("* ");
    // }
    // System.out.println(" ");
    // }
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // }

    public static void pattern3(int rows) {
        for (int i = 0; i < rows * 2; i++) {
            int totalcolsinrow = i > rows ? 2 * rows - i : i;
            int noofspaces = rows - totalcolsinrow;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalcolsinrow; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

            // *
            // * *
            // * * *
            // * * * *
            // * * *
            // * *
            // *
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i;
            for (int j = spaces; j > spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
