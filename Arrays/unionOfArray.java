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

    public static ArrayList<Integer> OptimalApproch(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                    i++;

                }

            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                    j++;
                }
            }
        }
        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
                i++;
            }
        }
        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
                j++;
            }
        }
        return union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        // ArrayList<Integer> Union = bruteForce(arr1, arr2);
        ArrayList<Integer> Union = OptimalApproch(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}
