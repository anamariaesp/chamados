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
@Table(name = "chamado")
public class Chamado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn (name = "cliente_id", nullable =  false)
    private Long cliente_id;
    @ManyToOne 
    @JoinColumn (name = "categoria_id", nullable =  false)
    private Long categoria_id;
    @ManyToOne 
    @JoinColumn (name = "tecnico_id", nullable =  false)
    private Long tecnico_id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private LocalDate data_abertura;
    @Column
    private LocalDate data_fechamento;
    @Column
    private String prioridade;
    @Column
    private String status;

    public Chamado(){}

    public Chamado(Long cliente_id, Long categoria_id, Long tecnico_id, String titulo, String descricao, LocalDate data_abertura, LocalDate data_fechamento, String prioridade, String status
    ) {
        this.cliente_id = cliente_id;
        this.categoria_id = categoria_id;
        this.tecnico_id = tecnico_id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_abertura = data_abertura;        
        this.data_fechamento = data_fechamento;
        this.prioridade = prioridade;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Long getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Long categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Long getTecnico_id() {
        return tecnico_id;
    }

    public void setTecnico_id(Long tecnico_id) {
        this.tecnico_id = tecnico_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(LocalDate data_abertura) {
        this.data_abertura = data_abertura;
    }

    public LocalDate getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(LocalDate data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
