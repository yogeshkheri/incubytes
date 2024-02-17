package com.proj;


import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static int add(String text) {
        if (text.isEmpty()) { // condition for empty string
            return 0;
        } else if (text.contains(",")) { // condition for any number values like 1,2,3
            List<String> testList = Arrays.asList(text.split(","));
            return testList.stream().mapToInt(Integer::valueOf).sum();
        } else { // condition for other values
            return convertToInt(text);
        }
    }

    private static int convertToInt(String text) throws NumberFormatException{
        return Integer.parseInt(text);
    }
}
