package EmployeeManagementSystem.exception;

// Custom checked exception
public class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
