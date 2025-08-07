import java.util.*;
public class hashmap
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"abc");
        hm.put(2,"def");
        hm.put(3,"ghi");
        System.out.print(hm);
        Iterator b=hm.iterator();
        while(b.hasNext())
        {
            System.out.println(b.next());
        }


    }
}