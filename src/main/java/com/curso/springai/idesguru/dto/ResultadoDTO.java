package com.curso.springai.idesguru.dto;

import java.util.List;

import com.curso.springai.idesguru.model.Herramienta;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * DTO con el resultado de la consulta: lista de IDEs y herramientas para un lenguaje/tecnología.
 * Se usa como tipo de salida estructurada del ChatClient (.entity(ResultadoDTO.class)).
 */
public record ResultadoDTO(
		@JsonPropertyDescription("Lista de IDEs y herramientas para el lenguaje/tecnología")
		List<Herramienta> herramientas) {
}
