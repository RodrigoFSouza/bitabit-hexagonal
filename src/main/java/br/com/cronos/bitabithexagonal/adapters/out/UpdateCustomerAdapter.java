package br.com.cronos.bitabithexagonal.adapters.out;

import br.com.cronos.bitabithexagonal.adapters.out.repository.CustomerRepository;
import br.com.cronos.bitabithexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import br.com.cronos.bitabithexagonal.application.ports.out.UpdateCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {
    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
