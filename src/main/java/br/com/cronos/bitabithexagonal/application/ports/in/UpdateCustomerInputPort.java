package br.com.cronos.bitabithexagonal.application.ports.in;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
