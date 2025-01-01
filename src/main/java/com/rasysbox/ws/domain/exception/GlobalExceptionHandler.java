package com.rasysbox.ws.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

//@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public String handleAllExceptions(Exception ex, WebRequest request) {
//        // Verifica si la petición es para el endpoint de Swagger
//        if (request.getDescription(false).contains("/v3/api-docs")) {
//            return null;  // No interceptes la solicitud de Swagger
//        }
//
//        // Maneja otras excepciones
//        return "Error interno del servidor: " + ex.getMessage();
//    }

//    // Manejo de ResponseStatusException
//    @ExceptionHandler(ResponseStatusException.class)
//    public ResponseEntity<Map<String, Object>> handleResponseStatusException(ResponseStatusException ex) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("status", ex.getStatusCode().value());
//        response.put("error", ex.getReason());
//        response.put("message", ex.getMessage());
//        return new ResponseEntity<>(response, ex.getStatusCode());
//    }
//
//    // Manejo de NullPointerException
//    @ExceptionHandler(NullPointerException.class)
//    public ResponseEntity<Map<String, Object>> handleNullPointerException(NullPointerException ex) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//        response.put("error", "Internal Server Error");
//        response.put("message", "A null value was encountered.");
//        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    // Manejo genérico de excepciones
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
//        response.put("error", "Internal Server Error");
//        response.put("message", ex.getMessage());
//        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}

