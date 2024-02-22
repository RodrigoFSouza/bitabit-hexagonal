package br.com.cronos.bitabithexagonal.adapters.out.client.mapper;

import br.com.cronos.bitabithexagonal.adapters.out.client.response.AddressResponse;
import br.com.cronos.bitabithexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
