public class quickSort {
    public static void quick_sort(int array[], int low, int high) {
        if (low < high) {
            int partitionIndex = giveIndex(array, low, high);
            quick_sort(array, low, partitionIndex - 1);
            quick_sort(array, partitionIndex + 1, high);
        }
    }

    public static int giveIndex(int array[], int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quick_sort(arr, 0, arr.length - 1);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
