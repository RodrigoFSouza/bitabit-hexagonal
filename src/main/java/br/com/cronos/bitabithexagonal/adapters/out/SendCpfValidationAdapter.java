package br.com.cronos.bitabithexagonal.adapters.out;

import br.com.cronos.bitabithexagonal.application.ports.out.SendCpfForValidationOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {
    private static final String TOPIC_CPF_VALIDATION = "tp-cpf-validation";
    private KafkaTemplate<String, String> kafkaTemplate;


    @Override
    public void send(String cpf) {
        kafkaTemplate.send(TOPIC_CPF_VALIDATION, cpf);
    }
}
