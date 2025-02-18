package com.example.gabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gabs.models.Model;
import com.example.gabs.models.ModelRepository;

@Service
public class HelloWorldService {

    @Autowired
    private ModelRepository modelRepository;  // Usando camelCase para o nome da variável

    // Método para salvar o modelo
    public Model helloWorldSave(Model modelo) {
        return modelRepository.save(modelo);  // Salvando o modelo no banco de dados
    }
}
