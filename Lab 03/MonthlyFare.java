import java.util.Scanner;

public class MonthlyFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dite pune: ");
        int ditePune = scanner.nextInt();

        System.out.print("Cmim ditor: ");
        double cmimDitor = scanner.nextDouble();

        System.out.print("A je nxenes? (true/false): ");
        boolean eshteNxenes = scanner.nextBoolean();

        System.out.print("Distanca (km): ");
        int distanceKm = scanner.nextInt();

        double tarifaBaze = ditePune * cmimDitor;
        System.out.println("Tarifa bazë: " + tarifaBaze);

        if (eshteNxenes) {
            tarifaBaze *= 0.9;
        }
        System.out.println("Pas zbritjes nxënësi (nëse aplikohet): " + tarifaBaze);

        if (distanceKm > 10) {
            tarifaBaze *= 1.05;
        }
        System.out.println("Pas shtesës distancë (" + distanceKm + " km): " + tarifaBaze);

        if (ditePune >= 22 && !eshteNxenes) {
            tarifaBaze -= 200;
        }

        tarifaBaze = Math.max(0, tarifaBaze);

        int totalLek = (int) Math.round(tarifaBaze);
        System.out.println("Pas kuponit besnikëri: " + totalLek);
        System.out.println("Totali (lek): " + totalLek);
    }
}
