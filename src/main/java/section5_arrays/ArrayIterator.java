package section5_arrays;

public class ArrayIterator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //fori
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //array.for
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}