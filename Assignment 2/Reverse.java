package com.company;
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int n = sc.nextInt();

        int temp = n, r = 0;
        while (temp > 0)
        {
            r = r * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println("Reverse number is: " + r);

    }
}

