import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        // Define a LocalDateTime object representing a specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 15, 14, 30, 0);

        // Use DateTimeFormatter to format the LocalDateTime object to the desired string format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        // Print the formatted LocalDateTime
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
