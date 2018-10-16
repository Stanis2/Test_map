package tsi.stanislaw.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("HashMap:");
        Map<String, String> translations1 = new HashMap<>();

        translations1.put("one", "один");
        translations1.put("home", "дом");
        translations1.put("road", "дорога");

        //В свободном порядке.

        for (String k : translations1.keySet()) {
            System.out.printf("%s -> %s\n", k, translations1.get(k));
        }

        System.out.println("LinkedHashMap:");
        Map<String, String> translations2 = new LinkedHashMap<>();

        translations2.put("one", "один");
        translations2.put("home", "дом");
        translations2.put("road", "дорога");

        //В порядке добавления.

        for (String k : translations2.keySet()) {
            System.out.printf("%s -> %s\n", k, translations2.get(k));
        }

        System.out.println("TreeMap:");
        Map<String, String> translations3 = new TreeMap<>();

        translations3.put("one", "один");
        translations3.put("home", "дом");
        translations3.put("road", "дорога");

        //В порядке убывания-возрастания. "TreeMap<>(Comparator.reverseOrder());"

        for (String k : translations3.keySet()) {
            System.out.printf("%s -> %s\n", k, translations3.get(k));
        }
    }
}
