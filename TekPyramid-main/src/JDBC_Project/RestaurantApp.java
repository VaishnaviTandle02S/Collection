package JDBC_Project;

import JDBC_Project.dao.*;
import JDBC_Project.customer.Customer;
import JDBC_Project.menu.MenuItem;
import JDBC_Project.order.Order;

import java.util.*;

public class RestaurantApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDAO customerDAO = new CustomerDAOImpl();
        MenuDAO menuDAO = new MenuDAOImpl();
        OrderDAO orderDAO = new OrderDAOImpl();

        while (true) {
            System.out.println("\n=== RESTAURANT SYSTEM ===");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Add Menu Item");
            System.out.println("4. View Menu");
            System.out.println("5. Create Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Name: ");
                    String cname = sc.next();
                    System.out.print("Phone: ");
                    String phone = sc.next();
                    customerDAO.addCustomer(new Customer(cid, cname, phone));
                    break;

                case 2:
                    customerDAO.viewCustomers();
                    break;

                case 3:
                    System.out.print("Item ID: ");
                    int mid = sc.nextInt();
                    System.out.print("Name: ");
                    String mname = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Category: ");
                    String cat = sc.next();
                    menuDAO.addMenuItem(new MenuItem(mid, mname, price, cat));
                    break;

                case 4:
                    menuDAO.viewMenu();
                    break;

                case 5:
                    System.out.print("Order ID: ");
                    int oid = sc.nextInt();
                    System.out.print("Customer ID: ");
                    int ocid = sc.nextInt();

                    Order order = new Order(oid, ocid);

                    System.out.print("How many items? ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Item ID: ");
                        int itemId = sc.nextInt();
                        order.getItemIds().add(itemId);
                    }

                    orderDAO.createOrder(order);
                    break;

                case 6:
                    orderDAO.viewOrders();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
