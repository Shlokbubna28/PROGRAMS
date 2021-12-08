package com.Shlokbubna1;
import java.util.Scanner;
public class Randomnumberdouble
{
    public static void main(String args[])
    {
        // trying out for and nested loop at the same time
        Scanner sc = new Scanner(System.in);                                         // Scanner class taken

        System.out.println("This is a 10 round game");                             // game intro's
        System.out.println("Let's see if u can provide the correct double: ");                  


        for(int i=0;i<=10;i++)                   // making it run for 10 rounds       // for loop used
        {
            System.out.println("The no: ");
            int rn = (int)(Math.random()*100);                  // taking the random number
            System.out.println(rn);

            System.out.println("Answer: ");
            int inputdubs = sc.nextInt();

            if(inputdubs == 2*rn)                         // checks the double statement            // nested if used      // if-else statement used
            {
                if(i==10)                           // for the last round 
                {
                    System.out.println("ALL CORRECT HURRAHHHH ::::::!!!!!!!! ");
                    break;
                }
                System.out.println("Okay good, keep going");              // continues after every correct answer
            }
            else
            {
                System.out.println("That's wrong dude, correct answer of " +rn+ " is : " + (2*rn));        // on wrong answer, it breaks // tells the correct answer of that statement
                System.out.println(" ");
                System.out.println("---------------PLEASE START AGAIN---------------");                       
                break;
            }
        }
    }
}
