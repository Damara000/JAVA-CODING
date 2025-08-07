import java.util.*;
public class AEO 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        {
            for(int i=0;i<arr.length;i++)  
            {
            if(arr[i]%2==0)
            {
            System.out.println("Even:"+arr[i]);
            }
            else
            {
            System.out.println("Odd:"+arr[i]);
            }
        // for(int a:arr)
        // {
        //     if(a%2==0)
        //     {
        //     System.out.println("Even:"+a);
        //     }
        //     else
        //     {
        //     System.out.println("Odd:"+a);
        //     }
        }
    }   
}
}
