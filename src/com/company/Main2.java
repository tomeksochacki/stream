package com.company;

import java.math.BigInteger;

class Main2 {
    public static void main(String[] args) {

        BigInteger bOne = new BigInteger("92233720368547758011");
        BigInteger bTwo = new BigInteger("1092940595069705960495069");

        BigInteger bSum;
        bSum = bOne.add(bTwo);
        System.out.println("summ " + bSum);

        BigInteger bMinus;
        bMinus = bOne.subtract(bTwo);
        System.out.println("substrack " + bMinus);

        BigInteger bMultiply;
        bMultiply = bOne.multiply(bTwo);
        System.out.println("multiply " + bMultiply);

        BigInteger bDivide;
        bDivide = bOne.divide(bTwo);
        System.out.println("divide " + bDivide);

        BigInteger bPow;
        bPow = bOne.pow(12);
        System.out.println("pow " + bPow);

        BigInteger bAbs;
        bAbs = bOne.abs();
        System.out.println("abs " + bAbs);

    }
}
