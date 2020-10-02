package com.example.salesianostriana.dam.ToDoList.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tarea {

    @Id
    @GeneratedValue
    private Long id;

    private String descripcion;
    private LocalDate fechaCreacion;
    private LocalDate fechaActual;
    private LocalDate fechaCaducidad;

}
