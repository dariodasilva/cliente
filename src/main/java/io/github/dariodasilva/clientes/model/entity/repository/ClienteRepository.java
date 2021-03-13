package io.github.dariodasilva.clientes.model.entity.repository;

import io.github.dariodasilva.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
