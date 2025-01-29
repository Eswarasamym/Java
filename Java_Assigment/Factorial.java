import java.util.*;
class Factorial
{
    static int fact=1;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("program Starts");
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int res=findFactorial(number);
        System.out.println("Factorial number " +number+"is "+res);
        System.out.println("Program Ends");

    }
    public static int findFactorial(int n)
    {
        if(n>=2)
        {
            fact=fact*n--;
            findFactorial(n);
    }
    return fact;
    }
}