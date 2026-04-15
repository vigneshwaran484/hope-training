

import java.util.LinkedHashMap;

public class LinkedHashMapImplementation {
    public static void main(String[] args) {
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("One", 1);
            linkedHashMap.put("Two", 2);
            linkedHashMap.put("Three", 3);
            linkedHashMap.put("Four", 4);
            System.out.println(linkedHashMap);
    }
}
//LinkedHashMap maintains the insertion order of the elements. It is a hash table and linked list implementation of the Map interface, with predictable iteration order.
