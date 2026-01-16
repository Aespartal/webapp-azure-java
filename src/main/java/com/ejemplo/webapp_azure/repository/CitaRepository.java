package com.ejemplo.webapp_azure.repository;

import com.ejemplo.webapp_azure.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}