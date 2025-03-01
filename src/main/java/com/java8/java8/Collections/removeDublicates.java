package com.java8.java8.Collections;

import java.util.List;

public class removeDublicates {

    public static void main(String[] args) {

        List<Integer> list = List.of(01, 1, 1, 2, 2, 32, 4, 5, 63, 77, 85, 9, 9);

        List<Integer> output = list.stream().distinct().toList();

        System.out.println(output);
    }
}
