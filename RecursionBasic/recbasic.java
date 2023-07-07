package RecursionBasic;

import java.util.Scanner;

public class recbasic {
    static int count = 0;

    public static void print() {
        if (count == 4) {
            return;
        }
        System.out.println(count);
        count++;
        print();
    }

    public static void name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Aditya");
        name(i + 1, n);
    }

    public static void Numbern(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        Numbern(i + 1, n);
    }

    public static void Numberrev(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        Numberrev(i - 1, n);
    }

    public static void backNumber(int i, int n) {
        if (i > n) {
            return;
        }
        backNumber(i + 1, n);
        System.out.print(i);

    }

    public static void sumN(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumN(i - 1, sum + i);
    }

    public static int funSumN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + funSumN(n - 1);

    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        // print();

        // Print name n times
        // name(1, n);

        // print number from 1 to n
        // Numbern(1, n);

        // print number from n to 1
        // Numberrev(n, n);

        // print number from n to 1 using backtracking
        // backNumber(1, n);

        // sum of first n numbers(parameterized)
        // sumN(n, 0);

        // sum of first n numbers(functional)
        // System.out.println(funSumN(n));

        // factorial of n number
        // System.out.println(fact(n));
    }
}
