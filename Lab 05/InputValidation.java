import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Çmimi bazë (lek): ");
        if (!sc.hasNextInt()) {
            System.out.println("Gabim: Pritej një numër i plotë.");
            return;
        }
        int base = sc.nextInt();

        if (base <= 0) {
            System.out.println("Gabim: Çmimi duhet të jetë më i madh se zero.");
            return;
        }

        sc.nextLine();

        System.out.print("A je nxënës? (true/false): ");
        if (!sc.hasNextBoolean()) {
            System.out.println("Gabim: Duhet të shkruash true ose false.");
            return;
        }
        boolean isStudent = sc.nextBoolean();

        System.out.println("Lexim OK: base=" + base + ", isStudent=" + isStudent);

        sc.close();
    }
}