public class Main
{
    public void add(int x,int y)
    {
        System.out.println(x+y);
    }
    public void add(int x,int y,int z)
    {
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.add(2,3);
        m.add(5,5,5);
    }
}