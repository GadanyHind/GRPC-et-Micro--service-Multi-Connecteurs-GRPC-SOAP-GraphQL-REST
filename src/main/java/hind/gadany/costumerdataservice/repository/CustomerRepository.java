package hind.gadany.costumerdataservice.repository;

import hind.gadany.costumerdataservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
