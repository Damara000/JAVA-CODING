import java.util.*;
public class Lthreenum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        // 1st logic
        // if(a>b && a>c)
        // {
        //     System.out.println("A is largest:"+a);
        // }
        // else if(b>a && b>c)
        // {
        //     System.out.println("B is largest:"+b);
        // }
        // else if(c>a && c>b)
        // {
        //     System.out.println("C is largest:"+c);
        // }
        //2nd logic ternary operator
        System.out.println(c>(a>b?a:b)?c:(a>b?a:b));
    }
}
