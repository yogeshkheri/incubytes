package com.proj;


import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static int add(String text) {
        if (text.isEmpty()) { // condition for empty string
            return 0;
        } else { // condition for other values
            if(text.startsWith("//")){
                Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
                m.matches();
                String customDelimiter = m.group(1);
                String numbers = m.group(2);
                return Arrays.stream(numbers.split(customDelimiter)).mapToInt(Integer::valueOf).sum();
            }else {
                List<String> testList = Arrays.asList(text.split(",|\n"));
                return testList.stream().mapToInt(Integer::valueOf).sum();
            }
        }
    }
}