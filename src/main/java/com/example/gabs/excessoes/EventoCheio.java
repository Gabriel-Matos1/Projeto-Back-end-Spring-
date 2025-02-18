package com.example.gabs.excessoes;

public class EventoCheio extends RuntimeException{

    public EventoCheio(){
        super("Evento está lotado!");
    }
    
    public EventoCheio(String mensage){ 
        super(mensage);
    }
}
