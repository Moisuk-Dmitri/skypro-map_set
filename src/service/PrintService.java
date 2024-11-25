package service;

import java.util.*;

public abstract class PrintService {
    public static List<Integer> printOnlyOdd(List<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersList.remove(i);
                i--;
            }
        }

        return numbersList;
    }

    public static List<Integer> printEvenUniqueOrdered(List<Integer> numbersList) {
        Set<Integer> numbersSet = new HashSet<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersSet.add(numbersList.get(i));
            }
        }

        List<Integer> sortedNumberList = new ArrayList<>(numbersSet);
        Collections.sort(sortedNumberList);

        return sortedNumberList;
    }

    public static Set<String> printUniqueWords(List<String> strList) {
        Set<String> strSet = new HashSet<>(strList);

        return strSet;
    }

    public static Map<String, Integer> printNumberOfUniqueWords(List<String> strList) {
        Map<String, Integer> strMap = new HashMap<>();
        for (String s : strList) {
            if (!strMap.containsKey(s)) {
                strMap.put(s, 1);
            } else {
                strMap.put(s, strMap.get(s) + 1);
            }
        }

        return strMap;
    }
}
