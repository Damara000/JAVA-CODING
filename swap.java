import java.util.*;
public class swap
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swap"+"a:"+a+"  b:"+b);
        // 1st logic swap using 3rd variable
        // int temp=a;
        // a=b;
        // b=temp;
        // 2nd logic 
        // a=a+b;
        // b=a-b;
        // a=a-b;
        //3rd logic
        // a=a*b;
        // b=a/b;
        // a=a/b;
        // 4th logic
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap"+"a:"+a+"  b:"+b); 
    }
}