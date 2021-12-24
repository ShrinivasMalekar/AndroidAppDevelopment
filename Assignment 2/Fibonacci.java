package com.company;
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0, b= 1, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times you want Fibonacci Series");
        n = sc.nextInt();
        n=n-2;
        System.out.print(a+" "+b);
        for(int s = 2; s<=n; s=s+1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
