package com.apacate.evento.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "atividade_participante")
public class AtividadeParticipante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public AtividadeParticipante() {
    }

    public AtividadeParticipante(Long id, Participante participante, Atividade atividade) {
        this.id = id;
        this.participante = participante;
        this.atividade = atividade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
