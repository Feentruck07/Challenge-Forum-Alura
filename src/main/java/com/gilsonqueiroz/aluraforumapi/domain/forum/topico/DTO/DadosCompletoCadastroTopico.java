package com.gilsonqueiroz.aluraforumapi.domain.forum.topico.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.course.Curso;
import com.gilsonqueiroz.aluraforumapi.domain.user.Usuario;

public record DadosCompletoCadastroTopico(String titulo, String mensagem, Usuario autor, Curso curso) {
}
