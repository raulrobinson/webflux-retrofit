package com.rasysbox.ws.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchange -> exchange
                        .pathMatchers("/webflux-retrofit/webjars/swagger-ui/**").permitAll()
                        .pathMatchers("/webflux-retrofit/v3/api-docs/**").permitAll()
                        .pathMatchers("/actuator/**").permitAll()

                        .pathMatchers(HttpMethod.GET, "/webflux-retrofit/v1/aircraft/types").permitAll()
                        .pathMatchers(HttpMethod.GET, "/webflux-retrofit/v1/aircraft/airports").permitAll()
                        .anyExchange().authenticated()
                )
                .cors(ServerHttpSecurity.CorsSpec::disable);

        return http.build();
    }

//    @Bean
//    public CorsWebFilter corsWebFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.addAllowedOrigin("*"); // Permitir todas las solicitudes de origen
//        corsConfiguration.addAllowedMethod("*"); // Permitir todos los métodos (GET, POST, etc.)
//        corsConfiguration.addAllowedHeader("*"); // Permitir todos los encabezados
//        corsConfiguration.setAllowCredentials(false); // Opcional, según tus necesidades
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration); // Aplica configuración a todas las rutas
//
//        return new CorsWebFilter(source);
//    }

}

