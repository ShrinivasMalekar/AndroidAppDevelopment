package com.company;

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int n  = sc.nextInt();
        int m = n/2;
        int c = 0;

        if(n==0 || n==1)
        {
            System.out.println("It is not a Prime Number");
        }
        else
        {
            for(int i = 2; i<=m; i++)
            {
                if (n % i == 0)
                {
                    System.out.println(n+"is not a Prime Number");
                    c++;
                    break;
                }


            }
            if(c ==0)
            {
                System.out.println(n+" is a Prime Number");
            }

        }

    }
}
