package modern.challenge;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalAdjusters.lastDayOfYear;
import java.util.Calendar;
import java.util.Date;

public final class DateCheckers {

    private DateCheckers() {
        throw new AssertionError("Cannot be instantiated");
    }
    
    public static String firstDayOfYearV1(int year, boolean name) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);

        calendar.set(Calendar.DAY_OF_YEAR, 1);
        Date firstDay = calendar.getTime();

        if (!name) {
            return firstDay.toString();
        }

        return new SimpleDateFormat("EEEE").format(firstDay);
    }
    
    public static String firstDayOfYearV2(int year, boolean name) {

        LocalDate firstDay = LocalDate.ofYearDay(year, 1);
      
        if (!name) {
            return firstDay.toString();
        }
        
        return DateTimeFormatter.ofPattern("EEEE").format(firstDay);
    }

    public static String lastDayOfYearV1(int year, boolean name) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);

        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
        Date lastDay = calendar.getTime();

        if (!name) {
            return lastDay.toString();
        }

        return new SimpleDateFormat("EEEE").format(lastDay);
    }

    public static String lastDayOfYearV2(int year, boolean name) {

        LocalDate ld = LocalDate.ofYearDay(year, 31);
        LocalDate lastDay = ld.with(lastDayOfYear());

        if (!name) {
            return lastDay.toString();
        }
        
        return DateTimeFormatter.ofPattern("EEEE").format(lastDay);
    }
}
