package br.com.cronos.bitabithexagonal.adapters.in.consumer.mapper;

import br.com.cronos.bitabithexagonal.adapters.in.consumer.message.CustomerMessage;
import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
