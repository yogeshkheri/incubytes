package com.proj;


import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static int add(String text) {
        if (text.isEmpty()) { // condition for empty string
            return 0;
        } else { // condition for other values
            List<String> testList = Arrays.asList(text.split(",|\n"));
            return testList.stream().mapToInt(Integer::valueOf).sum();
        }
    }
}