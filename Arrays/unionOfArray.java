package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class unionOfArray {
    // Solution 1
    public static ArrayList<Integer> bruteForce(int arr1[], int arr2[]) {
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        for (int it : s) {
            union.add(it);
        }
        return union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = bruteForce(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
