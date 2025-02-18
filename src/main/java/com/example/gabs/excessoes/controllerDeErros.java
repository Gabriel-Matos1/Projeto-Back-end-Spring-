package com.example.gabs.excessoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.example.gabs.excessoes.EventoNaoEncontrado;
import com.example.gabs.excessoes.EventoCheio;

@ControllerAdvice

public class controllerDeErros extends ResponseEntityExceptionHandler {
    
    private ResponseEntity<String> EventoNaoAchadoHandler(EventoNaoEncontrado exception){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found!");
    }


    private ResponseEntity<String> EventoCheioHancler(EventoCheio exception){
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Evento Cheio");
    }
}
