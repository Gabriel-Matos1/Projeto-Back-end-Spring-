package com.example.gabs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.gabs.components.notificacao;
import com.example.gabs.excessoes.EventoNaoEncontrado;
import com.example.gabs.models.clientes.ClienteRepository;
import com.example.gabs.models.clientes.cliente;

@Service
public class AtivacaoClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private notificacao notificacao;

    public void teste(int num){
        if(num == 1){
            throw new EventoNaoEncontrado("Evento nao encontrado");
        }

    }

    public void ativar(cliente cliente) {
        clienteRepository.findById(cliente.getIdCliente()).ifPresent(c -> {
            c.setAtivo(true);
            clienteRepository.save(c); // Persistindo a alteração
            notificacao.notificar(c, "Conta ativada");
        });
    }

    public void desativar(cliente cliente) {
        clienteRepository.findById(cliente.getIdCliente()).ifPresent(c -> {
            c.setAtivo(false);
            clienteRepository.save(c); // Persistindo a alteração
            notificacao.notificar(c, "Conta desativada"); // Corrigida a mensagem
        });
    }
}

