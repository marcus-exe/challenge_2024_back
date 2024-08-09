package fiap.com.example.challenge.repository;

import fiap.com.example.challenge.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
