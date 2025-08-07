import java.util.Scanner;
public class rowsum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;
        int [][]arr= new int[a][b];
        for(int i=0;i<a;i++) 
        {
            for(int j=0;j<b;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++) 
        {
            
            for(int j=0;j<b;j++) 
            {
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}