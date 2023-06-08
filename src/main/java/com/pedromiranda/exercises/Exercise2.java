package com.pedromiranda.exercises;

import java.util.Arrays;

public class Exercise2 {
    public static void sumhighest(Integer[] numbers) {
        Arrays.sort(numbers);

        Integer size = numbers.length - 1;
        Integer first = numbers[size];
        Integer second = numbers[size-1];
        Integer sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }
}
