package com.apacate.evento.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<BlocoHorario> blocos = new ArrayList<>();

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<AtividadeParticipante> atividadeParticipante = new ArrayList<>();


    public Atividade() {
    }

    public Atividade(Long id, String nome, String descricao, Double preco, Categoria categoria, List<BlocoHorario> blocos, List<AtividadeParticipante> atividadeParticipante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.blocos = blocos;
        this.atividadeParticipante = atividadeParticipante;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<BlocoHorario> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<BlocoHorario> blocos) {
        this.blocos = blocos;
    }

    public List<AtividadeParticipante> getAtividadeParticipante() {
        return atividadeParticipante;
    }

    public void setAtividadeParticipante(List<AtividadeParticipante> atividadeParticipante) {
        this.atividadeParticipante = atividadeParticipante;
    }
}