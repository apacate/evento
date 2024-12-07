package com.apacate.evento;

import com.apacate.evento.entities.Atividade;
import com.apacate.evento.entities.Categoria;
import com.apacate.evento.repositories.AtividadeRepository;
import com.apacate.evento.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private AtividadeRepository atividadeRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {

        Categoria tecnologia = new Categoria();
        tecnologia.setDescricao("Tecnologia");
/*
        Categoria ciencias = new Categoria();
        ciencias.setDescricao("Ciências");

        categoriaRepository.saveAll(List.of(tecnologia, ciencias));

        // Criar atividades e associá-las às categorias
        Atividade atividade1 = new Atividade();
        atividade1.setNome("Workshop de Java");
        atividade1.setDescricao("Aprenda Java com projetos práticos.");
        atividade1.setPreco(100.0);
        atividade1.setCategoria(tecnologia);

        Atividade atividade2 = new Atividade();
        atividade2.setNome("Introdução à Física Quântica");
        atividade2.setDescricao("Fundamentos e aplicações da física quântica.");
        atividade2.setPreco(150.0);
        atividade2.setCategoria(ciencias);

        atividadeRepository.saveAll(List.of(atividade1, atividade2));

 */
    }
}

