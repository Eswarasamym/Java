package Inheritance;

 class P {
    static int x=10;
    public static void m1(){
        System.out.println("Hello world");
    }
    
}
class Q extends P{
    static int y=20;
    public static void m2(){
        System.out.println("Hello Earth");
    }
}
class R extends Q{
    static int z=30;
    public static void main(String[] args) {
        m1();
        m2();
    }
}
