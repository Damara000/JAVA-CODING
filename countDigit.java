import java.util.*;
public class countDigit {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int count =0;
        //                   //logic 1;
        // while(num>0)
        // {
        //     num/=10;
        //     count++;
        // }
        //                     //logic 2;
        int count=(int)Math.log10(num)+1;

System.out.println("count the no of digits:"+count);
    }
}
