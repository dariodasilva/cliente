<<<<<<< HEAD
package io.github.dariodasilva.clientes.rest;

import io.github.dariodasilva.clientes.model.entity.Produtos;
import io.github.dariodasilva.clientes.model.entity.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.TransactionRequiredException;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    public final ProdutosRepository repository;

    @Autowired
    public ProdutosController(ProdutosRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produtos salvar(@RequestBody Produtos produtos){
        return repository.save(produtos);
    }

    @GetMapping("{id}")
    public Produtos obterProdutosPorId( @PathVariable Integer id){
        return repository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
=======
package io.github.dariodasilva.clientes.rest;public class ProdutosController {
>>>>>>> 793e7edeb01c83e83d6549695821d286f279a750
}
