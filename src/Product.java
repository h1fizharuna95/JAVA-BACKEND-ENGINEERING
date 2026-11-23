package InventorySystem.src;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void addStock(int amount) {
        quantity += amount;
        System.out.println(amount + "number of item was added");
    }
}
