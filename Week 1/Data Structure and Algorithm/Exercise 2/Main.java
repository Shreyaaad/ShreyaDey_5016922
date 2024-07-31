package Exercise_2;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Smartphone", "Electronics"),
            new Product("3", "Book", "Books"),
            new Product("4", "Tablet", "Electronics"),
            new Product("5", "Headphones", "Accessories")
        };

        // Linear Search Test
        Product foundProduct1 = LinearSearch.linearSearch(products, "Smartphone");
        System.out.println("Linear Search Result: " + (foundProduct1 != null ? foundProduct1 : "Product not found"));

        // Binary Search Test
        Product foundProduct2 = BinarySearch.binarySearch(products, "Tablet");
        System.out.println("Binary Search Result: " + (foundProduct2 != null ? foundProduct2 : "Product not found"));
    }
}
