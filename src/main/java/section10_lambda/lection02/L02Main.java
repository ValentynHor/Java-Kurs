package section10_lambda.lection02;

import java.util.ArrayList;
import java.util.List;

public class L02Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("V");
        list.add("BOV");
        list.add("bye");
        list.add("H");

/*
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                else return 0;
            }
        });

*/

/*

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

*/
        list.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(list);


    }
}
