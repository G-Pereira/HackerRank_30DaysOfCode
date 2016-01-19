package com.hackerrank.thirtydaysofcode.Day02;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble();
        int T = sc.nextInt();
        int X = sc.nextInt();

        int final_price = (int) Math.round(M * (1 + (T / 100.0) + (X / 100.0)));
        System.out.println("The final price of the meal is $" + final_price + ".");
    }
}
