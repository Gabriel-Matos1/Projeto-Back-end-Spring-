package com.example.gabs.service;

import org.springframework.stereotype.Service;

import com.example.gabs.models.clientes.ClienteRepository;
import com.example.gabs.models.clientes.cliente;

@Service
public class GerirCliente {

    
    ClienteRepository clienteRepository;
    
    public cliente cadastrar(cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(cliente cliente){
        clienteRepository.delete(cliente);
    }
}
