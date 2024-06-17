package section9_interview.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        // Hinzufügen von Schlüssel-Wert-Paaren
        map.put("Key1", 1);
        map.put("Key2", 2);
        map.put("Key3", 3);
        map.put("Key3", 5);
        
        // Zugreifen auf Werte
        System.out.println("Wert von Key1: " + map.get("Key1")); // Ausgabe: 1
        
        // Iterieren über die Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Entfernen von Einträgen
        map.remove("Key2");
        
        // Map nach dem Entfernen eines Eintrags
        System.out.println("Map nach dem Entfernen: " + map);
    }
}