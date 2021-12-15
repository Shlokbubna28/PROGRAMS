package com.Shlokbubna1;
import java.util.Scanner;
import java.util.Arrays;
public class matrixMULTIPLICATIONinput 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of rows for MATRIX 1 : ");
        int r1 = sc.nextInt();

        System.out.println("Enter the no.of columns for MATRIX 1 : ");
        int c1 = sc.nextInt();

        System.out.println("Enter the no.of rows for MATRIX 2 : ");
        int r2 = sc.nextInt();

        System.out.println("Enter the no.of columns for MATRIX 2 : ");
        int c2 = sc.nextInt();

        if (c1 != r2) 
        {
            System.out.println(" Enter the same no. of rows and columns for both the matrices please! ");
        } 
      else 
        {
            // ARRAY INITIALIZATION

            int arr1[][] = new int[r1][c1];
            int arr2[][] = new int[r2][c2];

            int c[][] = new int[r1][c2];

            // TAKING INPUT

            System.out.println("Enter the elements of FIRST MATRIX : \n");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++)
                {
                    arr1[i][j] = sc.nextInt();     // First array input
                }
            }

            System.out.println("Enter the elements of SECOND MATRIX : \n");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    arr2[i][j] = sc.nextInt();     // Second array input
                }
            }


            // ARITHMETIC STUFF AND PRINTING
            System.out.println("The matrix multiplication : \n");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    c[i][j] = 0;
                    for (int k = 0; k < c1; k++) 
                    {

                        c[i][j] = c[i][j] + (arr1[i][k] * arr2[k][j]);
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();         //new line
            }

        }
    }
}
