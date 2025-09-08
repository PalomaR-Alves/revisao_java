package enums;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class main_enums {
    public static void main(String[] args) {

        Order order = new Order(1080, LocalDateTime.now(ZoneId.systemDefault()), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
