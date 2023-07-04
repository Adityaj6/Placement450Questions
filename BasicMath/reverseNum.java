package BasicMath;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int revNum = 0;
        while (n > 0) {
            int ld = n % 10;
            n = n / 10;
            revNum = (revNum * 10) + ld;


        }
        System.out.println(revNum);
    }
}
