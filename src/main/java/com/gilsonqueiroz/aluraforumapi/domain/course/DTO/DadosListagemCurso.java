package com.gilsonqueiroz.aluraforumapi.domain.course.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.course.Curso;

public record DadosListagemCurso(String nome, String categoria) {
    public DadosListagemCurso(Curso curso) {
        this(curso.getNome(), curso.getCategoria());
    }
}
