package br.com.cronos.bitabithexagonal.adapters.out;

import br.com.cronos.bitabithexagonal.adapters.out.repository.CustomerRepository;
import br.com.cronos.bitabithexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import br.com.cronos.bitabithexagonal.application.ports.out.FindCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }
}
