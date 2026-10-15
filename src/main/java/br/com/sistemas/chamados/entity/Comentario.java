package br.com.sistemas.chamados.entity;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name = "chamado_id", nullable =  false)
    private Long chamado_id;
    @Column
    private String texto;
    @Column
    private LocalDate data;
    @Column 
    private String autor;

    public Comentario(){}

    public Comentario(Long chamado_id, String texto, LocalDate data, String autor) {
        this.chamado_id = chamado_id;
        this.texto = texto;
        this.data = data;
        this.autor = autor;
    }

    public Long getId() {
        return id;
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
}
