 import java.util.*;
 class CondtionalOperator {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        String res=(number>0)? "Lion" : "Tiger";
        System.out.println(res);

        
    }
    
}
