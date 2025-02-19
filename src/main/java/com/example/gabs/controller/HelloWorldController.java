package com.example.gabs.controller;

import com.example.gabs.models.Model;
import com.example.gabs.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.gabs.service.AtivacaoClienteService;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @PostMapping
    public Model helloWorldSave(@RequestBody Model novo) {
        return helloWorldService.helloWorldSave(novo);  // Chamando o serviço para salvar o modelo
    }

    @GetMapping("/dash")
    public String showDashboard() {
            return "Bem-vindo!";
    }

    @Autowired
    private AtivacaoClienteService ativacaoClienteService;

    @GetMapping("/inicio")
    public ResponseEntity<String> showInicio() {
        ativacaoClienteService.teste(1); // Agora chamado corretamente
        return ResponseEntity.ok("Deu certo");
    }

    @GetMapping("/helloWorld")
    public String showHello() {
        return "aaaaaaaaaaa";
    }

}
