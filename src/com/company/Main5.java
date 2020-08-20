package com.company;

import java.text.DecimalFormat;

class Main5 {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        String test = "Tomek";
        String test2 = new String("Tomek");

        System.out.println(test.equals(test2));
        System.out.println(test == test2);
        int maxValue = Integer.MAX_VALUE-100;
        float maxValue2 = Integer.MAX_VALUE-100;

        String maxInteger = decimalFormat.format(maxValue);
        String maxFloat = decimalFormat.format(maxValue2);

        System.out.println(maxInteger);
        System.out.println(maxFloat);

        boolean bear = true;
        boolean alcohol = false;

        System.out.println(bear && alcohol);
        System.out.println(bear || alcohol);
    }
}
