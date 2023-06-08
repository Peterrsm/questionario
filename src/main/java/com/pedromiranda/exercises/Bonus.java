package com.pedromiranda.exercises;

import java.text.DecimalFormat;

public class Bonus {

    public static void sqrt(Double value) {
        double i;
        double squareroot = value / 2;
        DecimalFormat df = new DecimalFormat();

        do {
            i = squareroot;
            squareroot = (i + (value / i)) / 2;
        } while ((i - squareroot) != 0);

        df.setMaximumFractionDigits(4);
        System.out.println("Resultado: " + df.format(squareroot));
    }
}
