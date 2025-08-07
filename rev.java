// import java.util.*;
// public class rev
// {
//     public static void main(String[]args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

        // using algorithm
        // int rev=0;
        // while(n>0)
        // {
        //     rev=rev*10+n%10;
        //     n=n/10;
        // }

        // using StringBuffer class
        // StringBuffer s=new StringBuffer(String.valueOf(n));
        // StringBuffer rev = s.reverse();
        // System.out.print(rev);

        // using StringBuilder
//         StringBuilder sbl= new StringBuilder();
//         sbl.append(n);
//         StringBuilder rev=sbl.reverse();
//         System.out.print(rev);

//     }
// }
////////////////////////////////////////////////////////
//logic ----->

import java.util.*;
public class rev
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

    int n=0;                                          //i=1234      n= 4321
    for(int i=sc.nextInt();i!=0;n=n*10+i%10,i=i/10);
    System.out.println(n);
    }
}