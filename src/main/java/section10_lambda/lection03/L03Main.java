package section10_lambda.lection03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L03Main {

    public static void main(String[] args) {

        System.out.println("MAP");

        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        /*for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        }*/
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();

        list = list.stream().map(a -> a * 2).toList();


        System.out.println("Neue Elemente:");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);


        System.out.println("FILTER");
        arr = new int[10];
        list = new ArrayList<>();
        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        arr = Arrays.stream(arr).filter(a -> a % 2 == 0).toArray();

        list = list.stream().filter(a -> a % 2 == 0).toList();


        System.out.println("Neue Elemente:");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        System.out.println("REDUCE");
        arr = new int[10];
        list = new ArrayList<>();
        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        int sum1 = Arrays.stream(arr).reduce(Integer::sum).getAsInt();

        int sum2 = list.stream().reduce((acc, a) -> acc * a).get();


        System.out.println("Neue Elemente:");
        System.out.println(sum1);
        System.out.println(sum2);


    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
