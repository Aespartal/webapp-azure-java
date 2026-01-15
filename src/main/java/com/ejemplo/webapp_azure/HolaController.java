package com.ejemplo.webapp_azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @GetMapping("/")
  public String saludo() {
    return "<h1>¡Hola Azure!</h1><p>Esta es una app Spring Boot desplegada con éxito.</p>";
  }
}