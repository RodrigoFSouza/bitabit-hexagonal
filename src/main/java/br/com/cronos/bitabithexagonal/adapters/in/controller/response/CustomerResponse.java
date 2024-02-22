package br.com.cronos.bitabithexagonal.adapters.in.controller.response;

import br.com.cronos.bitabithexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
