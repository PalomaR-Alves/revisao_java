package poo;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        // construtor padrão, possibilita instanciar objeto com new Product()
    }

    // GETTERS e SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducs(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", "
                + String.format("%.2f" ,price)
                + ", " + quantity;
    }

}
