package br.com.cronos.bitabithexagonal.application.core.usecase;

import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import br.com.cronos.bitabithexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort  insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);

        customer.addAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
