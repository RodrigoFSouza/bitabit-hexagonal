package br.com.cronos.bitabithexagonal.config;

import br.com.cronos.bitabithexagonal.adapters.out.FindAddressByZipCodeAdapter;
import br.com.cronos.bitabithexagonal.adapters.out.InsertCustomerAdapter;
import br.com.cronos.bitabithexagonal.adapters.out.SendCpfValidationAdapter;
import br.com.cronos.bitabithexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
