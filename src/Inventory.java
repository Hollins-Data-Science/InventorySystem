import java.util.ArrayList;

public class Inventory {
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double totalValue() {
        double total = 0.0;
        for (Stock stock : stocks) {
            total += stock.price * stock.quantity;
        }
        return total;
    }

    public String toString() {
        String description = "";
        for (Stock stock : stocks) {
            description += String.format("%s%n", stock);
        }
        description += String.format("Total value:$%.2f%n", totalValue());
        return description;
    }
}