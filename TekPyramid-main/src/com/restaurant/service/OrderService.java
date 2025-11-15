package com.restaurant.service;

import com.restaurant.exception.DuplicateEntryException;
import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.MenuItem;
import com.restaurant.model.Order;

import java.util.HashMap;

public class OrderService {

    private HashMap<Integer, Order> orders = new HashMap<>();

    public void createOrder(int orderId, int customerId) throws DuplicateEntryException {
        if (orders.containsKey(orderId))
            throw new DuplicateEntryException("Order with ID already exists!");

        orders.put(orderId, new Order(orderId, customerId));
    }

    public HashMap<Integer, Order> getAllOrders() {
        return orders;
    }

    public void addItemToOrder(int orderId, MenuItem item) throws ResourceNotFoundException {
        if (!orders.containsKey(orderId))
            throw new ResourceNotFoundException("Order not found!");

        orders.get(orderId).addItem(item);
    }

    public void removeItemFromOrder(int orderId, MenuItem item) throws ResourceNotFoundException {
        if (!orders.containsKey(orderId))
            throw new ResourceNotFoundException("Order not found!");

        orders.get(orderId).removeItem(item);
    }

    public void cancelOrder(int orderId) throws ResourceNotFoundException {
        if (!orders.containsKey(orderId))
            throw new ResourceNotFoundException("Order not found!");

        orders.remove(orderId);
    }
}

