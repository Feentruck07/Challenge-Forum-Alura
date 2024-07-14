package com.gilsonqueiroz.aluraforumapi.domain.course.DTO;

import com.gilsonqueiroz.aluraforumapi.domain.course.Curso;

public record DadosCursoCompleto(Long id, String nome, String categoria) {
    public DadosCursoCompleto(Curso curso) {
        this(curso.getId(), curso.getNome(), curso.getCategoria());
    }
}