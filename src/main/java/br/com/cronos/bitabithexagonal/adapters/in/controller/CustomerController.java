package br.com.cronos.bitabithexagonal.adapters.in.controller;

import br.com.cronos.bitabithexagonal.adapters.in.controller.mapper.CustomerMapper;
import br.com.cronos.bitabithexagonal.adapters.in.controller.request.CustomerRequest;
import br.com.cronos.bitabithexagonal.adapters.in.controller.response.CustomerResponse;
import br.com.cronos.bitabithexagonal.application.ports.in.FindCustomerByIdInputPort;
import br.com.cronos.bitabithexagonal.application.ports.in.InsertCustomerInputPort;
import br.com.cronos.bitabithexagonal.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final InsertCustomerInputPort insertCustomerInputPort;
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest request) {
        var customer = customerMapper.toCustomer(request);
        insertCustomerInputPort.insert(customer, request.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

}
