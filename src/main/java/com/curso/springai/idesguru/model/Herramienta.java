package com.curso.springai.idesguru.model;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * Record para IDE o herramienta recomendada para un lenguaje/tecnología
 */
public record Herramienta(
		@JsonPropertyDescription("Nombre del IDE o herramienta")
		String nombre,
		@JsonPropertyDescription("Dirección oficial de descarga")
		String urlDescarga,
		@JsonPropertyDescription("Breve descripción de para qué sirve")
		String descripcion,
		@JsonPropertyDescription("Tipo de licencia: Gratuita, Open source, De pago o Freemium")
		String licencia) {
}
