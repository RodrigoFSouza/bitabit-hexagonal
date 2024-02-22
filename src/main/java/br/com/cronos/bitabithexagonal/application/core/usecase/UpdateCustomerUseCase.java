package br.com.cronos.bitabithexagonal.application.core.usecase;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import br.com.cronos.bitabithexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.cronos.bitabithexagonal.application.ports.in.UpdateCustomerInputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.addAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
