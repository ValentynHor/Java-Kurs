package section7_function;

public class BinarySearchIterative {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 10;
        // processing
        int index = binarySearchIterative(array, query);
        // display results
        System.out.println("Index=" + index);
    }

    private static int binarySearchIterative(int[] array, int query) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            //int middleIndex = (startIndex + endIndex) / 2;
            int middleIndex = (startIndex + endIndex) >>> 1;
            int middleValue = array[middleIndex];
            if (query > middleValue) {
                startIndex = middleIndex + 1;
            } else if (query < middleValue) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

}