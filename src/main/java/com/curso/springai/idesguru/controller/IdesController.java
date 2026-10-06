package com.curso.springai.idesguru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springai.idesguru.dto.ResultadoDTO;
import com.curso.springai.idesguru.service.IdesService;

@RestController
@RequestMapping("/api/ides")
public class IdesController {

	private final IdesService idesService;

	public IdesController(IdesService idesService) {
		this.idesService = idesService;
	}

	@GetMapping
	public ResultadoDTO obtenerHerramientas(@RequestParam String lenguaje) {
		return idesService.obtenerHerramientas(lenguaje);
	}
}
