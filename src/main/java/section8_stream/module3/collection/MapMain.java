package section8_stream.module3.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Eins");
        map.put(2, "Zwei");
        map.put(3, "Drei");
        map.put(4, "Vier");
        map.put(5, "Fünf");
        map.put(6, "Sechs");
        map.put(7, "Sieben");
        map.put(8, "Acht");
        map.put(9, "Neun");

        System.out.println(map);
        System.out.println(map.get(5));
        System.out.println(map.get(15));

        System.out.println("******************************");

       /* for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + "  ");
        System.out.println("");
        }*/

        //Beliebige Reihenfolge
        Map<Integer, String> hashMap = new HashMap<>();

        //First come first out
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //Wird sortiert
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("hashmap");
        testMap(hashMap);
        System.out.println("linkedHashMap");
        testMap(linkedHashMap);
        System.out.println("treeMap");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(25, "Bob");
        map.put(15, "Mike");
        map.put(78, "Tom");
        map.put(27, "Valentyn");
        map.put(1550, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }

        System.out.println("");


    }

}
