import java.util.Scanner;

public class MixedReads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Adresa e plotë: ");
        String adresa = sc.nextLine();

        System.out.print("Kodi postar: ");
        int posta = sc.nextInt();

        System.out.print("Pesha (kg): ");
        double peshaKg = sc.nextDouble();

        System.out.println("Adresa: " + adresa + ", Kodi postar: " + posta + ", Pesha(kg): " + peshaKg);

        sc.close();
    }
}