package HW12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> products = generateRandomProducts();
        Map<String, Integer> shoppingList = createShoppingList(products);

        System.out.println("Shopping List:");
        printShoppingList(shoppingList);

        int totalQuantity = calculateTotalQuantity(shoppingList);
        System.out.println("\nTotal quantity of all products: " + totalQuantity);
    }

    public static List<String> generateRandomProducts() {
        List<String> products = new ArrayList<>();
        Random random = new Random();

        String[] items = {"Apple", "Banana", "Orange", "Milk", "Bread"};
        int itemCount = items.length;

        for (int i = 0; i < itemCount; i++) {
            int quantity = random.nextInt(10) + 1; // Generate random quantity (1-10)
            products.add(items[i] + " - " + quantity);
        }

        return products;
    }

    public static Map<String, Integer> createShoppingList(List<String> products) {
        Map<String, Integer> shoppingList = new HashMap<>();

        for (String product : products) {
            String[] parts = product.split(" - ");
            String itemName = parts[0];
            int quantity = Integer.parseInt(parts[1]);

            shoppingList.put(itemName, quantity);
        }

        return shoppingList;
    }

    public static void printShoppingList(Map<String, Integer> shoppingList) {
        for (Map.Entry<String, Integer> entry : shoppingList.entrySet()) {
            String itemName = entry.getKey();
            int quantity = entry.getValue();

            System.out.println(itemName + " - " + quantity);
        }
    }

    public static int calculateTotalQuantity(Map<String, Integer> shoppingList) {
        int totalQuantity = 0;

        for (int quantity : shoppingList.values()) {
            totalQuantity += quantity;
        }

        return totalQuantity;
    }
}

