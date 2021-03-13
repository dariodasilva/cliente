package io.github.dariodasilva.clientes.model.entity.repository;

import io.github.dariodasilva.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
