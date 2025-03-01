package com.java8.java8.Math;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class evenOddNum {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = list.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(even);

        List<Integer> odd = list.stream().filter(e -> e % 2 != 0).toList();
        System.out.println(odd);

        Map<Boolean, List<Integer>> both = list.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(both.get(true));
        System.out.println(both.get(false));

    }
}
