package EmployeeManagementSystem.service;

import EmployeeManagementSystem.model.Employee;
import EmployeeManagementSystem.exception.EmployeeNotFoundException;
import EmployeeManagementSystem.exception.DatabaseFullException;

// Manager class implements all operations defined in IEmployeeOperations
public class Manager implements IEmployeeOperations {

    // Using Array as a database
    private Employee[] db = new Employee[5]; // can store up to 5 employees
    private int count = 0; // to track how many employees are added

    @Override
    public void addEmployee(Employee emp) throws DatabaseFullException {
        if (count >= db.length) {
            throw new DatabaseFullException("Database is full! Cannot add more employees.");
        }
        db[count++] = emp;
        System.out.println("Employee added successfully!");
    }

    @Override
    public void listEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(db[i]);
        }
    }

    @Override
    public void findEmployeeById(int id) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() == id) {
                System.out.println("Employee Found: " + db[i]);
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee ID " + id + " not found!");
    }

    @Override
    public void updateEmployee(int id, String newName, double newSalary) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() == id) {
                db[i].setName(newName);
                db[i].setSalary(newSalary);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee ID " + id + " not found!");
    }

    @Override
    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() == id) {
                // Shift remaining elements to fill the gap
                for (int j = i; j < count - 1; j++) {
                    db[j] = db[j + 1];
                }
                db[--count] = null;
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        throw new EmployeeNotFoundException("Employee ID " + id + " not found!");
    }
}
