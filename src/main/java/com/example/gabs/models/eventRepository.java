package com.example.gabs.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface eventRepository extends JpaRepository<Evento, Long> {

}
