import java.util.*;
public class numswap {
    public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int n=0;                                          //i=1234      n= 4321
    for(int i=sc.nextInt();i!=0;n=n*10+i%10,i=i/10);
	for(int i=n;i!=0;System.out.print(i%100),i=i/100);
	}
}
