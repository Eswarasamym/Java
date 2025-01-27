
class L1 {

    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 26;
        boolean res1 = x > y && x < y;
        boolean res2 = ('n' > 68 & x < y) || (z > y);
        System.out.println(res1);
        System.out.println(res2);
    }
}

/*
false
true
 */
