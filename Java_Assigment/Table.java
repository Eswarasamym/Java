import java.util.*;
class Table
{
    static Scanner sc=new Scanner(System.in);
    static int count=7;
    public static void main(String[] args)
    {
        System.out.println("Enter  n :");
        int number=sc.nextInt();
        Table(number);
       
    }
    public static  int Table(int n)
    {
        if(count<=10)
        {
            System.out.println(n+"*"+count+ "="+(count*n));
            count++;
            Table(n);
        }
        return n;
    }
}