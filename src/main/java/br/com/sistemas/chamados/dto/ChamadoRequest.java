package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

public record ChamadoRequest(
    Long cliente_id,
    Long categoria_id,
    Long tecnico_id,
    String titulo,
    String descricao,
    LocalDate data_abertura,
    LocalDate data_fechamento,
    String prioridade,
    String status
) {}
