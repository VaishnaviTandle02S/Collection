package JDBC_Project.menu;

import JDBC_Project.util.DBConnection;
import java.sql.*;

public class MenuService {

    // Add menu item
    public void addMenuItem(MenuItem item) {
        String sql = "INSERT INTO menu_items (id, name, price, category) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, item.getId());
            ps.setString(2, item.getName());
            ps.setDouble(3, item.getPrice());
            ps.setString(4, item.getCategory());

            ps.executeUpdate();
            System.out.println("Menu Item Added!");

        } catch (SQLException e) {
            System.out.println("Error adding menu item: " + e.getMessage());
        }
    }

    // View all menu items
    public void viewMenu() {
        String sql = "SELECT * FROM menu_items";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- MENU ITEMS ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getDouble("price") + " | " +
                                rs.getString("category")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error viewing menu: " + e.getMessage());
        }
    }

    // Update menu item
    public void updateMenuItem(int id, String name, double price, String category) {
        String sql = "UPDATE menu_items SET name=?, price=?, category=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setString(3, category);
            ps.setInt(4, id);

            ps.executeUpdate();
            System.out.println("Menu Item Updated!");

        } catch (SQLException e) {
            System.out.println("Error updating menu item: " + e.getMessage());
        }
    }

    // Delete menu item
    public void deleteMenuItem(int id) {
        String sql = "DELETE FROM menu_items WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Menu Item Deleted!");

        } catch (SQLException e) {
            System.out.println("Error deleting menu item: " + e.getMessage());
        }
    }
}
