package com.example.gabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gabs.excessoes.ClienteNaoEncontrado;
import com.example.gabs.models.ClienteRepository;
import com.example.gabs.models.cliente;

@Service
public class clienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public List<cliente> ListarTodos(){
        List<cliente> clients_buscados = clienteRepository.findAll();
        
        if(clients_buscados.isEmpty()){
            throw new ClienteNaoEncontrado();


        }
        return clients_buscados;

    }

    public cliente buscarPorId(Long id){
        return clienteRepository.findByIdCliente(id)
                .orElseThrow(ClienteNaoEncontrado::new);  // Retorna 404 caso não encontre
    }

    public List<cliente> buscarPorNome(String nome){
        List<cliente> clients_buscados = clienteRepository.findByName(nome);
        if(clients_buscados.isEmpty()){
            throw new ClienteNaoEncontrado();
        }
        return clients_buscados;
    }
}
