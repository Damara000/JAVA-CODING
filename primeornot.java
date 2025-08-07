import java.util.*;
public class primeornot 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                count++;
            }
                     if(count==2)
                     {
                     System.out.println("it is a prime number");
                    }
                    else
                    {
                     System.out.println("it is a not prime number");
                    }
        }
        else
        {
            System.out.println("enter num value greater than 1");
        }
        }
    }