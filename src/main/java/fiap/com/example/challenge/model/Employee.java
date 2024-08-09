package fiap.com.example.challenge.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Employee {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private final LocalDateTime registerDate;
    private EmployeeFunction employeeFunction;

    public Employee(String firstName, String lastName, String email, String password, String phone, EmployeeFunction employeeFunction) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.employeeFunction = employeeFunction;
        this.registerDate = LocalDateTime.now();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public EmployeeFunction getEmployeeFunction() {
        return employeeFunction;
    }

    public void setEmployeeFunction(EmployeeFunction employeeFunction) {
        this.employeeFunction = employeeFunction;
    }
}
