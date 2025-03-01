package com.java8.java8.String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurence {

    public static void main(String[] args) {

        String s = "Ganesha";

        Map<Character, Long> map = s.chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}