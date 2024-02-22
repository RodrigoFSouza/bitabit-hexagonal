package br.com.cronos.bitabithexagonal.application.ports.out;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
