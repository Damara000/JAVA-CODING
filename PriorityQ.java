import java.util.*;
public class PriorityQ
{
    public static void main(String[] args) 
    {
        Queue<Integer> p=new PriorityQueue<>(); //(a,b)->(a<b)?1:-1 ternary operations
        p.add(2);
        p.add(3);
        p.add(1);
        p.add(5);
        p.add(6);
        p.remove(3);
        System.out.print(p);
    }  
}