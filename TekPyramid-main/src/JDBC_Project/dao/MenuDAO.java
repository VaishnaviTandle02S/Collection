package JDBC_Project.dao;

import JDBC_Project.menu.MenuItem;

public interface MenuDAO {
    void addMenuItem(MenuItem item);
    void viewMenu();
    void updateMenuItem(int id, String name, double price, String category);
    void deleteMenuItem(int id);
}
