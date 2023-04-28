import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2022-04-04");
        LocalDateTime d2 = LocalDateTime.parse("2022-07-01T04:30:16");
        Instant d3 = Instant.parse("2022-04-05T04:30:15Z");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:s");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d1  =  " + d1 );
        System.out.println("d2  =  " + d2 );
        System.out.println("d3  =  " + d3 );
        System.out.println();
        System.out.println("d1  =  " + d1.format(fmt1));
        System.out.println("d2  =  " + d2.format(fmt2) );
        System.out.println("d3  =  " + fmt3.format(d3));







    }

}
