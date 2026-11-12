package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Categoria;
import br.com.sistemas.chamados.entity.Cliente;
import br.com.sistemas.chamados.entity.Tecnico;
import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ChamadoRequest(
        @NotNull(message = "Cliente é obrigatório")
        Cliente cliente,
        @NotNull(message = "Categoria é obrigatória")
        Categoria categoria,
        Tecnico tecnico,
        @NotBlank(message = "Título é obrigatório")
        String titulo,
        @NotBlank(message = "Descrição é obrigatória")
        String descricao,
        LocalDate data_abertura,
        LocalDate data_fechamento,
        @NotNull(message = "Prioridade é obrigatória")
        ChamadoPrioridade prioridade,
        StatusChamado status
) {}