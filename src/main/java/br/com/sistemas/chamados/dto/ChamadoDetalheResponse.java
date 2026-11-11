package br.com.sistemas.chamados.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.sistemas.chamados.entity.Chamado;
import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;

public record ChamadoDetalheResponse(
        Long id, String titulo, String descricao,
        LocalDate dataAbertura, LocalDate dataFechamento,
        ChamadoPrioridade prioridade, StatusChamado status,
        Long clienteId, Long categoriaId, Long tecnicoId,
        List<ComentarioResponse> comentarios) {

    public static ChamadoDetalheResponse de(Chamado c, List<ComentarioResponse> comentarios) {
        return new ChamadoDetalheResponse(
                c.getId(), c.getTitulo(), c.getDescricao(),
                c.getData_abertura(), c.getData_fechamento(),
                c.getPrioridade(), c.getStatus(),
                c.getCliente().getId(), c.getCategoria().getId(),
                c.getTecnico() == null ? null : c.getTecnico().getId(),
                comentarios);
    }
}