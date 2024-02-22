package br.com.cronos.bitabithexagonal.application.ports.out;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
