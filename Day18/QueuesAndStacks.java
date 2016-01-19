package com.hackerrank.thirtydaysofcode.Day18;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Palindrome {
    Stack st = new Stack();
    LinkedList queue;
    void pushCharacter(char ch)
    {
        st.push(ch);
    }
    char popCharacter()
    {
        return (char)st.pop();
    }
    Palindrome()
    {
        queue = new LinkedList();
    }
    void enqueueCharacter(char ch)
    {
        queue.add(ch);
    }
    char dequeueCharacter()
    {
        return (char)queue.remove();
    }
}

public class QueuesAndStacks {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // read the string s.
    String s = sc.nextLine();

    // create the Palindrome class object p.
    Palindrome p = new Palindrome();
    char arr[]=s.toCharArray();//Converting string to a character array
    // push all the characters of string s to stack.
    for (char c : arr) {
        p.pushCharacter(c);
    }

    // enqueue all the characters of string s to queue.
    for (char c : arr) {
        p.enqueueCharacter(c);
    }

    boolean f = true;

    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length(); i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            f = false;
            break;
        }
    }

    // finally print whether string s is palindrome or not.
    if (f) {
        System.out.println("The word, "+s+", is a palindrome.");
    } else {
        System.out.println("The word, "+s+", is not a palindrome.");
    }
}

}
