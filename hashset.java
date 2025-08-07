import java.util.*;
public class hashset
{
    public static void main(String[]args) 
    {
        HashSet<Character> a=new HashSet<>();
        a.add('a');
        a.add('e');
        a.add('s');
        a.add('l');
        a.add('e');
        a.add('p');
        System.out.println(a+" ");
        Iterator b=a.iterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }
        for(char i:a)
        {
            System.out.print (i+" ");
        }


    }
}