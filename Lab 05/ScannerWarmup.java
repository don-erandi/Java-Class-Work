import java.util.Scanner;

public class ScannerWarmup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Emri: ");
        String emri = sc.nextLine();

        System.out.print("Mosha: ");
        int mosha = sc.nextInt();

        System.out.print("Koeficienti: ");
        double koef = sc.nextDouble();

        System.out.println("Përshëndetje, " + emri + "! Mosha: " + mosha + ", Koeficienti: " + koef + ".");

        sc.close();
    }
}