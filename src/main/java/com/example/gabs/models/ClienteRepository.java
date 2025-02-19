package com.example.gabs.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface ClienteRepository extends JpaRepository<cliente, Long> {

    List<cliente> findByName(String name);

    Optional<cliente> findByAtivo(boolean ativo);
    Optional<cliente> findByEmail(String email);
    Optional<cliente> findByIdCliente(Long idCliente);
}
