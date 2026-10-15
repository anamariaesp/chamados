package br.com.sistemas.chamados.dto;


public record TecnicoRequest(
    String nome,
    String email,
    String perfil
) {}
