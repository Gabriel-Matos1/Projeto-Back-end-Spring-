package com.example.gabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gabs.models.cliente;
import com.example.gabs.models.ClienteRepository;
@Service
public class GerirCliente {

    @Autowired
    ClienteRepository clienteRepository;
    
    public cliente cadastrar(cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(cliente cliente){
        clienteRepository.delete(cliente);
    }
}
