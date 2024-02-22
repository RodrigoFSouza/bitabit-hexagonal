package br.com.cronos.bitabithexagonal.adapters.out;

import br.com.cronos.bitabithexagonal.adapters.out.client.FindAddressByZipCodeClient;
import br.com.cronos.bitabithexagonal.adapters.out.client.mapper.AddressResponseMapper;
import br.com.cronos.bitabithexagonal.application.core.domain.Address;
import br.com.cronos.bitabithexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
