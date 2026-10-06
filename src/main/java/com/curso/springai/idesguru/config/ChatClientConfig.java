package com.curso.springai.idesguru.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ChatClient construido sobre el ChatModel de Ollama
 */
@Configuration
public class ChatClientConfig {

	@Bean
	public ChatClient chatClient(ChatClient.Builder builder) {
		return builder.build();
	}
}
