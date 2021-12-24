package com.company;
import java.util.*;

public class Neon_Num
{
    public static void main(String args[])
    {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        n = sc.nextInt(); //will read input number
        int c = n * n; // will calculate square of number
        while(c != 0) // while loop will run until the condition is false
        {
            int a = c % 10; //find the last digit of the square
            sum = sum + a; //addition of digits of number
            c = c / 10; //separates the last digit of square
        }

        if(n == sum) //compares given number with sum
            System.out.println(n + " is a Neon Number.");
        else
            System.out.println(n + " is not a Neon Number.");
    }
}
