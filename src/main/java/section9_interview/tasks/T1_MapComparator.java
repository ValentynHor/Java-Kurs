package section9_interview.tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class T1_MapComparator {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of(
                "two",2,
                "three",3,
                "five",5,
                "one",1,
                "four",4
        );

        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);

        System.out.println("Unsorted:");
        nonSortedMap.entrySet().forEach(System.out::println);

        System.out.println("Sorted:");
        sortedMap.entrySet().forEach(System.out::println);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {
        return nonSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) ->e1, LinkedHashMap::new

                ));
    }

    /*
    //Old
    private static Map<String, Integer> sortByValue(Map<String, Integer> nonSortedMap) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(new MyMapComparator(nonSortedMap));

        sortedMap.putAll(nonSortedMap);

        return  sortedMap;
    }
    static class MyMapComparator implements Comparator<String>{

        private final Map <String, Integer> map;

        MyMapComparator(Map<String, Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(String o1, String o2) {
            return map.get(o1)-map.get(o2);
        }
    }
    */

   /*
   //ChatGPT
   private static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {

        Map<String, Integer> sortedMap = new TreeMap<>(Comparator.comparing(unsortedMap::get));

        sortedMap.putAll(unsortedMap);

        return sortedMap;
    }
    */
}
