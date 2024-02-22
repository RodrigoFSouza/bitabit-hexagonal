package br.com.cronos.bitabithexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BitabitHexagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(BitabitHexagonalApplication.class, args);
    }

}
