import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter fmt04 = DateTimeFormatter.ofPattern("dd/yyyy/MM");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-04-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-04-20T02:11:46");
        Instant d06 = Instant.parse("2022-06-20T04:34:35Z");
        Instant d07 = Instant.parse("2022-06-20T04:34:35-05:00");

        LocalDate d08 = LocalDate.parse("27/07/2022", fmt01);
        LocalDate d09= LocalDate.parse("04/07/2022", fmt02);
        LocalDate d10 = LocalDate.of(3502,06,24);
        LocalDateTime d11 = LocalDateTime.of(1999,10,12,04,40,14);


        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println();


        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);

    }

}
