package BasicMath;

import java.util.*;

public class Alldivisors {
    public static void alldiv(int n) {
        System.out.println("All the divisor of " + n + "are: ");
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr1.add(i);
                if (n / i != i) {
                    arr1.add(n / i);
                }
            }
        }
        Collections.sort(arr1);
        System.out.println(arr1);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        alldiv(n);
    }
}
