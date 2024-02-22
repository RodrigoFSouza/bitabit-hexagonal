package br.com.cronos.bitabithexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
