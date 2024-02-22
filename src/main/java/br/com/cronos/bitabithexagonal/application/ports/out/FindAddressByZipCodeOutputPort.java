package br.com.cronos.bitabithexagonal.application.ports.out;

import br.com.cronos.bitabithexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
