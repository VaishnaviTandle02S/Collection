package com.restaurant.service;

import com.restaurant.exception.DuplicateEntryException;
import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.exception.InvalidInputException;
import com.restaurant.model.Customer;

import java.util.HashMap;

public class CustomerService {

    private HashMap<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) throws DuplicateEntryException, InvalidInputException {

        if (customers.containsKey(customer.getId())) {
            throw new DuplicateEntryException("Customer with ID already exists!");
        }

        // VALIDATE phone number - must be exactly 10 digits
        if (!customer.getPhone().matches("\\d{10}")) {
            throw new InvalidInputException("Phone number must be exactly 10 digits!");
        }

        customers.put(customer.getId(), customer);
    }

    public HashMap<Integer, Customer> getAllCustomers() {
        return customers;
    }

    public void updateCustomer(int id, String newName, String newPhone)
            throws ResourceNotFoundException, InvalidInputException {

        if (!customers.containsKey(id)) {
            throw new ResourceNotFoundException("Customer not found!");
        }

        Customer c = customers.get(id);

        // ❌ Restrict updating name
        if (!newName.equals(c.getName())) {
            throw new InvalidInputException("Name cannot be updated! It is restricted.");
        }

        // ✔ validate 10-digit phone
        if (!newPhone.matches("\\d{10}")) {
            throw new InvalidInputException("Phone number must be exactly 10 digits!");
        }

        // Only phone is updated
        c.setPhone(newPhone);
    }

    public void deleteCustomer(int id) throws ResourceNotFoundException {
        if (!customers.containsKey(id))
            throw new ResourceNotFoundException("Customer not found!");

        customers.remove(id);
    }
}
