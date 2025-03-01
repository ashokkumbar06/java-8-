package com.java8.java8.String;

import java.util.Map;
import java.util.stream.Collectors;

public class finddublicateRemove {

    public static void main(String[] args) {
        String s = "ashoka";

        String removeDublicate = s.chars().mapToObj(e -> (char) e).distinct().map(e -> String.valueOf(e))
                .collect(Collectors.joining());
        System.out.println(removeDublicate);

        Map<Character, Long> map = s.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        System.out.println();
    }
}
