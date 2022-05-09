package lesson_8;

import java.util.*;

public class WordsCheck {
    public static void checkWords() {
        List<String> collection = new ArrayList<>();
        collection.add("pop");
        collection.add("top");
        collection.add("nope");
        collection.add("cort");
        collection.add("board");
        collection.add("pop");
        collection.add("pop");
        collection.add("top");
        collection.add("nope");
        collection.add("cort");
        collection.add("board");
        collection.add("board");
        collection.add("board");

        System.out.println("Number of repeated words: ");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String o : collection) {
            Integer count = counterMap.get(o);
            if (count == null) {
                count = 0;
            }
            counterMap.put(o, ++count);
        }
        for (Object o : counterMap.keySet()) {
            System.out.println(o + ": " + counterMap.get(o));
        }

        System.out.println("__________________________");

        System.out.println("Unique words: ");
        Set<String> collection2 = new HashSet<>(collection);

        for (Object o : collection2) {
            System.out.println(o);
        }

        System.out.println("__________________________");
    }
}