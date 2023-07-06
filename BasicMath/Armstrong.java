package BasicMath;

import java.util.*;

public class Armstrong {
    /*
     * public static void armstrong(int n) {
     * int dup = n;
     * int len = n;
     * int sum = 0;
     * while (n > 0) {
     * 
     * int mulLd = 1;
     * while (len > 0) {
     * int ld = len % 10;
     * System.out.println(mulLd);
     * System.out.println(ld + "last digit");
     * mulLd = mulLd * ld;
     * len = len / 10;
     * }
     * sum = sum + mulLd;
     * System.out.println(sum);
     * n = n / 10;
     * 
     * }
     * if (sum == dup) {
     * System.out.println("Yes it is an armstrong number.");
     * } else {
     * System.out.println("Not an armstrong number.");
     * }
     * }
     */
    public static boolean armstrong(int n) {
        int originalno = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumOfpower = 0;
        while (n != 0) {
            int digit = n % 10;
            sumOfpower += Math.pow(digit, count);
            n /= 10;

        }
        return (sumOfpower == originalno);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if (armstrong(n)) {
            System.out.println("yes , it is an armstrong number \n");
        } else {

            System.out.println("No , it is not an armstrong number\n");
        }
    }
}
