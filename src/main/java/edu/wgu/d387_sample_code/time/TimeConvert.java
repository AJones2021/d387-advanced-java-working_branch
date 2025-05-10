package edu.wgu.d387_sample_code.time;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConvert {

    public static String getConversion(){

        ZoneId Eastern = ZoneId.of("America/New_York");
        ZoneId Mountain = ZoneId.of("America/Denver");
        ZoneId Universal = ZoneId.of("UTC");
        ZoneId zoneId = ZoneId.systemDefault();

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);


        ZonedDateTime zonedDateTimeEastern = zonedDateTime .withZoneSameInstant(Eastern);
        LocalDateTime localDateTimeEastern = zonedDateTimeEastern.toLocalDateTime();

        ZonedDateTime zonedDateTimeMountain = zonedDateTime .withZoneSameInstant(Mountain);
        LocalDateTime localDateTimeMountain = zonedDateTimeMountain.toLocalDateTime();


        ZonedDateTime zonedDateTimeUniversal = zonedDateTime .withZoneSameInstant(Universal);
        LocalDateTime localDateTimeUniversal = zonedDateTimeUniversal.toLocalDateTime();


        String timePattern = "hh:mm a";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(timePattern);

        String timeDisplay = localDateTimeEastern.format(timeFormatter) + " ET, "
                + localDateTimeMountain.format(timeFormatter) + " MT, and "
                + localDateTimeUniversal.format(timeFormatter) + " UTC ";

        return timeDisplay;



    }
}
