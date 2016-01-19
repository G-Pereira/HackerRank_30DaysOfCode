package com.hackerrank.thirtydaysofcode.Day10;

import java.util.Scanner;

public class Binary_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            System.out.println(binary(n));
        }
    }

    public static String binary(int n) {
        if (n > 0) return binary(n / 2) + n % 2;
        else return "";
    }
}
