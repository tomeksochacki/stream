package com.company;

import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        int n = 1000*1000;
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + i;

        }


        System.out.println("Rozwiązanie 1 " + sum);


        //1 10
        //2  9
        //3  8
        //4  7
        //5  6

        sum = (n+1) * n/2;
        System.out.println("Rozwiązanie 2 " + sum);
    }

}
