package com.developper.modelo_dominio_no_springboot.repository;

import com.developper.modelo_dominio_no_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
