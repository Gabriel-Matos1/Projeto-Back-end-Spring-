package com.example.gabs.models.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<usuarios, String> {

    UserDetails findByLogin(String login);
    
}
