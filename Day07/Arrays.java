package com.hackerrank.thirtydaysofcode.Day07;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}