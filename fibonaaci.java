import java.util.*;
public class fibonaaci {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1=10 ,n2=11 , sum=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=1;i<10;i++)
        {
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(sum+" ");
        // int n1=10;
        // int n2=n;

        }
    }
}
