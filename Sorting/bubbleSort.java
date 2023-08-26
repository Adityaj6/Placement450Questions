package Sorting;

import java.util.*;

public class bubbleSort {
    public static void bubble_Sort(int array[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = read.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements to sort:");
        for (int i = 0; i <= array.length; i++) {
            array[i] = read.nextInt();
        }
        bubble_Sort(array, n);

    }
}
