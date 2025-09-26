public class CastingDemo {
    public static void main(String[] args) {
        int nrInt = 1000;
        long nrLong = nrInt;
        float nrFloat = 12.5f;
        double nrDouble = nrFloat;

        double pi = 3.14159;
        int piInt = (int) pi;
        System.out.println("pi (double) = " + pi + " -> (int) = " + piInt);

        long bigLong = 100000L;
        int longToInt = (int) bigLong;
        System.out.println("bigLong = " + bigLong + " -> (int) = " + longToInt);

        double d = 123.456789;
        float dToFloat = (float) d;
        System.out.println("double = " + d + " -> (float) = " + dToFloat);

        byte b = 127;
        byte overflowByte = (byte)(b + 1);
        System.out.println("byte b = " + b + " + 1 -> (byte) = " + overflowByte);
    }
}