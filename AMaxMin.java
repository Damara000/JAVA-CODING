import java.util.*;
public class AMaxMin
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
        //finding maximum number
        int max=arr[0];
        for(int i=1;i<n;i++) 
        {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println(max);
        // finding minimum number
        int min=arr[0];
        for(int i=1;i<n;i++) 
        {
            if(min>arr[i])
            min=arr[i];
        }
        System.out.println(min);

    }
}