package JDBC_Project.dao;

import JDBC_Project.customer.Customer;

public interface CustomerDAO {
    void addCustomer(Customer c);
    void viewCustomers();
    void updateCustomer(int id, String name, String phone);
    void deleteCustomer(int id);
}
