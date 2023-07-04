package BasicMath;

import java.util.Scanner;

public class chechPalin {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int original = n;
        int revNum = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            revNum = (revNum * 10) + ld;

        }
        System.out.println(revNum);
        if (revNum == original) {
            System.out.println("Yes it is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}