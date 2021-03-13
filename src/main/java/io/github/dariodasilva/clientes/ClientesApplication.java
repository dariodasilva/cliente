package io.github.dariodasilva.clientes;

import io.github.dariodasilva.clientes.model.entity.Cliente;
import io.github.dariodasilva.clientes.model.entity.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run (@Autowired ClienteRepository repository) {
        return args -> {
            Cliente cliente = new Cliente();
            cliente.setNome("Dario");
            cliente.setCpf("00984374475");
            repository.save(cliente);
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);


    }
}
