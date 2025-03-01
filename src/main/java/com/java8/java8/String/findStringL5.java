package com.java8.java8.String;

import java.util.List;

public class findStringL5 {

    public static void main(String[] args) {

        List<String> list = List.of("ashoka", "ravi", "kary", "sucsses");

        list.stream().filter(e -> e.length() > 5).forEach(System.out::println);
    }
}