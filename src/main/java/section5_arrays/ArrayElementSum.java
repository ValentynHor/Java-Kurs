package section5_arrays;

public class ArrayElementSum {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        var sum = 0;
        for (int value : array) {
            sum += value;
        }

        System.out.println(sum);
    }
}