import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Shkruaj emrin: ");
        String name = scanner.nextLine();

        System.out.print("Shkruaj qytetin: ");
        String city = scanner.nextLine();

        System.out.println("Pershendetje, " + name + " nga " + city + "!");

        scanner.close();
    }
}