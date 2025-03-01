package com.java8.java8.Collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findDublicates {

    public static void main(String[] args) {

        List<Integer> list = List.of(01, 1, 1, 2, 2, 32, 4, 5, 63, 77, 85, 9, 9);

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey() + " ------>  " + e.getValue()));
    }
}