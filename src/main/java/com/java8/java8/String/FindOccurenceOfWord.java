package com.java8.java8.String;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfWord {

    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "apple", "orange", "apple", "apple");

        Map<String, Long> map8 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for (String s : map8.keySet()) {
            if (s.equals("apple")) {
                System.out.println("The apperance of apple is = " + map8.get(s));
                System.out.println();
            }
        }
        System.out.println();
        Long Java8 = list.stream().filter(w -> w.equals("apple")).count();
        System.out.println("The apperance of apple is = " + Java8);
    }
}
