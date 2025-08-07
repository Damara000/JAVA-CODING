import java.util.*;
public class stringArray 
{ 
    public static void main (String []args)  
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s[] = new String[n];
        for (int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        boolean flag = false;
        for(int i=0;i<s.length;i++)
        {
            for(int j=1;j<s.length;j++)
            {
                if(s[i]==s[j])
                {
                    System.out.println("the duplicate element: "+s[i]+" ");
                    flag=true;
                }
            }
        }  
        if(flag==false)
        {
            System.out.println("no duplicate elements");
        }
    }
}
