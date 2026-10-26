package br.com.sistemas.chamados.service;

import java.util.List;

import br.com.sistemas.chamados.enums.ChamadoPrioridade;
import br.com.sistemas.chamados.enums.StatusChamado;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.sistemas.chamados.dto.ChamadoRequest;
import br.com.sistemas.chamados.dto.ChamadoResponse;
import br.com.sistemas.chamados.entity.Chamado;
import br.com.sistemas.chamados.exception.RecursoNaoEncontradoException;
import br.com.sistemas.chamados.repository.ChamadoRepository;

@Service
public class ChamadoService {
    
    private final ChamadoRepository repository;

    public ChamadoService(ChamadoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public ChamadoResponse criar(ChamadoRequest dto) {
        Chamado salvo = repository.save(new Chamado(dto.cliente(), dto.categoria(), dto.tecnico(), dto.titulo(), dto.descricao(), dto.data_abertura(), dto.data_fechamento(), dto.prioridade(), dto.status()));
        return ChamadoResponse.de(salvo);
    }

    @Transactional(readOnly = true)
    public List<ChamadoResponse> listar() {
        return repository.findAll().stream().map(ChamadoResponse::de).toList();
    }

    @Transactional(readOnly = true)
    public ChamadoResponse buscar(Long id) {
        return ChamadoResponse.de(buscarEntity(id));
    }

    @Transactional
    public ChamadoResponse atualizar(Long id, ChamadoRequest dto){
        Chamado chamado = buscarEntity(id);
        chamado.setCliente(dto.cliente());
        chamado.setCategoria(dto.categoria());
        chamado.setTecnico(dto.tecnico());
        chamado.setTitulo(dto.titulo());
        chamado.setDescricao(dto.descricao());
        chamado.setData_abertura(dto.data_abertura());
        chamado.setData_fechamento(dto.data_fechamento());
        chamado.setPrioridade(dto.prioridade());
        chamado.setStatus(dto.status());
        return ChamadoResponse.de(chamado);
    }

    @Transactional
    public void excluir(Long id) {
        repository.delete(buscarEntity(id));
    }

    private Chamado buscarEntity(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecursoNaoEncontradoException(
                "Chamado " + id + " não encontrada"));
    }
}
