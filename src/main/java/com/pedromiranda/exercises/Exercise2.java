package com.pedromiranda.exercises;

public class Exercise2 {
    public static void sumhighest(Integer[] numbers) {
        numbers = orderArray(numbers);
        Integer first = numbers[0];
        Integer second = numbers[1];
        Integer sum = first + second;

        System.out.println(first + " + " + second + " = " + sum);
    }

    private static Integer[] orderArray(Integer[] array){
        int size = array.length;

        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-1; j++) {
                if (array[j] < array[j + 1]) {
                    int aux = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return  array;
    }
}
