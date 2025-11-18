package EmployeeManagementSystem.main;


import java.util.Scanner;
import EmployeeManagementSystem.model.Employee;
import EmployeeManagementSystem.service.*;
import EmployeeManagementSystem.exception.*;

// Main class → Application entry point
public class EmployeeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Polymorphism: interface reference holding Manager object
        IEmployeeOperations manager = new Manager();

        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Find Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume leftover newline
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        manager.addEmployee(new Employee(id, name, salary));
                        break;

                    case 2:
                        manager.listEmployees();
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to Find: ");
                        int findId = sc.nextInt();
                        manager.findEmployeeById(findId);
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to Update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New Salary: ");
                        double newSalary = sc.nextDouble();
                        manager.updateEmployee(updateId, newName, newSalary);
                        break;

                    case 5:
                        System.out.print("Enter Employee ID to Delete: ");
                        int deleteId = sc.nextInt();
                        manager.deleteEmployee(deleteId);
                        break;

                    case 6:
                        System.out.println("Exiting Employee Management System. Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println(" Invalid choice! Please enter between 1–6.");
                }
            }
            catch (EmployeeNotFoundException | DatabaseFullException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
    }
}
