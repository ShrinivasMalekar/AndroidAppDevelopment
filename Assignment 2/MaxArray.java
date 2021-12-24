package com.company;

import java.util.Scanner;

public class MaxArray
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
        int x = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>x)
                x = arr[i];
        }
        System.out.println("Largest element in Array is "+x);
    }

}
