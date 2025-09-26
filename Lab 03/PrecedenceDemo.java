public class PrecedenceDemo {
    public static void main(String[] args) {
        int r1 = 10 + 2 * 5 - 6 / 3;
        System.out.println("r1 = " + r1);

        int r2 = ((10 + 2) * (5 - 6)) / 3;
        System.out.println("r2 = " + r2);

        int x = 3;
        int y = x++ + ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("5 / 2.0 = " + (5 / 2.0));
    }
}
