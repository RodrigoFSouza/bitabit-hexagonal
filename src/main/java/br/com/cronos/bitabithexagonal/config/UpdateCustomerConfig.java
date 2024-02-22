package br.com.cronos.bitabithexagonal.config;

import br.com.cronos.bitabithexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.cronos.bitabithexagonal.adapters.out.UpdateCustomerAdapter;
import br.com.cronos.bitabithexagonal.application.core.usecase.FindCustomerByIdUseCase;
import br.com.cronos.bitabithexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter addressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, addressByZipCodeAdapter, updateCustomerAdapter);
    }
}
