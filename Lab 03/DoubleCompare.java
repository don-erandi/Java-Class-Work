import java.util.Scanner;

public class DoubleCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj tarifa teorike: ");
        double tarifaTeorike = scanner.nextDouble();

        System.out.print("Shkruaj tarifa e llogaritur: ");
        double tarifaLlogaritur = scanner.nextDouble();

        final double EPS = 0.0001;

        boolean baraziESakte = tarifaTeorike == tarifaLlogaritur;
        boolean baraziEPerapert = Math.abs(tarifaTeorike - tarifaLlogaritur) < EPS;

        System.out.println("Barazi e saktë (==): " + baraziESakte);
        System.out.println("Barazi e përafërt (epsilon): " + baraziEPerapert);

    }
}