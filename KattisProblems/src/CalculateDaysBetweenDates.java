import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculateDaysBetweenDates {



    public static String calculateNumberOfDaysBetweenDates(String startDate, String endDate) {
        // Parse the input strings into LocalDate objects
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ISO_LOCAL_DATE);

        // Calculate the number of days between the start and end dates
        long daysBetween = ChronoUnit.DAYS.between(start, end);

        // Convert the result to a string and return it
        return Long.toString(daysBetween);
    }

    public static void main(String[] args) {

        calculateNumberOfDaysBetweenDates("2023-06-23", "2023-07-17");

    }
}
