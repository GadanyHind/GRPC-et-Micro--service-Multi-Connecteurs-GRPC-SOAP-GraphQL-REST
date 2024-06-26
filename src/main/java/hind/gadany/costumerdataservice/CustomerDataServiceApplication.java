package hind.gadany.costumerdataservice;

import hind.gadany.costumerdataservice.entities.Customer;
import hind.gadany.costumerdataservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerDataServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Hassan").email("hind@gmail.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("gadany@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("wissal@gmail.com").build());
        };
    }
}
