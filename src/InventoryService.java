package InventorySystem.src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class InventoryService {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        
        for (Product existing : products) {
            if(existing.getId() == product.getId()) {
                existing.addStock(product.getQuantity());
                return;
            }
        }
        products.add(product);
    }
    public List<Product> getAllProducts() {
        for(Product product : products) {
            System.out.println("name:"+product.getName()+" price:" + product.getPrice()+" quantity:"+ product.getQuantity());
        }
        return Collections.unmodifiableList(products);
    }
    public Product findProductById (int Id) {
        for (Product product : products){
            if(product.getId() == Id){
                System.out.println("name:"+product.getName()+" price:" + product.getPrice()+" quantity:"+ product.getQuantity());
                return product;
            }

        }
        return null;

    }
    public void updateStock (int id,int quantity) {
        Product item = findProductById(id);
        if(item != null){
            item.addStock(quantity);
            return;
        } 
        System.out.println("no item was found");
        return;
    }

    public void removeProductById(int id){
        Product item = findProductById(id);
        if(item != null) {
            products.remove(item);
            System.out.println("item was removed");
            return;
        }
        System.out.println("no item was found");

    }



}
