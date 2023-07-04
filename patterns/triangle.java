import java.util.*;

public class triangle {
    public static void tri(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        tri(n);
    }

}
