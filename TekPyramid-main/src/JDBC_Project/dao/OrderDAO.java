package JDBC_Project.dao;

import JDBC_Project.order.Order;

public interface OrderDAO {
    void createOrder(Order order);
    void viewOrders();
}
