package Arrays;

public class secondLaegest {
    public static int second_largest(int arr[]) {
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }

        }
        return slargest;
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 1, 5, 9, 8, 10 };
        System.out.println(second_largest(array));
    }
}
