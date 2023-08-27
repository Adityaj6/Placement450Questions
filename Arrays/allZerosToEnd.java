package Arrays;

import java.util.ArrayList;

public class allZerosToEnd {
    public static void bruteForce(int arr[]) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int nofE = temp.size();
        for (int i = 0; i < nofE; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nofE; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static int[] optimalApproch(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return arr;
        }
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 0, 4, 5, 0, 4, 0, 7 };
        // bruteForce(arr);
        optimalApproch(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
