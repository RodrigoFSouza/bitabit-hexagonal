package br.com.cronos.bitabithexagonal.application.core.usecase;

import br.com.cronos.bitabithexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.cronos.bitabithexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.cronos.bitabithexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);

        deleteCustomerByIdOutputPort.delete(id);
    }
}
