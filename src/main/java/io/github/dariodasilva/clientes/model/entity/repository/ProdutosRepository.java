package io.github.dariodasilva.clientes.model.entity.repository;

import io.github.dariodasilva.clientes.model.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
}
