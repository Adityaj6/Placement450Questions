import java.util.Scanner;

public class insertionSort {
    public static void insertion_Sort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int n = read.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("Array before sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        insertion_Sort(arr);
        System.out.println("Array array sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}