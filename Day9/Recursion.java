package com.hackerrank.thirtydaysofcode.Day9;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(gdc(in.nextInt(), in.nextInt()));
    }

    public static int gdc(int x, int y) {
        if (x == y) {
            return x;
        }
        if (x > y) {
            return gdc(x - y, y);
        } else {
            return gdc(y - x, x);
        }
    }
}
