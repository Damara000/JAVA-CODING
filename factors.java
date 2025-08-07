import java.util.*;
public class factors
{
    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // int a[]={1,1,2,6,24,120,720,5040};            // something issuse
        int a[]={1,1,4,9,16,25,36,49,64,81,100};
                          //i
        for(int i=a.length-1;i>=0;)
        {
            if(n<a[i]) 
            
            {                     
                i--;
            }
            else
            {
                while(n>=a[i])
                {
                    System.out.print(i);
                    n=n-a[i];
                }
                if(n==0)
                {
                    break;
                }
            }
        }
    }
}