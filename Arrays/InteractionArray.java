package Arrays;

import java.util.ArrayList;

public class InteractionArray {
    public static ArrayList<Integer> optimalApproch(int a[], int b[]) {
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                ans.add(a[i]);
                i++;
                j++;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> result = optimalApproch(arr1, arr2);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
