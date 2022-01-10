import java.util.*;
public class LinearSearch2D
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Taking number of rows and columns
        System.out.println("Please enter the number of rows and the number of columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][] numbers= new int[rows][columns];      // Array initialization


        // INPUT
        System.out.println("Enter the array: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        // FINDING X:
        System.out.println("Enter the number you want to search: ");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(numbers[i][j] == x)
                {
                    System.out.println("The number "+x+" is situated at "+i+","+j);
                    break;
                }
            }
        }
        System.out.println();

        // OUTPUT
        System.out.println("The final MATRIX: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
