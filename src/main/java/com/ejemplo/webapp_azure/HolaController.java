package com.ejemplo.webapp_azure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @GetMapping("/")
  public String home() {
    String dbStatus;
    String color;

    try {
      Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
      if (result != null && result == 1) {
        dbStatus = "Conectado (PostgreSQL)";
        color = "green";
      } else {
        dbStatus = "Error inesperado";
        color = "orange";
      }
    } catch (Exception e) {
      dbStatus = "Desconectado - " + e.getMessage();
      color = "red";
    }

    return "<h1>¡Bienvenido a Gestión de Turnos!</h1>" +
            "<p>Status App: <b>Activo y corriendo (v3)</b></p>" +
            "<p>Status Base de Datos: <b style='color:" + color + ";'>" + dbStatus + "</b></p>";
  }

  @GetMapping("/health")
  public String health() {
    return "{\"status\": \"UP\"}";
  }
}