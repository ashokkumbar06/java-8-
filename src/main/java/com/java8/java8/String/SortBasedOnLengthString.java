package com.java8.java8.String;

import java.util.Comparator;
import java.util.List;

public class SortBasedOnLengthString {

    public static void main(String[] args) {

        System.out.println("Sorting based on first letter");

        List<String> list = List.of("joy", "ashok", "kartkeyan", "ravi");

        list.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting based on length");

        list.stream().sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}