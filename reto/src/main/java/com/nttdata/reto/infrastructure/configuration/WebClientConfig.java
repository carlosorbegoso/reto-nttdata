package com.nttdata.reto.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Configuration class for WebClient
 */
@Configuration
public class WebClientConfig {
    /**
     * Method to create a WebClient instance
     * @return WebClient
     */

    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
