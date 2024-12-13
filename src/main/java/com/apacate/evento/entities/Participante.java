package com.apacate.evento.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "participante", cascade = CascadeType.ALL)
    private List<AtividadeParticipante> atividadeParticipante = new ArrayList<>();

    public Participante() {
    }

    public Participante(Long id, String nome, String email, List<AtividadeParticipante> atividadeParticipante) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AtividadeParticipante> getAtividadeParticipante() {
        return atividadeParticipante;
    }

    public void setAtividadeParticipante(List<AtividadeParticipante> atividadeParticipante) {
        this.atividadeParticipante = atividadeParticipante;
    }
}
