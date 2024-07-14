package com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.Resposta;

import java.time.LocalDateTime;

public record DadosListagemResposta(LocalDateTime dataCriacao, String mensagem, Boolean solucao) {
    public DadosListagemResposta(Resposta resposta) {
        this(
                resposta.getDataCriacao(),
                resposta.getMensagem(),
                resposta.getSolucao()
        );
    }
}
