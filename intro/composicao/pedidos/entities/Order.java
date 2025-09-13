package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double totalValue = 0.0;
        for (OrderItem o : items) {totalValue += o.subTotal();}
        return totalValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(moment.format(fmt1) + "\n"); // printa string no formato de fmt
        sb.append("Order status: ").append(status + "\n");
        sb.append("Client: ").append(client.getName()).append(" (" + client.getBirthDate().format(fmt2) + ")");
        sb.append(" - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem o : items) {
            sb.append(o.getProduct().getName() + ", ");
            sb.append("$" + o.getProduct().getPrice() + ", ");
            sb.append("Quantity: " + o.getQuantity() + ", ");
            sb.append("Subtotal: $" + o.subTotal() + "\n");
        }
        sb.append("\nTotal price: $" + total());

        return sb.toString();
    }

}
