public class MixPrePostShorthand {
    public static void main(String[] args) {
        int k = 3;
        int r = ++k * 2 + k++ - 1;

        System.out.println("k = " + k);
        System.out.println("r = " + r);

        int m = 8;
        m += ++k;
        m *= k--;
        System.out.println("m = " + m);
        System.out.println("k = " + k);

        int t1 = 10 + ++k * 2;
        int t2 = (10 + ++k) * 2;
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
    }
}
