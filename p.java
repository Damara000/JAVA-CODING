interface parent1
{
    void car();
}
interface parent2
{
    void bike();
}
class p implements parent1,parent2
{
    public void bike()
    {
        System.out.println("R15");
    }
    public void car()
    {
        System.out.println("BMW");
    }
    public static void main(String[] args) {
        p m=new p();
        m.bike();
        m.car();
    }
}