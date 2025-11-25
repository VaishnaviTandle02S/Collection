package JDBC_Project.dao;

import JDBC_Project.menu.MenuItem;
import JDBC_Project.util.DBConnection;

import java.sql.*;

public class MenuDAOImpl implements MenuDAO {

    @Override
    public void addMenuItem(MenuItem item) {
        String sql = "INSERT INTO menu_items VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, item.getId());
            ps.setString(2, item.getName());
            ps.setDouble(3, item.getPrice());
            ps.setString(4, item.getCategory());
            ps.executeUpdate();

            System.out.println("Item added!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void viewMenu() {
        String sql = "SELECT * FROM menu_items";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- MENU ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getDouble("price") + " | " +
                                rs.getString("category")
                );
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void updateMenuItem(int id, String name, double price, String category) {
        String sql = "UPDATE menu_items SET name=?, price=?, category=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setString(3, category);
            ps.setInt(4, id);

            ps.executeUpdate();
            System.out.println("Item updated!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteMenuItem(int id) {
        String sql = "DELETE FROM menu_items WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Item deleted!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
