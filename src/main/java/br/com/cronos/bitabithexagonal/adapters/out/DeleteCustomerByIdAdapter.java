package br.com.cronos.bitabithexagonal.adapters.out;

import br.com.cronos.bitabithexagonal.adapters.out.repository.CustomerRepository;
import br.com.cronos.bitabithexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {
    private final CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
