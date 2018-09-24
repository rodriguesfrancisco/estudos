package com.example.livros.controller;

import com.example.livros.model.Livro;
import com.example.livros.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivrosController {

    @Autowired
    private LivrosRepository livrosRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Livro> findAll(){
        return livrosRepository.findAll();
    }

    @PostMapping
    @RequestMapping(value = "/create")
    public ResponseEntity<Livro> create(@RequestBody final Livro livro){
        livrosRepository.save(livro);
        return new ResponseEntity<Livro>(livrosRepository.findByNomeLivro(livro.getNomeLivro()), HttpStatus.OK);
    }
}
