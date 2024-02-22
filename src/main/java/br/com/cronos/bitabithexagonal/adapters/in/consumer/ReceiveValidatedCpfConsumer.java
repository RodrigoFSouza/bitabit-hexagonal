package br.com.cronos.bitabithexagonal.adapters.in.consumer;

import br.com.cronos.bitabithexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.cronos.bitabithexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.cronos.bitabithexagonal.application.ports.in.UpdateCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidatedCpfConsumer {
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final CustomerMessageMapper customerMessagemap;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "bitabit")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessagemap.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
