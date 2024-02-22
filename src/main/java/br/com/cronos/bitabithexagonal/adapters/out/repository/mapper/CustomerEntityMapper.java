package br.com.cronos.bitabithexagonal.adapters.out.repository.mapper;

import br.com.cronos.bitabithexagonal.adapters.out.repository.entity.CustomerEntity;
import br.com.cronos.bitabithexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
