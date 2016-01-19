package com.hackerrank.thirtydaysofcode.Day09;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gcd = find_gcd(in.nextInt(), in.nextInt());
        System.out.println(gcd);
    }

    static int find_gcd(int a, int b) {
        if (a == b) return a;
        if (a > b) return find_gcd(a - b, b);
        else return find_gcd(b - a, a);
    }
}
