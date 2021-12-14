package com.developper.modelo_dominio_no_springboot.entities;


import jdk.jfr.DataAmount;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Client(){
    }

    public Client(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
   
}
