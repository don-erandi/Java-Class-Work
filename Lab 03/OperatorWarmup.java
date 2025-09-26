public class OperatorWarmup {
    public static void main(String[] args) {
        int a = 17, b = 5, c = 2;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("para: b = " + b);
        int r = b++ * c;
        System.out.println("r = " + r);
        System.out.println("pas: b = " + b);
    }
}

