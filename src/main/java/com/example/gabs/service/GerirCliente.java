package com.example.gabs.service;

import org.springframework.stereotype.Service;
import com.example.gabs.models.cliente;
import com.example.gabs.models.ClienteRepository;

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
