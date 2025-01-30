import java.util.*;
class HappyNumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        while(num!=1&& num!=4)
        {
            int sum=0;
            while(num>0)
            {
                int digit=num%10;
                sum=sum+(digit*digit);
                num/=10;

            }
            num=sum;
        }
        if(num==1)
        
            System.out.println("Happy");
        
            else if(num==4)
            
                System.out.println("UnHappy");
            
        
    }
}