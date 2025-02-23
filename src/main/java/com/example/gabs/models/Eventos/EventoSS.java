

package com.example.gabs.models.Eventos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventoSS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEvento;
    private String nome;
    private Long idCliente;
    private String dataE;

    public Long getIdEvento(){
        return idEvento;
    }
    public void setIdEvento(Long idEvento){
        this.idEvento = idEvento;
    }


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
    public String getDataE(){
        return dataE;
    }
    public void setDataE(String dataE){
        this.dataE = dataE;
    }
}
