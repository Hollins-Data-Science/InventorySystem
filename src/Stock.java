public abstract class Stock {
    protected int quantity;
    protected double price;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public void adjustQuantity(int adjustment) {
        quantity += adjustment;
    }

    public double totalValue() {
        return price * quantity;
    }
}