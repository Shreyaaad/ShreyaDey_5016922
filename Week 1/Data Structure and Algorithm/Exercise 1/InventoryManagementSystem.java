package Exercise_1;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("1", "Product 1", 10, 99.99);
        Product product2 = new Product("2", "Product 2", 5, 199.99);
        ims.addProduct(product1);
        ims.addProduct(product2);

        product1.setQuantity(15);
        ims.updateProduct(product1);

        System.out.println(ims.getProduct("1"));

        ims.deleteProduct("2");
    }
}
