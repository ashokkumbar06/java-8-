package com.java8.java8.Array;

import java.util.List;

public class findStartsWith1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 4, 14, 15, 1, 27, 17, 16);

        list.stream().map(e -> e + " ").filter(s -> s.startsWith("1")).forEach(System.out::print);
    }
}
