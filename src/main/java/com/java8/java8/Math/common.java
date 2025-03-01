package com.java8.java8.Math;

import java.util.List;
import java.util.Optional;

public class common {

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30, 40, 50);

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(max.get());

        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println(min.get());

        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

        long count = list.stream().count();
        System.out.println(count);
    }
}
