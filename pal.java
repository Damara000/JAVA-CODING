import java.util.*;
public class pal 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_n=n;
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n/=10;
        }
        if(rev==original_n)
        System.out.println("it is a palindrome");
        else
        System.out.println("not a palindrome");

    }
}