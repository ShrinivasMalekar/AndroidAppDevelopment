package com.company;
import java.util.Scanner;
public class Sunny
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        double n = sc.nextDouble();
        double x = n+1;
        double sqr = Math.sqrt(x);
       //ouble i = 5;
        if(sqr == Math.floor(sqr))
        {
            System.out.println("It is a Sunny Number");
        }
        else
        {
            System.out.println("It is not a Sunny Number");
        }

    }
}



