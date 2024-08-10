package fiap.com.example.challenge.repository;

import fiap.com.example.challenge.model.Employee;
import fiap.com.example.challenge.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
