import java.util.*;
import java.util.Arrays;
public class MatrixADDITIONinput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      
      
        System.out.println("Enter the array size R AND C: ");

        int r = sc.nextInt();         //rows inut
        int c = sc.nextInt();         //columns input


        // array initialization

        int a1[][] = new int[r][c];
        int b1[][] = new int[r][c];
        int c1[][] = new int[r][c];




        // taking ARRAY INPUTS


        System.out.println("ENTER ARRAY 1: "+" (** enter the 1st row then 2nd and 3rd **) ");
        for(int i=0;i<r;i++)                                                                      // rows           //ARRAY 1
        {
            for(int j=0;j<c;j++)                                                                  // columns
            {
                a1[i][j] = sc.nextInt();
            }
            System.out.println(" "); //new line
        }

        System.out.println("ENTER ARRAY 2:"+" (** enter the 1st row then 2nd row and 3rd **) ");
        for(int i=0;i<r;i++)                                                                   // rows              //ARRAY 2
        {
            for(int j=0;j<c;j++)                                                               // columns
            {
                b1[i][j] = sc.nextInt();
            }
            System.out.println(" ");  // new line
        }



        // SUMMMING and PRINTING

        for(int i=0;i<3;i++)           // rows
        {
            for(int j=0;j<3;j++)           // columns
            {
                c1[i][j] = a1[i][j] + b1[i][j];           // summing
                System.out.print(c1[i][j]+" ");           // printing
            }
            System.out.println(" ");    // new line to create a matrix form otheriwse it will be printed in a straightline.
        }

    }
}
