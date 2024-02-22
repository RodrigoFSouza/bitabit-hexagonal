package br.com.cronos.bitabithexagonal.config;

import br.com.cronos.bitabithexagonal.adapters.out.DeleteCustomerByIdAdapter;
import br.com.cronos.bitabithexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.cronos.bitabithexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
