package com.proj;


public class Calculator {
    public static int add(String text) {
        if(text.isEmpty()){ // condition for empty string
            return 0;
        }else { // condition for other values
           return Integer.parseInt(text);
        }
    }
}
