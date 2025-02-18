package com.example.gabs.models;

import jakarta.persistence.Entity;

@Entity
public class Evento {

    private String nome;
    private Long idCliente;
    private String data;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Long getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(Long idCliente){
        this.idCliente = idCliente;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
}
