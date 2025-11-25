package JDBC_Project.dao;

import JDBC_Project.customer.Customer;
import JDBC_Project.util.DBConnection;

import java.sql.*;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public void addCustomer(Customer c) {
        String sql = "INSERT INTO customers VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getPhone());
            ps.executeUpdate();

            System.out.println("Customer added!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void viewCustomers() {
        String sql = "SELECT * FROM customers";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- Customers ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("phone")
                );
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void updateCustomer(int id, String name, String phone) {
        String sql = "UPDATE customers SET name=?, phone=? WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setInt(3, id);
            ps.executeUpdate();

            System.out.println("Customer updated!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteCustomer(int id) {
        String sql = "DELETE FROM customers WHERE id=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Customer deleted!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
