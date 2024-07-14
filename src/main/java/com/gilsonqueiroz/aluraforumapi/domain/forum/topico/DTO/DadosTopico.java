package com.gilsonqueiroz.aluraforumapi.domain.forum.topico.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.StatusTopico;
import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.Topico;

public record DadosTopico(String titulo, String mensagem, StatusTopico status) {
    public DadosTopico(Topico topico) {
        this(
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getStatus()
        );
    }
}
