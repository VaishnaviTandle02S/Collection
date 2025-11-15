package com.restaurant.service;

import com.restaurant.exception.DuplicateEntryException;
import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.Customer;

import java.util.HashMap;

public class CustomerService {

    private HashMap<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) throws DuplicateEntryException {
        if (customers.containsKey(customer.getId())) {
            throw new DuplicateEntryException("Customer with ID already exists!");
        }
        customers.put(customer.getId(), customer);
    }

    public HashMap<Integer, Customer> getAllCustomers() {
        return customers;
    }

    public void updateCustomer(int id, String name, String phone)
            throws ResourceNotFoundException {
        if (!customers.containsKey(id)) {
            throw new ResourceNotFoundException("Customer not found!");
        }
        Customer c = customers.get(id);
        c.setName(name);
        c.setPhone(phone);
    }

    public void deleteCustomer(int id) throws ResourceNotFoundException {
        if (!customers.containsKey(id))
            throw new ResourceNotFoundException("Customer not found!");

        customers.remove(id);
    }
}
