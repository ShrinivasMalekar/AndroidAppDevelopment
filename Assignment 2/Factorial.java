package com.company;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for its factorial");
        int f = sc.nextInt();

        int a=1, n =0, c=1;
        //int f = 5;
        n = f;
        while(n>0)
        {
            c = c*n;
            n--;

        }
        System.out.println("Factorial of "+f+" is "+c);

    }
}
