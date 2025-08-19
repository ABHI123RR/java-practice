public class reversepattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {       // outer loop (rows)
            for (int j = 1; j <= i; j++) {   // inner loop (stars per row)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
