package io.github.dariodasilva.clientes.rest;

import io.github.dariodasilva.clientes.model.entity.Cliente;
import io.github.dariodasilva.clientes.model.entity.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    public final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar( @RequestBody Cliente cliente){
        return repository.save(cliente);

    }

    @GetMapping("{id}")
    public Cliente obterPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id){
        repository.findById(id).map( cliente -> {
            repository.delete(cliente);
            return Void.TYPE;
        } ).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
