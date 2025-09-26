import java.util.Scanner;

public class TicketCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bileta fillestare: ");
        int biletaFillestare = scanner.nextInt();

        System.out.print("Shitje 1: ");
        int shitje1 = scanner.nextInt();

        System.out.print("Shitje 2: ");
        int shitje2 = scanner.nextInt();

        System.out.print("Bonus ditor (true/false): ");
        boolean bonusDitor = scanner.nextBoolean();

        int stok = biletaFillestare;
        System.out.println("Stok fillestar: " + stok);

        stok -= shitje1;
        System.out.println("Shitje paradite: " + shitje1 + " → stok: " + stok);

        stok -= shitje2;
        System.out.println("Shitje pasdite: " + shitje2 + " → stok: " + stok);

        int totalShitje = shitje1 + shitje2;
        System.out.println("Totali i biletave të shitura: " + totalShitje);

        double cmimi = 40.0;
        double teArdhura = totalShitje * cmimi;
        System.out.println("Të ardhurat bruto: " + teArdhura);

        if (bonusDitor) {
            double bonus = teArdhura * 0.05;
            teArdhura += bonus;
            System.out.println("Bonus 5% i aplikuar: " + bonus);
        }

        System.out.println("Të ardhurat neto: " + teArdhura);
        int lek = (int) Math.round(teArdhura);
        System.out.println("Raporto (lek, i rrumbullakuar): " + lek);
    }
}
