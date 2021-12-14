package com.developper.modelo_dominio_no_springboot.repository;

import com.developper.modelo_dominio_no_springboot.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {
}
