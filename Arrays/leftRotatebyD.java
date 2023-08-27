package Arrays;

public class leftRotatebyD {
    public static void bruteApproch(int arr[], int k) {
        k = k % (arr.length);
        int n = arr.length;
        int temp[] = new int[k];
        // copy
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // shifting
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];

        }

        // copy
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
            j++;
        }
        // showing rotated array
        System.out.print("The array after rotations using bruteforce approch is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int array[], int start, int end) {
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimalApproch(int arr[], int n, int k) {
        // reverse the first n-k elements
        reverseArray(arr, 0, k - 1);
        // reverse last k elements
        reverseArray(arr, k, n - 1);
        // reverse whole array
        reverseArray(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // bruteApproch(arr, 3);
        System.out.println(" ");
        optimalApproch(arr, 7, 3);
        // System.out.print("The array after rotation using optimal approch is : ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
