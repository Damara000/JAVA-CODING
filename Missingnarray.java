import java.util.*;
public class Missingnarray 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a=new int[n];
        int sum1=0;
        for(int i=0;i<n-1;i++)  
        {
            a[i]=sc.nextInt();
            sum1+=a[i];
        }
        System.out.println(sum1);
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            sum2+=i;
        }
        int missing_no=sum2-sum1;
        System.out.println(missing_no);

    } 
}
