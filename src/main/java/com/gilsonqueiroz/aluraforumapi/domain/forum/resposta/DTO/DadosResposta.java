package com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.Resposta;
import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.DTO.DadosTopico;
import com.gilsonqueiroz.aluraforumapi.domain.user.DTO.DadosListagemUsuario;

import java.time.LocalDateTime;

public record DadosResposta(String mensagem, LocalDateTime dataCriacao, Boolean solucao,
                            DadosListagemUsuario autor, DadosTopico topico) {
    public DadosResposta(Resposta resposta) {
        this(
                resposta.getMensagem(),
                resposta.getDataCriacao(),
                resposta.getSolucao(),
                new DadosListagemUsuario(resposta.getAutor()),
                new DadosTopico(resposta.getTopico())
        );
    }
}
