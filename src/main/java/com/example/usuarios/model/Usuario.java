package com.example.usuarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //  Diz: essa classe vira uma tabela
public class Usuario {

    @Id  //  Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  ID automático
    private Long id;  //  Cada atributo → vira uma coluna no banco

    private String nome;
    private String email;

    //getters e satters
}
