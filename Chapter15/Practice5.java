package Chapter15;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Practice5 {
    public static void main(String[] args) {
        ZonedDateTime zonedNow = ZonedDateTime.now();
        ZoneId tz = ZoneId.of("UTC");
        ZonedDateTime utcTime = zonedNow.withZoneSameInstant(tz);
        ZonedDateTime future = utcTime.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西曆uuuu年MM月dd日 HH:mm:ss zzzz", Locale.JAPAN);
        String s = future.format(fmt);
        System.out.println(s);

    }

}
