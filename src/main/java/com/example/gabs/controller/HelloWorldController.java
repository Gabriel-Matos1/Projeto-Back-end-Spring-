package com.example.gabs.controller;

import com.example.gabs.models.Model;
import com.example.gabs.models.cliente;
import com.example.gabs.service.GerirCliente;
import com.example.gabs.service.HelloWorldService;
import com.example.gabs.service.ativacaoClienteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @PostMapping("/usuario")
    public cliente cadastrar(@RequestBody cliente novo) {
        return GerirCliente.cadastrar(novo);
        }

    @GetMapping("/dash")
    public String showDashboard() {
            return "Bem-vindo!";
    }

    @GetMapping("/inicio")
    public String showInicio() {
        // Lógica para a página inicial
        return "Bem-vindo à página inicial!";
    }

    @GetMapping("/helloWorld")
    public String showHello() {
        return "aaaaaaaaaaa";
    }

}
