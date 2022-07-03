package com.desafio_unidac_grupo_wl.cafedamanha;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio_unidac_grupo_wl.cafedamanha.database.RepositoryColaborador;
import com.desafio_unidac_grupo_wl.cafedamanha.entity.Colaborador;



@RestController
@RequestMapping("/colaborador")
public class ColaboradorREST {
    @Autowired
    private RepositoryColaborador repository;


    // mostrar todos os colaboradores.
    @GetMapping
    public List<Colaborador> listar() {
        return repository.findAll();
    }

    // salvar todos os colaboradores.
    @PostMapping
    public void salvar(@RequestBody Colaborador colaborador) {
        repository.save(colaborador);
    }

    // alterar todos os colaboradores.
    @PutMapping
    public void alterar(@RequestBody Colaborador colaborador) { // @RequestBody converte de json para java.
        if (colaborador.getId()>0) {
            repository.save(colaborador);
        }
    }

    // Excluir
    @DeleteMapping
    public void excluir(@RequestBody Colaborador colaborador) {
        repository.delete(colaborador);
    }
    
    
}
