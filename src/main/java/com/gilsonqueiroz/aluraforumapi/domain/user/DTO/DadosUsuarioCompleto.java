package com.gilsonqueiroz.aluraforumapi.domain.user.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.user.Usuario;

public record DadosUsuarioCompleto(Long id, String nome, String email) {
    public DadosUsuarioCompleto(Usuario usuario) {
        this(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }
}
