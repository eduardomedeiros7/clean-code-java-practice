package chapter02;

import java.util.ArrayList;
import java.util.List;


public class RevealIntent {

    public List<double[]> getItems(List<double[]> list) {
        List<double[]> list1 = new ArrayList<>();
        for (double[] x : list) {
            if (x[0] > 1000) {
                list1.add(x);
            }
        }
        return list1;
    }

    private static final double MINIMUM_HIGH_VALUE_AMOUNT = 1000.0;

    public List<Order> getHighValueOrders(List<Order> allOrders) {
        List<Order> highValueOrders = new ArrayList<>();

        for (Order order : allOrders) {
            if (order.getTotalAmount() > MINIMUM_HIGH_VALUE_AMOUNT) {
                highValueOrders.add(order);
            }
        }
        return highValueOrders;
    }
}

/**
 * A simple Order class to support the clean example.
 * Names like 'totalAmount' reveal exactly what the data represents.
 */
class Order {
    private double totalAmount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}