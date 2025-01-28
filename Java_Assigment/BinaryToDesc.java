class BinaryToDesc
{
    public static void main(String[] args)
    {
        int binary=1101;
        int sum=0;
        int x=1;
        while(binary>0)
        {
            sum=sum+binary%10*x;
            x=x*2;
            binary=binary/10;

        }
        System.out.println(sum);
    }
}