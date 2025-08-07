import java.util.Scanner;
public class SumEO{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
//         int even_sum=0;
//         int odd_sum=0;
//         for(int i=0;i<n;i++) 
//         {
//             if(arr[i]%2==0)
//             {
//                 even_sum+=arr[i];
//             }
//             else
//             {
//                 odd_sum+=arr[i];
//             }
//         }
//     System.out.println("EVEN:"+even_sum);
//     System.out.println("ODD:"+odd_sum);
//     }
// }
            int even_count=0;
            int odd_count=0;
            for(int i=0;i<n;i++) 
            {
                if(arr[i]%2==0)
                {
                  even_count+=1;  
                }
                else
                {
                  odd_count+=1;  
                }
            }
        System.out.println("EVEN COUNT:"+even_count);
        System.out.println("ODD COUNT:"+odd_count);
    }
}