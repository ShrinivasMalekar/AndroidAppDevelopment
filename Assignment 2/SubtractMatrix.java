package com.company;

public class SubtractMatrix {
    public static void main(String[] args) {
        int a[][] = {{50, 25, 36}, {41, 51, 63}, {71, 92, 30}};
        int b[][] = {{4, 5, 6}, {4, 5, 7}, {4, 6, 8}};
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
