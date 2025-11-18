package EmployeeManagementSystem.service;

import EmployeeManagementSystem.model.Employee;
import EmployeeManagementSystem.exception.EmployeeNotFoundException;
import EmployeeManagementSystem.exception.DatabaseFullException;

public interface IEmployeeOperations {
    void addEmployee(Employee emp) throws DatabaseFullException;
    void listEmployees();
    void findEmployeeById(int id) throws EmployeeNotFoundException;
    void updateEmployee(int id, String newName, double newSalary) throws EmployeeNotFoundException;
    void deleteEmployee(int id) throws EmployeeNotFoundException;
}
