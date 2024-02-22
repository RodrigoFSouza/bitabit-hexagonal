package br.com.cronos.bitabithexagonal.application.core.usecase;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import br.com.cronos.bitabithexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
