import java.util.*;
public class tree
{
    public static void main(String[] args) 
    {
        TreeSet <Integer> a = new TreeSet<>(); //ternary operation (x,y)->(x<y?1:-1)
        a.add(1);
        a.add(5);
        a.add(1);
        a.add(4);
        System.out.println(a+" ");            // 1st method
        Iterator b=a.descendingIterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }
        System.out.println(a+" ");
        // System.out.println(a.remove(1));
        // System.out.println(a.contains(5));
        // System.out.println(a.size());

        // Iterator b=a.iterator();            // 2nd method
        // while(b.hasNext())
        // {
        //     System.out.println(b.next()+" ");
        // }
        // for(int i:a)                         // 3rd method
        // {
        //     System.out.println(i+" ");
        // }

    }
}