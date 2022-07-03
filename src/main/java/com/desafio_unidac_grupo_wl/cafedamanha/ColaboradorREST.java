package com.desafio_unidac_grupo_wl.cafedamanha;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desafio_unidac_grupo_wl.cafedamanha.database.RepositoryColaborador;
import com.desafio_unidac_grupo_wl.cafedamanha.entity.Colaborador;




public class ColaboradorREST {
    @Autowired
    private RepositoryColaborador repository;

    public List<Colaborador> listar() {
        return repository.findAll();

    }

    
    
}
