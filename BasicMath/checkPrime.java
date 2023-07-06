package BasicMath;

import java.util.Scanner;

public class checkPrime {
    public static void checkPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        checkPrime(n);
    }
}
