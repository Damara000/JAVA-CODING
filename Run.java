class Ram
{
    void krishna()
    {
        System.out.println("friend");
    }
}
class radha
{
    void krishna()
    {
        System.out.println("lover");
    }
}
class karna
{
    void krishna()
    {
        System.out.println("best friend");
    }
}
public class Run{
public static void main(String[]args)
{
    Ram R=new Ram();
    radha r=new radha();
    karna k=new karna();
    R.krishna();
    r.krishna();
    k.krishna();
}
}