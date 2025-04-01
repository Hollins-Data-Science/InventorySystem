import java.util.ArrayList;

public class Inventory {
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public String toString() {
        String description = "";
        for (Stock stock : stocks) {
            description += String.format("%s%n", stock);
        }
        return description;
    }
}