package com.developper.modelo_dominio_no_springboot.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    public Product(){

    }
    public Product(Long id,String name,Double price ){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
