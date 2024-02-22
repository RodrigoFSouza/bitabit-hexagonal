package br.com.cronos.bitabithexagonal.application.ports.in;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
