package com.example.livros.repository;

import com.example.livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface LivrosRepository extends JpaRepository<Livro, Long> {
    public Livro findByNomeLivro(String nomeLivro);
}
