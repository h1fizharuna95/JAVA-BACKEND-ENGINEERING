package InventorySystem.src;

public class Main {
    public static void main(String[] args) {
        Product products[] = {
            new Product(1, "Laptop", 1000.0, 10),
            new Product(2, "Phone", 500.0, 20),
            new Product(3, "Tablet", 300.0, 15)
        };
        InventoryService inventoryService = new InventoryService();
        for (Product product : products) {
            inventoryService.addProduct(product);
        }
        inventoryService.getAllProducts();
        inventoryService.updateStock(1, 5);
        inventoryService.getAllProducts();
        inventoryService.removeProductById(2);
        inventoryService.getAllProducts();
    }
}
