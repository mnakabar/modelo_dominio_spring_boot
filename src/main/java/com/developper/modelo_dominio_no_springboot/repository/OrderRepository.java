package com.developper.modelo_dominio_no_springboot.repository;

import com.developper.modelo_dominio_no_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Long> {
}
