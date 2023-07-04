import java.util.*;

public class pattern12 {
    public static void pattern12(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 0; i < n; i++) {

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }

    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        pattern12(n);
    }
}
