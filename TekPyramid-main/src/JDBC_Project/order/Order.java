package JDBC_Project.order;

import java.util.LinkedList;

public class Order {
    private int id;
    private int customerId;
    private LinkedList<Integer> itemIds = new LinkedList<>();

    public Order(int id, int customerId) {
        this.id = id;
        this.customerId = customerId;
    }

    public int getId() { return id; }
    public int getCustomerId() { return customerId; }
    public LinkedList<Integer> getItemIds() { return itemIds; }

    public void setId(int id) { this.id = id; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }
}
