public class FixTheBugs {
    public static void main(String[] args) {
        int v = 10;
        System.out.println(v++ + ++v);

        v += 2 * 1;

        v--;

        double d = 5;
        d /= 2; // 2.5

        System.out.println("v = " + v + ", d = " + d);
    }
}
