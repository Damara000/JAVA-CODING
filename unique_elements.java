import java.util.*;
public class unique_elements
 {
{
	public static void main(String []arg)
	{
	   int a[] = {1,3,4,5,2,4,4,5,3,1};
	   int c[] = new int[10];
	   for(int i = 0; i<a. length;i++)
	   {
	       c[ a[i] ]++;
	   }
	   for(int i = 0;i< c.length; i++)
	   {
	       if(c[i]==1)
	       System.out.print(i + " ");
	   }
	}
}
 }