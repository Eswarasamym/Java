import java.util.*;
class SecondLargestNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int res=SecondLargestNum(a,b);
        System.out.println("The largest of value is:"+res);

    }
    public static int SecondLargestNum(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    
}
