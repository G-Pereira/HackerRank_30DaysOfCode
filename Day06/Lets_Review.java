package com.hackerrank.thirtydaysofcode.Day06;

import java.util.Scanner;

public class Lets_Review {
    public static void main(String[] args) {
        int s, n;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            n = s;
            for (int j = 0; j < s - i - 1; j++) {
                System.out.print(" ");
                n--;
            }
            for (int k = 0; k < n; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
