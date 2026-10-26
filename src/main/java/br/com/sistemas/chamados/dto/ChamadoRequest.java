package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Cliente;
import br.com.sistemas.chamados.entity.Categoria;
import br.com.sistemas.chamados.entity.Tecnico;
import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;
import jakarta.validation.constraints.NotBlank;

public record ChamadoRequest(
    @NotBlank(message = "Cliente é obrigatório")
    Cliente cliente,
    @NotBlank(message = "Categoria é obrigatória")
    Categoria categoria,
    @NotBlank(message = "Técnico é obrigatório")
    Tecnico tecnico,
    @NotBlank(message = "Titulo é obrigatório")
    String titulo,
    @NotBlank(message = "Descrição é obrigatória")
    String descricao,
    LocalDate data_abertura,
    LocalDate data_fechamento,
    @NotBlank(message = "Prioridade é obrigatória")
    ChamadoPrioridade prioridade,
    @NotBlank(message = "Status é obrigatório")
    StatusChamado status
) {}
