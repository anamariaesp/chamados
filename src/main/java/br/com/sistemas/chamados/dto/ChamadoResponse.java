package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Chamado;

public record ChamadoResponse(Long id, Long cliente_id, Long categoria_id, Long tecnico_id, String titulo, String descricao, LocalDate data_abertura, LocalDate data_fechamento, String prioridade, String status) {
    public static ChamadoResponse de(Chamado c) {
        return new ChamadoResponse(c.getId(), c.getCliente_id(), c.getCategoria_id(), c.getTecnico_id(), c.getTitulo(), c.getDescricao(), c.getData_abertura(), c.getData_fechamento(), c.getPrioridade(), c.getStatus());
    }
    
}

    