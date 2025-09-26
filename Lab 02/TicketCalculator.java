import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {
        final double TVSH = 0.10;
        final int ZBRITJE_NX = 5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj çmimin bazë (lek): ");
        if (!sc.hasNextInt()) {
            System.out.println("Gabim: Duhet të jepet një numër i plotë.");
            return;
        }

        int basePrice = sc.nextInt();
        if (basePrice <= 0) {
            System.out.println("Gabim: çmimi bazë duhet të jetë > 0.");
            return;
        }

        System.out.print("A je nxënës? (true/false): ");
        boolean isStudent = false;
        if (sc.hasNextBoolean()) {
            isStudent = sc.nextBoolean();
        } else {
            System.out.println("Paralajmërim: Vlerë e pavlefshme. Supozojmë jo-nxënës.");
        }

        double tvshValue = basePrice * TVSH;
        double withTax = basePrice + tvshValue;

        int discount = isStudent ? ZBRITJE_NX : 0;
        double finalPrice = withTax - discount;

        int totalRounded = (int)Math.round(finalPrice);

        System.out.println("\nÇmimi bazë: " + basePrice + " lek");
        System.out.println("TVSH (10%): " + tvshValue + " lek");
        System.out.println("Ndërmjetëse me TVSH: " + withTax + " lek");
        System.out.println("Zbritje nxënësi: " + discount + " lek");
        System.out.println("Totali për pagesë: " + totalRounded + " lek");
    }
}