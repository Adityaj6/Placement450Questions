package BasicMath;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        // int count = 0;

        // Method 1
        // while (n > 0) {
        // count++;
        // n = n / 10;
        // }

        // method 2
        int count = (int) (Math.log10(n) + 1);
        System.out.println("No of Digit: " + count);
    }

}
