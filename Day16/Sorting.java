package com.hackerrank.thirtydaysofcode.Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        arr = Arrays.stream(arr).distinct().sorted().toArray();
        int mind = 100000000;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = (int) Math.abs(arr[i] - arr[i + 1]);
            if (diff < mind) {
                mind = diff;
                ans.setLength(0);
                ans.append(arr[i] + " " + arr[i + 1] + " ");
            } else if (diff == mind) {
                ans.append(arr[i] + " " + arr[i + 1] + " ");
            }
        }

        System.out.print(ans);
    }
}
