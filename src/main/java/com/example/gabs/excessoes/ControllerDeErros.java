package com.example.gabs.excessoes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerDeErros extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventoNaoEncontrado.class)
    public ResponseEntity<String> eventoNaoAchadoHandler(EventoNaoEncontrado exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not foundaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!");
    }

    @ExceptionHandler(EventoCheio.class)
    public ResponseEntity<String> eventoCheioHandler(EventoCheio exception) {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Evento Cheio");
    }


    @ExceptionHandler(ClienteNaoEncontrado.class)
    public ResponseEntity<String> ClienteNaoEncontradoHandler(ClienteNaoEncontrado exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
    }

    
}
