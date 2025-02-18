package com.example.gabs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gabs.components.notificacao;
import com.example.gabs.models.ClienteRepository;
import com.example.gabs.models.cliente;

@Service
public class ativacaoClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;
    
    public void ativar(cliente cliente){
        Optional<cliente> varCliente = clienteRepository.findById(cliente.getIdCliente());
        varCliente.ifPresent(c ->{
            c.setAtivo(true); 
            notificacao not = new notificacao();
            not.notificar(cliente, "Conta ativada");
        });
    }

    public void desativar(cliente cliente){
        Optional<cliente> varCliente = clienteRepository.findById(cliente.getIdCliente());
        varCliente.ifPresent(c ->{
            c.setAtivo(false); 
            notificacao not = new notificacao();
            not.notificar(cliente, "Conta ativada");
        });

    }

}
