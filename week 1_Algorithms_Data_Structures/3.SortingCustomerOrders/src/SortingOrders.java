// SortingOrders.java
public class SortingOrders {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Alice", 120.50),
                new Order("2", "Bob", 95.00),
                new Order("3", "Charlie", 150.75),
                new Order("4", "David", 80.25)
        };

        // Bubble Sort
        BubbleSort.sort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Prepare data for Quick Sort
        Order[] ordersForQuickSort = {
                new Order("1", "Alice", 120.50),
                new Order("2", "Bob", 95.00),
                new Order("3", "Charlie", 150.75),
                new Order("4", "David", 80.25)
        };

        // Quick Sort
        QuickSort.sort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
