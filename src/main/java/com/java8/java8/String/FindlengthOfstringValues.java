package com.java8.java8.String;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindlengthOfstringValues {

    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "cherry", "grape", "lemon", "mango");

        list.stream().map(s -> s + "=" + s.length()).forEach(System.out::println);
        System.out.println("using map -> ");
        Map<String, Long> ans = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (String s : ans.keySet()) {
            System.out.print(" ");
            System.out.print(s + " " + ans.get(s));
        }

    }
}