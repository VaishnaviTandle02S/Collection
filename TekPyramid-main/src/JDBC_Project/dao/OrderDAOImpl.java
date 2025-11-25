package JDBC_Project.dao;

import JDBC_Project.order.Order;
import JDBC_Project.util.DBConnection;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public void createOrder(Order order) {
        String sqlOrder = "INSERT INTO orders VALUES (?, ?)";
        String sqlOrderItem = "INSERT INTO order_items VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps1 = con.prepareStatement(sqlOrder);
        ) {
            ps1.setInt(1, order.getId());
            ps1.setInt(2, order.getCustomerId());
            ps1.executeUpdate();

            for (int itemId : order.getItemIds()) {
                PreparedStatement ps2 = con.prepareStatement(sqlOrderItem);
                ps2.setInt(1, order.getId());
                ps2.setInt(2, itemId);
                ps2.executeUpdate();
                ps2.close();
            }

            System.out.println("Order created!");

        } catch (Exception e) {
            System.out.println("Order Error: " + e.getMessage());
        }
    }

    @Override
    public void viewOrders() {
        String sql = "SELECT * FROM orders";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- ORDERS ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | Customer: " + rs.getInt("customer_id"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
