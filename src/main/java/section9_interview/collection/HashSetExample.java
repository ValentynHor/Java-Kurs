package section9_interview.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        // Hinzufügen von Elementen
        set.add("Element1");
        set.add("Element2");
        set.add("Element3");
        
        // Versuch, ein Duplikat hinzuzufügen
        set.add("Element1"); // Wird nicht hinzugefügt, da bereits vorhanden
        
        // Iterieren über das Set
        for (String element : set) {
            System.out.println(element);
        }
        
        // Entfernen von Elementen
        set.remove("Element2");
        
        // Set nach dem Entfernen eines Elements
        System.out.println("Set nach dem Entfernen: " + set);
    }
}