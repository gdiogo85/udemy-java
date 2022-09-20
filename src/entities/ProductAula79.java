package entities;

public class ProductAula79 {

//encapsulamento
    private String name;
    private double price;
    private int quantity;

    public ProductAula79() {

    }
//SOBRECARGA

    public ProductAula79(String name, double price) {
        this.name = name;
        this.price = price;
    }
//SOBRECARGA

    public ProductAula79(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//método de acesso ao atributo privado para pegar nome
    public String getName() {
        return name;
    }

//método de acesso ao atributo privado para trocar nome
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuaitity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
