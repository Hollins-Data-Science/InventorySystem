public class JeansStock extends Stock {
    private String style;

    public JeansStock(int quantity, double price, String style) {
        this.quantity = quantity;
        this.price = price;
        this.style = style;
    }

    public String toString() {
        return String.format("Jeans Quantity:%d Price:$%.2f Style:%s", quantity, price, style);
    }
}