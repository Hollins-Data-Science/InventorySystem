import java.util.Scanner;

class Main {
    public static void readStock(Scanner io, String input, Inventory inventory) {
        if (input.equals("tshirt")) {
            System.out.println("Enter a quantity, price and color");
        } else if (input.equals("jeans")) {
            System.out.println("Enter a quantity, price and style");
        } else {
            System.out.println("Not a valid stock type.");
            return;
        }
        int quantity = io.nextInt();
        double price = io.nextDouble();
        String modifier = io.next();

        if (input.equals("tshirt")) {
            TShirtStock newStock = new TShirtStock(quantity, price, modifier);
            inventory.addStock(newStock);
        } else if (input.equals("jeans")) {
            JeansStock newStock = new JeansStock(quantity, price, modifier);
            inventory.addStock(newStock);
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Inventory clothingInventory = new Inventory();
        System.out.println("\t\t\t** Welcome to the Inventory System! **");
        System.out.println("Enter an stock type or q to quit.");
        String input = io.next();
        while (!input.equals("q")) {
            readStock(io, input, clothingInventory);
            System.out.println("Enter an stock type or q to quit.");
            input = io.next();
        }
        System.out.println("Inventory List:");
        System.out.println(clothingInventory.inventoryToString());
        System.out.println("Thanks!");
    }
}