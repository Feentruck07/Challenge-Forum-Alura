package com.gilsonqueiroz.aluraforumapi.domain.forum.topico.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.course.DTO.DadosListagemCurso;
import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.StatusTopico;
import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.Topico;
import com.gilsonqueiroz.aluraforumapi.domain.user.DTO.DadosListagemUsuario;

import java.time.LocalDateTime;

public record DadosListagemTopico(String titulo, String mensagem, LocalDateTime dataCriacao,
                                  StatusTopico status, DadosListagemUsuario autor, DadosListagemCurso curso) {
    public DadosListagemTopico(Topico topico) {
        this(
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getDataCriacao(),
                topico.getStatus(),
                new DadosListagemUsuario(topico.getAutor()),
                new DadosListagemCurso(topico.getCurso())
        );
    }
}
