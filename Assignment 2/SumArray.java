package com.company;

import java.util.Scanner;

public class SumArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements in an array");


        int arr[] = new int[5];
        for(int a=0; a<arr.length;a++)
        {
            arr[a] = sc.nextInt();
        }
        int x = 0;
        for(int i=0;i<arr.length;i++)
        {
            x = x + arr[i];
        }
        System.out.println("Summ of Array elemnts is "+x);
    }
}
