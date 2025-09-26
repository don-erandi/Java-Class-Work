import java.util.Scanner;

public class CompareLogicDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj moshen: ");
        int mosha = scanner.nextInt();

        System.out.print("A je nxënës? (true/false): ");
        boolean eshteNxenes = scanner.nextBoolean();

        boolean zbritjeLejohet = (mosha < 18) || eshteNxenes;
        boolean zbritjeShtese = (mosha < 12) && eshteNxenes;

        System.out.println("Zbritja lejohet: " + zbritjeLejohet);
        System.out.println("Zbritje shtesë 2 lek: " + zbritjeShtese);
    }
}