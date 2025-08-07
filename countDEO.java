import java.util.*;
public class countDEO {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenc=0,oddc=0, n;
        while(num>0)
        {
            n=num%10;
            num/=10;
            if(n%2==0)
            {
                evenc++;
            }
            else{
                oddc++;
            }
        }
        System.out.println("even count:"+evenc+"  odd count:"+oddc);
    }
}
