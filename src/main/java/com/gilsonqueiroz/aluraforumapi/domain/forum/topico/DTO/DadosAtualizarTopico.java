package com.gilsonqueiroz.aluraforumapi.domain.forum.topico.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.StatusTopico;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarTopico(
        @NotNull(message = "{id.obrigatorio}")
        Long id,
        String titulo,
        String mensagem,
        StatusTopico status) {
}
