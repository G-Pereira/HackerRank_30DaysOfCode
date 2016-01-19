package com.hackerrank.thirtydaysofcode.Day5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int T, a, b, N, r;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            N = sc.nextInt();
            r = 0;
            for (int k = 0; k < N; k++) {
                if (k == 0) r = a;
                r += (Math.pow(2, k)) * b;
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
