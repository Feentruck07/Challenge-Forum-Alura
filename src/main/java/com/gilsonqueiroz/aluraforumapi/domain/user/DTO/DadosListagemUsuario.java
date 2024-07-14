package com.gilsonqueiroz.aluraforumapi.domain.user.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.user.Usuario;

public record DadosListagemUsuario(String nome, String email) {
    public DadosListagemUsuario(Usuario usuario) {
        this(
                usuario.getNome(),
                usuario.getEmail()
        );
    }
}
