import java.util.*;
class AreaOfCircle {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception
    {
        System.out.println("Enter the Redius:");
        int r=sc.nextInt();
        double result=AreaOfCircle(r);
        System.out.println("\t\t\t Processing");
        Thread.sleep(4000);
        System.out.println("Area of circle is :"+result);
    }
    public static double AreaOfCircle(int redius)
    {
        double pi=3.14;
        return pi*(redius*redius);
    }
    
}
