package Inheritance;

class A{
    static int x=10;
}
class B extends A{
    static int y=20;
}
class C extends B{
    static int z=30;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(B.x);
        System.out.println(C.x);
        System.out.println(C.y);
        System.out.println(C.z);
    }
}
