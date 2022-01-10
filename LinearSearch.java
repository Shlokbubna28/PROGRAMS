import java.util.*;
public class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array you want to create: ");    // taking array size input
        int size = sc.nextInt();

        int arr[] = new int[size];   // Initializing the array  

        // taking array input
        System.out.println("Please enter the elements of the array: ");
        for(int i=0;i<size;i++)             
        {
            arr[i] = sc.nextInt();
        }

        
        
        System.out.println("Enter the number you want to be searched: ");      // enter the no. X FOR SEARCHING
        int x = sc.nextInt();


        // searching for the number x
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                System.out.println("The position for "+x+" is "+i);
            }
        }
        
        System.out.println();     // just a new line for neatness of code output

        
        // printing the whole array
        System.out.println("The whole array is: ");
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
