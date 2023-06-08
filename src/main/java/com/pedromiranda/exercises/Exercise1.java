package com.pedromiranda.exercises;

public class Exercise1 {

    public static void parseHexInt(String hexaText) {
        int radix = 16;
        boolean negative = false;
        int i = 0;
        int len = hexaText.length();
        int result = 0;
        while (i < len) {
            int digit = Character.digit(hexaText.charAt(i++), radix);
            result *= radix;
            result -= digit;
        }
        System.out.println(negative ? result : -result);
    }

}
