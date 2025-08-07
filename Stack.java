import java.util.*;
public class Stack
{
    public static void main(String[] args) 
    {
        Stack<Integer> s = new Stack<Integer>();

        s.push(5);
        s.push(6);
        s.push(7);
        System.out.println(s.pop());
        System.out.println(s);
        
    }
}