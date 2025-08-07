import java.util.*;
public class findL
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> list= new LinkedList<>();
                while(true)
        {
        int a=sc.nextInt();
            if(a==-1)
            {
                break;
            list.add(a);
            }
            int find=sc.nextInt();
        }
        System.out.println((list.contains(find))?"yes":"no");
    }
}