package com.example.gabs.excessoes;

public class ClienteNaoEncontrado extends RuntimeException{

    public ClienteNaoEncontrado(){
        super("Cliente não encontrado");
    }
    
    public ClienteNaoEncontrado(String mensage){ 
        super(mensage);
    }
}
