package fiap.com.example.challenge.repository;

import fiap.com.example.challenge.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
