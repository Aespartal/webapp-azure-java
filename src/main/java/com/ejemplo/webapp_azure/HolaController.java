package com.ejemplo.webapp_azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @GetMapping("/")
  public String home() {
    return "<h1>¡Bienvenido a Demo App!</h1>" +
            "<p>Aplicación Spring Boot desplegada en Oracle Cloud. v2</p>" +
            "<p>Status: <b>Activo y corriendo</b></p>";
  }

  @GetMapping("/health")
  public String health() {
    return "{\"status\": \"UP\"}";
  }
}