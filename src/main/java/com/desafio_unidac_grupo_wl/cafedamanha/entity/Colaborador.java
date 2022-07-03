package com.desafio_unidac_grupo_wl.cafedamanha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremente.
    private Long id;
    @Column(nullable = false) // Not null.
    private String nome;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String cafe;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCafe() {
        return cafe;
    }
    public void setCafe(String cafe) {
        this.cafe = cafe;
    }

    
    
}
