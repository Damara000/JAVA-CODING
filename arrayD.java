import java.util.*;
public class arrayD
{
    public static void main(String[] args)                    
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int pv= sc.nextInt();
        int r = t-pv;               
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            while(r>=a[i])
            {
                System.out.print(a[i]+" ");
                r=r-a[i];
            }
            if(r==0)
                break;
        }
    }
}
