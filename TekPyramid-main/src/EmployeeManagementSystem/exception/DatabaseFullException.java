package EmployeeManagementSystem.exception;

// Custom checked exception
public class DatabaseFullException extends Exception {
    public DatabaseFullException(String message) {
        super(message);
    }
}
