import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Faza3 {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        String myName = "Erand";
        System.out.println("Pershendetje, " + myName + "!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = now.format(formatter);
        System.out.println("Sot eshte: " + formattedDateTime);

        int hour = now.getHour();
        if (hour >= 6 && hour < 12) {
            System.out.println("Mirmengjes dhe mirë se erdhe në Java!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Mirdita dhe mirë se erdhe në Java!");
        } else {
            System.out.println("Mirmbrema dhe mirë se erdhe në Java!");
        }
    }
}