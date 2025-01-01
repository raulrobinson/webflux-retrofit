package com.rasysbox.ws.infrastructure.rest;

import com.rasysbox.ws.application.dto.AircraftService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("${api.base-path}")
@Tag(name = "Aircraft API", description = "Operaciones relacionadas con aeronaves")
public class AircraftController {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(AircraftController.class);
    private final AircraftService service;

    @Autowired
    public AircraftController(AircraftService service) {
        this.service = service;
    }

    @GetMapping("/types")
    @Operation(summary = "Obtener tipos de aeronaves", description = "Obtiene una lista de tipos de aeronaves desde un servicio externo.")
    public Mono<ResponseEntity<Map<String, Object>>> getAircraftTypes() {
        return Mono.fromCallable(() -> {
            try {
                Map<String, Object> data = service.fetchAircraftTypes();
                log.info("Aircraft types fetched successfully");
                return ResponseEntity.ok(data);
            } catch (IOException e) {
                log.error("Error fetching aircraft types", e);
                return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
            }
        });
    }

    @GetMapping("/airports")
    @Operation(summary = "Obtener aeropuertos", description = "Obtiene una lista de aeropuertos desde un servicio externo.")
    public Mono<ResponseEntity<Map<String, Object>>> getAirports() {
        return Mono.fromCallable(() -> {
            try {
                Map<String, Object> data = service.fetchAirports();
                log.info("Airports fetched successfully");
                return ResponseEntity.ok(data);
            } catch (IOException e) {
                log.error("Error fetching airports", e);
                return ResponseEntity.status(500).body(Map.of("error", e.getMessage()));
            }
        });
    }

}

