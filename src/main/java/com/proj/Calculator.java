package com.proj;


public class Calculator {
    public static int add(String text) {
        if (text.isEmpty()) { // condition for empty string
            return 0;
        } else if (text.contains(",")) { // condition for two values like 1,4
            String[] splitText = text.split(",");
            return convertToInt(splitText[0]) + convertToInt(splitText[1]);
        } else { // condition for other values
            return convertToInt(text);
        }
    }

    private static int convertToInt(String text) throws NumberFormatException{
        return Integer.parseInt(text);
    }
}
