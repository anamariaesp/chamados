package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Cliente;
import br.com.sistemas.chamados.entity.Categoria;
import br.com.sistemas.chamados.entity.Tecnico;

public record ChamadoRequest(
    Cliente cliente_id,
    Categoria categoria_id,
    Tecnico tecnico_id,
    String titulo,
    String descricao,
    LocalDate data_abertura,
    LocalDate data_fechamento,
    String prioridade,
    String status
) {}
