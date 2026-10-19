package br.com.sistemas.chamados.dto;

import br.com.sistemas.chamados.entity.Chamado;
import br.com.sistemas.chamados.entity.Comentario;
import java.time.LocalDate;

public record ComentarioResponse(Long id, Chamado chamado_id, String texto, String autor, LocalDate data) {
    public static ComentarioResponse de(Comentario c) {
        return new ComentarioResponse(c.getId(), c.getChamadoId(), c.getTexto(), c.getAutor(), c.getData());
    }
}