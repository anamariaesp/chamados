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
    @JoinColumn (name = "chamado", nullable =  false)
    private Chamado chamado;
    @Column(nullable = false)
    private String texto;
    @Column(nullable = false)
    private LocalDate data;
    @Column (nullable = false)
    private String autor;

    public Comentario(){}

    public Comentario(Chamado chamado, String texto, LocalDate data, String autor) {
        this.chamado = chamado;
        this.texto = texto;
        this.data = data;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public Chamado getChamado() {
        return chamado;
    }

    public void setChamado(Chamado chamado) {
        this.chamado = chamado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
