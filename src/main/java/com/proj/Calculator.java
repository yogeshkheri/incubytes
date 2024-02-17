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
                List<String> testList = Arrays.asList(numbers.split(customDelimiter));
                checkNegativeNumbers(testList);
                return testList.stream().mapToInt(Integer::valueOf).sum();
            }else {
                List<String> testList = Arrays.asList(text.split(",|\n"));
                checkNegativeNumbers(testList);
                return testList.stream().mapToInt(Integer::valueOf).sum();
            }
        }
    }

    private static void checkNegativeNumbers(List<String> data){
        int[] dataArray = data.stream().mapToInt(Integer::valueOf).toArray();
        int[] negativeNumberArray = new int[dataArray.length];
        int count = 0;
        for (int j : dataArray) {
            if (j < 0) {
                negativeNumberArray[count] = j;
                count++;
            }
        }
        if(count > 0){
            throw new NumberFormatException("negative numbers not allowed "+Arrays.toString(negativeNumberArray));
        }
    }
}