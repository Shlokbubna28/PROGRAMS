// HACKER RANK - java series program - Loops 2
import java.util.*;
import java.util.Scanner;
public class loopsII
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt(); // number of queries

        if(q>=0 && q<=500)
        {
            for(int i=0;i<q;i++) // number of queries to run for
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();

                if(a>=0 && a<=50 && b>=0 && b<=50 && n>=1 && n<=15)
                {
                    int copy;
                    copy=n;
                    double e = a + Math.pow(2,0) * b;
                    n=0;
                    for(int j=0;j<=(copy-1);j++)        //n times the loop will run to print the series
                    {
                        System.out.print((int) e + " ");
                        e = e + (Math.pow(2, n + 1) * b);
                        n++;
                    }
                }
                else
                {
                    System.out.println("INVALID!!!!!! - a,b or c");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("INVALID!!!! - queries");
        }







        sc.close();
    }
}
