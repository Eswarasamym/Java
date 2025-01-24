interface A
{
    public static void m1()
    {
        System.out.println("Hello world");
    }
}
interface B extends A
{
    public static void main(String [] args)
    {
        m1();
    }
}