package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Chamado;
import br.com.sistemas.chamados.entity.Cliente;
import br.com.sistemas.chamados.entity.Categoria;
import br.com.sistemas.chamados.entity.Tecnico;
import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;

public record ChamadoResponse(Long id, Cliente cliente, Categoria categoria, Tecnico tecnico, String titulo, String descricao, LocalDate data_abertura, LocalDate data_fechamento, ChamadoPrioridade prioridade, StatusChamado status) {
    public static ChamadoResponse de(Chamado c) {
        return new ChamadoResponse(c.getId(), c.getCliente(), c.getCategoria(), c.getTecnico(), c.getTitulo(), c.getDescricao(), c.getData_abertura(), c.getData_fechamento(), c.getPrioridade(), c.getStatus());
    }
    
}