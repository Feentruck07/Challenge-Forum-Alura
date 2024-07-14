package com.gilsonqueiroz.aluraforumapi.domain.course.DTO;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCurso(
        @NotBlank(message = "{nome.obrigatorio}")
        String nome,
        @NotBlank(message = "{categoria.obrigatoria}")
        String categoria) {
}
