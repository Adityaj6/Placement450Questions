package Arrays;

public class largestElement {
    public static int largest_element(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The Largest element in the array is: " + largest_element(arr1));
    }
}
