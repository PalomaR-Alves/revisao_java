package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class data_texto {
    public static void main(String[] args) {
        // passar STRING para DATA-HORA

        LocalDate d04 = LocalDate.parse("2022-07-01");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-01T16:30:18");
        Instant d06 = Instant.parse("2022-07-01T16:30:18Z"); // horário no fuso UTC - Londres

        // custom formatters
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // formatter com fuso horário do sistema local
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d04 ISO 8601 = " + d04);
        // printa a data fora do padrão ISO, usando o formato custom definido
        System.out.println("d04 formatado = " + d04.format(fmt1));
        // alternativa: System.out.println("d04 formatado = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 fmt1 = " + d05.format(fmt1));
        System.out.println("d05 fmt2 = " + d05.format(fmt2));
        // objetos Instant ñ possuem .format(), então o método é chamado no próprio formatter
        System.out.println("d06 = " + fmt3.format(d06)); // imprime UTC-03: horário de Brasília

    }
}
