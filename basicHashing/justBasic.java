package basicHashing;

import java.util.*;

public class justBasic {
    public static void characterCount(String inpuString) {

        // Creating a hashmap containin char
        // as a key and occurances as a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // converting given string to char array
        char[] strArray = inpuString.toCharArray();

        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // if char is present in charCountMap,
                // incrementing its count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);

            } else {

                // if char is not present in charCountMap,
                // putting this char to charcountmap with 1 as its value
                charCountMap.put(c, 1);
            }

        }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // find the frequecy of element in the array
        // int n = read.nextInt();
        // int arr[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = read.nextInt();
        // }
        // // pre compute
        // int hash[] = new int[13];
        // for (int i = 0; i < n; i++) {
        // hash[arr[i]] += 1;
        // }
        // int q = read.nextInt();
        // while (q >= 0) {
        // int number = read.nextInt();
        // System.out.println(hash[number]);
        // q--;
        // }

        // find the frequency of character in array
        String name = read.nextLine();
        characterCount(name);

    }

}
