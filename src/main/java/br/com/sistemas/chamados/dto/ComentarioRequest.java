package br.com.sistemas.chamados.dto;

import java.time.LocalDate;

import br.com.sistemas.chamados.entity.Chamado;

public record ComentarioRequest(
    Chamado chamado,
    String texto,
    LocalDate data,
    String autor
) {}
