package com.example.salesianostriana.dam.ToDoList.respository;

import com.example.salesianostriana.dam.ToDoList.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea, Long> {
}
