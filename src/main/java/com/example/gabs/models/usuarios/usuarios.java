package com.example.gabs.models.usuarios;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class usuarios implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String login;
    private String senha;
    private UserRoles role;


    public usuarios(String login, String senha, UserRoles role){
        this.login = login;
        this.senha = senha;
        this.role = role; 
    };
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRoles.ADMIN){
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        }else{
            return List.of(new SimpleGrantedAuthority("ROLE_USER"));
        }
    }
    @Override
    public String getPassword() {
        return senha;
    }
    @Override
    public String getUsername() {
        return login;
        
    }
}
