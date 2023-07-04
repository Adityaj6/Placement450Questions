import java.util.*;

public class pattern19 {
    public static void pattern19(int n) {
        int initalSpace = 0;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initalSpace; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initalSpace += 2;
            System.out.println();
        }
        int inispace = 8;
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < inispace; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            inispace -= 2;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        pattern19(n);
    }
}
