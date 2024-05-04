package section5_arrays;

public class ArrayElementCount {
    public static void main(String[] args) {

        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 4;

        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }

        System.out.println(count);
    }
}