package com.ejemplo.webapp_azure.controller;

import com.ejemplo.webapp_azure.model.Cita;
import com.ejemplo.webapp_azure.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
@CrossOrigin(origins = "*")
public class CitaController {

  @Autowired
  private CitaRepository citaRepository;

  @GetMapping
  public List<Cita> obtenerTodas() {
    return citaRepository.findAll();
  }

  @PostMapping
  public Cita crearCita(@RequestBody Cita cita) {
    return citaRepository.save(cita);
  }
}