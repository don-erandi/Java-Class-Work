import java.util.Scanner;

public class OrderCalculator {
    public static void main(String[] args) {
        final double TVSH = 0.10;
        final double ZBRITJE_KUPON = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.print("Produkt: ");
        String produkti = sc.nextLine();

        System.out.print("Sasia: ");
        int sasia = sc.nextInt();
        if (sasia <= 0) {
            System.out.println("Gabim: Sasia duhet të jetë më e madhe se zero.");
            return;
        }

        System.out.print("Çmimi njësi: ");
        double cmimi = sc.nextDouble();
        if (cmimi <= 0) {
            System.out.println("Gabim: Çmimi duhet të jetë më i madh se zero.");
            return;
        }

        sc.nextLine();

        System.out.print("Kupon? (true/false): ");
        boolean kaKupon = sc.nextBoolean();

        double ndermjetese = sasia * cmimi;
        double meTVSH = ndermjetese * (1 + TVSH);
        double zbritje = kaKupon ? meTVSH * ZBRITJE_KUPON : 0;
        double total = meTVSH - zbritje;

        int totalLek = (int) Math.round(total);

        System.out.println("Ndërmjetëse: " + ndermjetese);
        System.out.println("Me TVSH (10%): " + meTVSH);
        System.out.println("Kupon -5%: " + zbritje);
        System.out.println("Totali (lek): " + totalLek);

        sc.close();
    }
}