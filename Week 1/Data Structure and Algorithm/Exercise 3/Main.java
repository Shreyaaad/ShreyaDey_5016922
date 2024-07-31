package Exercise_3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "Diana", 100.0),
            new Order("5", "Edward", 200.0)
        };

        // Bubble Sort Test
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);

        System.out.println("After Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        
        orders = new Order[]{
            new Order("1", "Alice", 250.0),
            new Order("2", "Bob", 150.0),
            new Order("3", "Charlie", 300.0),
            new Order("4", "Diana", 100.0),
            new Order("5", "Edward", 200.0)
        };

        // Quick Sort Test
        System.out.println("Before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        QuickSort.quickSort(orders, 0, orders.length - 1);

        System.out.println("After Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
