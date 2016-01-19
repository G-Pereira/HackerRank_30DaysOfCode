package com.hackerrank.thirtydaysofcode.Day17;

import java.util.Scanner;

class Calculator{
    public int power(int base, int exponent){
        if(base<0 || exponent<0) throw new IllegalArgumentException("n and p should be non-negative");
        return (int)Math.pow(base,exponent);
    }
}

public class Exceptions {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
