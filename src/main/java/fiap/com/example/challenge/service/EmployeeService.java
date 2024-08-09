package fiap.com.example.challenge.service;

import fiap.com.example.challenge.model.Employee;
import fiap.com.example.challenge.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllAddresses() {
        return employeeRepository.findAll();
    }

    public Employee saveAddress(Employee employee) {
        return employeeRepository.save(employee);
    }
}
