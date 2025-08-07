import java.util.*;
public class Aeornot 
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        int []a=new int[x];
        int []b=new int[y];
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<y;i++)
        {
            b[i]=sc.nextInt();
        }
        // in-build method logic

        // boolean status=Arrays.equals(a,b);
        // if(status==true)
        // {
        //     System.out.println("Arrays are equal");
        // }
        // else
        // {
        //     System.out.println("Arrays are not equal");
        // }

        //manual method logic
        boolean status=true;
        if(x==y)
        {
            for(int i=0;i<x;i++)
            {
            if(a[i]!=b[i])
            {
                status = false;
            }
            else
            {
                status=true;
            }
        }
        }
        else
        {
            status=false;
        }
        if(status==true)
        System.out.println("Arrays are equal");
        else
        System.out.println("Arrays not are equal");
    }
}