package com.example.gabs.components;

import org.springframework.stereotype.Component;

import com.example.gabs.models.cliente;

@Component
public class notificacao {


    public void notificar(cliente cliente, String mensagem){

        System.out.printf("Notificando %s através do e-mail %s: %s \n", 
    cliente.getName(), cliente.getEmail(), mensagem);

    }
}
