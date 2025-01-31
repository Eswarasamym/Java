import java.util.*;
class spyNumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int prod=1;
        //digital sum
        while(num>0)
        {
            sum+=num/10;
            prod=prod*num/10;
            num/=10;

        }
        System.out.println((sum==prod)? "spy" : "not a spy");
    }
}