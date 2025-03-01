package com.java8.java8.Array;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class finddublicatesAndRemove {

    public static void main(String[] args) {

        List<Integer> list = List.of(01, 1, 1, 2, 2, 32, 4, 5, 63, 77, 85, 9, 9);

        List<Integer> remove = list.stream().distinct().toList();
        System.out.println(remove);

        Map<Integer, Long> givecount = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        givecount.entrySet().stream().filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey() + "-> " + e.getValue()+" are there"));
    }
}
