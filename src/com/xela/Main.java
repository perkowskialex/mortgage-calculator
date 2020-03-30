package com.xela;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner mortgage = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        int principal = mortgage.nextInt();
        System.out.println("Enter Annual Interest Rate: ");
        float interestRate = mortgage.nextFloat();
        // 100 percent, 12 months in a year
        float monthlyInterest = interestRate / 100 / 12;
        System.out.println("Enter period in years");
        byte period = mortgage.nextByte();
        int numberOfPayments = period * 12;

        double result = principal*(monthlyInterest* Math.pow(1 +monthlyInterest, numberOfPayments))/(Math.pow(1+monthlyInterest, numberOfPayments) -1);


        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + interestRate);
        System.out.println("Period (Years): " + period);
        System.out.println("Mortgage Payment: " + result);
    }
}
