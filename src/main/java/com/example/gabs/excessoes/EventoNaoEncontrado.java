package com.example.gabs.excessoes;

public class EventoNaoEncontrado extends RuntimeException {

    public EventoNaoEncontrado(){
        super("Evento Não Encontrado!");
    }
    
    public EventoNaoEncontrado(String mensage){ 
        super(mensage);
    }
}
