import java.util.*;
public class sumEA 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        // 1st approach
        // for(int i=0;i<n;i++)
        // {
        //     sum+=arr[i];
        // }
        // enhanced for loop 2nd approach
        for(int a:arr)
        {
            sum+=a;
        }
        System.out.println(sum);
    }
}
