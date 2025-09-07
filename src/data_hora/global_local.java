package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class global_local {
    public static void main(String[] args) {
        // passar data-hora GLOBAL para LOCAL

        LocalDate d04 = LocalDate.parse("2022-07-01");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-01T16:30:18");
        Instant d06 = Instant.parse("2022-07-01T01:30:18Z");

        // ZoneIds/Fusos disponíveis para uso
        /*
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
        */
        // Instant para LocalDate usando fuso local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // UTC-3
        System.out.println("r1 Brasília = " + r1);

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // portugal
        System.out.println("r2 portugal = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 Brasília = " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2 portugal = " + r4);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 hora = " + d05.getMinute());

    }
}
