package com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.Topico;
import com.gilsonqueiroz.aluraforumapi.domain.user.Usuario;

public record DadosCadastroResposta(String mensagem, Long autor, Long topico) {
}
