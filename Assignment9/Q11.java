import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        // Parse a string representing a date and time in UTC format
        String utcDateTimeString = "2024-05-15T12:30:00Z";
        Instant utcInstant = Instant.parse(utcDateTimeString);

        // Convert the parsed Instant to a ZonedDateTime using a specific ZoneId
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime localDateTime = utcInstant.atZone(zoneId);

        // Format the local date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzzz");
        String formattedDateTime = localDateTime.format(formatter);

        // Print the converted local date and time
        System.out.println("UTC time: " + utcInstant);
        System.out.println("Local time in " + zoneId + ": " + formattedDateTime);
    }
}
