package com.company;

import java.util.Scanner;

class Main3 {

    public static void swap(int a, int b){
        int numberToCompare = a;
        a = b;
        b = numberToCompare;
        System.out.println("a = " + a + " b + " + b);
    }




    public static void main(String[] args) {

        swap(3,5);


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number first.");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the number second.");
        int secondNumber = scanner.nextInt();

        System.out.println("Value before: ");
        System.out.println(firstNumber + " " + secondNumber);

        int numberToCompare = firstNumber;
        firstNumber = secondNumber;
        secondNumber = numberToCompare;

        System.out.println("Value after: ");
        System.out.println(firstNumber + " " + secondNumber);*/
    }
}
