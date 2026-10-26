package br.com.sistemas.chamados.entity;

import java.time.LocalDate;

import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @JoinColumn (name = "cliente", nullable =  false)
    private Cliente cliente;
    @ManyToOne 
    @JoinColumn (name = "categoria", nullable =  false)
    private Categoria categoria;
    @ManyToOne 
    @JoinColumn (name = "tecnico", nullable =  false)
    private Tecnico tecnico;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private LocalDate data_abertura;
    @Column
    private LocalDate data_fechamento;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private ChamadoPrioridade prioridade;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private StatusChamado status;

    public Chamado(){}

    public Chamado(Cliente cliente, Categoria categoria, Tecnico tecnico, String titulo, String descricao, LocalDate data_abertura, LocalDate data_fechamento, ChamadoPrioridade prioridade, StatusChamado status
    ) {
        this.cliente = cliente;
        this.categoria = categoria;
        this.tecnico = tecnico;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
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

    public ChamadoPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(ChamadoPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }
}
