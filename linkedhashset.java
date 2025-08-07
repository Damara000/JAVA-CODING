import java.util.*;
public class linkedhashset
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Character> a=new LinkedHashSet<>();
        a.add('c');  
        a.add('e');  
        a.add('c');  
        a.add('f');  
        a.add('g'); 
        System.out.println(a+" "); 
        Iterator b=a.iterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }
        for(char i:a)
        {
            System.out.print(i+" ");
        }
    }

}