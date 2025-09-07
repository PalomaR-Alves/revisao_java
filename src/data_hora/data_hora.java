package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_hora {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato customizado de data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formato customizado de data-hora

        LocalDate d01 = LocalDate.now(); // instancia com data atual
        System.out.println("LocalDate d01 = " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("LocalDateTime d02 = " + d02);

        Instant d03 = Instant.now(); // Data-Hora no fuso UTC (+3, Londres)
        System.out.println("Instant d03 = " + d03);

        LocalDate d04 = LocalDate.parse("2022-07-01");
        System.out.println("String -> LocalDate d04 = " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-01T16:30:18");
        System.out.println("String -> LocalDateTime d05 = " + d05);

        Instant d06 = Instant.parse("2022-07-01T16:30:18Z");
        System.out.println("String -> Instant d06 = " + d06);

        // neste caso o -03:00 indica a diferença do horário atual para UTC, ou seja,
        // supondo que 16:30 seja horário de Brasília o de Londres é 19:30
        Instant d07 = Instant.parse("2022-07-01T16:30:18-03:00");
        System.out.println("String -> Instant d07 = " + d07);
        // apesar de aceitar data custom ainda printa com separadores " - "
        LocalDate d08 = LocalDate.parse("01/07/2022", fmt1);
        // alternativa: LocalDate d08 = LocalDate.parse("01/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("LocalDate fmt custom = " + d08);

        LocalDateTime d09 = LocalDateTime.parse("01/07/2022 01:30", fmt2);
        System.out.println("LocalDateTime fmt custom = " + d09);

        LocalDate d10 = LocalDate.of(2022, 1, 7);
        System.out.println("LocalDate.of = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 1, 7, 16, 30);
        System.out.println("LocalDateTime.of = " + d11);

    }
}
