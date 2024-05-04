package section7_function;

import java.util.Arrays;

public class BinarySearchJDK {
    public static void main(String[] args) {
        // read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 30, 50, 100};
        int query = 80;
        // processing
        int index = Arrays.binarySearch(array, query);
        // display results
        System.out.println("Index=" + index);
    }
}