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

    @Column( nullable = false, length = 200)
    private String nomeProduto;

    @Column( nullable = false, length = 150)
    private String descricao;

    @Column( nullable = false, length = 150)
    private String marca;



}
