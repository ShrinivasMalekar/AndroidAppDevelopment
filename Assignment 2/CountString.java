package com.company;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement: ");
        String s = sc.nextLine();

        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                a++;
        }

        System.out.println("Total characters in the statement is " + a);
    }
}