import java.util.*;

class rectangle {

    public static void main(String[] args) {
        // System.out.println("hello ");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of row of pattern");
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}