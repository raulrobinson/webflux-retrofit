package com.rasysbox.ws.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("${openapi.service.title}") String serviceTitle,
                                 @Value("${openapi.service.url}") String serviceUrl,
                                 @Value("${openapi.service.description}") String serviceDescription,
                                 @Value("${openapi.service.version}") String serviceVersion) {
        return new OpenAPI()
                .servers(List.of(new Server().url(serviceUrl)))
                .info(new Info()
                        .title(serviceTitle)
                        .version(serviceVersion)
                        .description(serviceDescription)
                );
    }

}

