package Arrays;

public class linearSearch {
    public static int linear_search(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 66, 7, 7, 8 };
        int num = 66;
        int result = linear_search(arr, num);
        if (result == -1) {
            System.out.print("Element do not exists ");
        } else {
            System.out.println("Element found at index : " + (result + 1));
        }

    }
}
