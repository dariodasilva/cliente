package io.github.dariodasilva.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

<<<<<<< HEAD
    @Column( name = "nome_produto",nullable = false, length = 200)
=======
    @Column( nullable = false, length = 200)
>>>>>>> 793e7edeb01c83e83d6549695821d286f279a750
    private String nomeProduto;

    @Column( nullable = false, length = 150)
    private String descricao;

    @Column( nullable = false, length = 150)
    private String marca;



}
