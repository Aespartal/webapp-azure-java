package com.ejemplo.webapp_azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @GetMapping("/")
  public String home() {
    return "<h1>¡Bienvenido al Backend en Azure!</h1>" +
            "<p>Esta es la página de inicio de mi aplicación Spring Boot.</p>" +
            "<p>Estado: <b>Operativo</b></p>";
  }
}