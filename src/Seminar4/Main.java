package Seminar4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, Set<String>> newmap = new HashMap<>();
        // add elements in dict
        map.put("1", "a");
        map.put("2", "a");
        map.put("3", "b");
        map.put("4", "b");
        System.out.println("Стандартный \n" + map.toString());

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String oldVal = entry.getValue();
            String oldKey = entry.getKey();
            Set<String> newVal = null;

            if (newmap.containsKey(oldVal)) {

                newVal = newmap.get(oldVal);
                newVal.add(oldKey);
            } else {
                newVal = new HashSet<>();
                newVal.add(oldKey);
            }
            newmap.put(oldVal, newVal);
        }
        System.out.println("Перевернутый \n " + newmap.toString());
    }
}