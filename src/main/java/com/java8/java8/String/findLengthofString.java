package com.java8.java8.String;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findLengthofString {

    public static void main(String[] args) {

        List<String> list = List.of("ashoka", "ravi", "kary", "sucsses");

        Map<Integer, List<String>> ans = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(ans);

    }
}
