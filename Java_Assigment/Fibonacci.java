class Fibonacci
{
    public static void main(String[] args)
    {
        int n1=0;
        int n2=1;
        System.out.println(n1+" "+n2+" ");
        for(int i=0;i<=8;i++)
        {
            int n3=n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}