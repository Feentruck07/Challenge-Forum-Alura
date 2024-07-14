package com.gilsonqueiroz.aluraforumapi.domain.forum.resposta.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.forum.topico.Topico;
import com.gilsonqueiroz.aluraforumapi.domain.user.Usuario;

public record DadosCompletoCadastroResposta(String mensagem, Usuario autor, Topico topico) {
}
