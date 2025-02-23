package com.example.gabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.gabs.models.usuarios.AuthenticationDTO;
import com.example.gabs.models.usuarios.RegistrarDTO;
import com.example.gabs.models.usuarios.UsuarioRepository;
import com.example.gabs.models.usuarios.usuarios;
import com.example.gabs.infra.Security.SecurityConfiguration;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioRepository userRepo;


    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthenticationDTO userDTO) {
        try {
            var usernamePasswordToken = new UsernamePasswordAuthenticationToken(userDTO.login(), userDTO.Senha());
            var authentication = this.authenticationManager.authenticate(usernamePasswordToken);

            return ResponseEntity.ok().body("Login realizado com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas.");
        }
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegistrarDTO data) {
        // Verifica se o login já está cadastrado
        if (this.userRepo.findByLogin(data.login()) != null) {
            return ResponseEntity.badRequest().build();
        }

        // Encripta a senha antes de salvar no banco
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.Senha());

        // Cria o novo usuário
        usuarios newUser = new usuarios(data.login(), encryptedPassword, data.Role());

        // Salva o usuário no banco de dados
        this.userRepo.save(newUser);

        // Retorna uma resposta de sucesso
        return ResponseEntity.ok().build();
    }   
}
