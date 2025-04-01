public class TShirtStock extends Stock {
    private String color;
  
    public TShirtStock(int quantity, double price, String color) {
      this.quantity = quantity;
      this.price = price;
      this.color = color;
    }
  
    public String toString() {
      return String.format("T-Shirt Quantity:%d Price:%.2f Color:%s", quantity, price, color);
    }
    
  }