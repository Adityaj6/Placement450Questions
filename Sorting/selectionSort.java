package Sorting;

import java.util.*;
import java.util.Scanner;

public class selectionSort {
    public static void selectionSort(int array[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void swap(int array1, int array2) {
        int temp = array1;
        array1 = array2;
        array2 = temp;
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n = read.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the element to sort :");
        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }
        selectionSort(array, n);
        print(array);

    }
}
