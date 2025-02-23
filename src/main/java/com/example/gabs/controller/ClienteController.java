package com.example.gabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gabs.models.clientes.cliente;
import com.example.gabs.service.clienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private clienteService ClienteService;

    @GetMapping("/{id}")
    public ResponseEntity<cliente> buscarPorId(@PathVariable Long id) {
        cliente clienteBuscado = ClienteService.buscarPorId(id);
        return ResponseEntity.ok(clienteBuscado);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<cliente>> listarTodos() {
        List<cliente> clientes = ClienteService.ListarTodos();
        return ResponseEntity.ok(clientes);
    }


    @GetMapping("/buscar/{nome}")
    public ResponseEntity<String> buscarPorNome(@PathVariable String nome) {
       /*  List<cliente> clientes = ClienteService.buscarPorNome(nome);
        return ResponseEntity.ok(clientes);
    */
    return ResponseEntity.ok("Deu certo");

        }
}
