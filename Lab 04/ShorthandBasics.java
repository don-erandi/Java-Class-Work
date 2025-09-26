public class ShorthandBasics {
    public static void main(String[] args) {
        int a = 10;
        a += 5; System.out.println("a = " + a);
        a *= 2; System.out.println("a = " + a);
        a -= 4; System.out.println("a = " + a);
        a /= 2; System.out.println("a = " + a);
        a %= 3; System.out.println("a = " + a);

        String s = "Bileta: ";
        int n = 3;
        s += n;
        System.out.println(s);

        int p = 5;
        p /= 2;
        System.out.println("p = " + p);

        double q = 5;
        q /= 2;
        System.out.println("q = " + q);
    }
}