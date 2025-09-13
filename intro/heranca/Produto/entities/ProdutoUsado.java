package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

    private LocalDate manufacturedDate;


    public ProdutoUsado() {}

    public ProdutoUsado(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public String priceTag() {
        return getName() + " (used) $ "
                + getPrice()
                + " (Manufacture date: "
                + manufacturedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
