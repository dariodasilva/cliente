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
/*
* A criação do método abaixo permite ser o entrypoint da aplicação
* para execução como Command Line de alguma instrução, como no caso
* abaixo, a persistência de uma entidade.
* */

//    @Bean
//    public CommandLineRunner run (@Autowired ClienteRepository repository) {
//        return args -> {
//            Cliente cliente = Cliente.builder().cpf("00988589878").nome("BLITZ FIRMINO").build();
//            repository.save(cliente);
//        };
//    }
    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);


    }
}
