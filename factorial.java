import java.util.*;
public class factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact*=i;
        // }
        for(int i=n;i>=1;i--)
        {
            fact*=i;
        }

        System.out.println(fact);
    }
}
