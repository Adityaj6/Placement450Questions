package BasicMath;

import java.util.*;

public class gCd {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println("The GCD of the two numbers is :" + gcd(a, b));

    }
}
