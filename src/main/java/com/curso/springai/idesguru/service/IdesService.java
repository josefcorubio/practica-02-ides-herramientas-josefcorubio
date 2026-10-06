package com.curso.springai.idesguru.service;

import java.util.Map;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.curso.springai.idesguru.dto.ResultadoDTO;

@Service
public class IdesService {

	private final ChatClient chatClient;
	@Value("${text.system}")
	private String system;
	@Value("${text.usuario}")
	private String user;

	public IdesService(ChatClient chatClient) {
		this.chatClient = chatClient;
	}

	public ResultadoDTO obtenerHerramientas(String lenguaje) {
		var systemTemplate = new PromptTemplate(system);
		System.out.println("System: " + systemTemplate.getTemplate());
		var userTemplate = new PromptTemplate(user);
		System.out.println("User: " + userTemplate.getTemplate());

        var prompt = new Prompt(systemTemplate.createMessage(Map.of("lenguaje", lenguaje)),
				userTemplate.createMessage());

        return chatClient
				.prompt(prompt)
				.call()
				.entity(ResultadoDTO.class);
	}
}
