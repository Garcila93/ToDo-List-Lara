package com.example.salesianostriana.dam.ToDoList.service;

import com.example.salesianostriana.dam.ToDoList.model.Tarea;
import com.example.salesianostriana.dam.ToDoList.respository.TareaRepositorio;
import com.example.salesianostriana.dam.ToDoList.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaServicio extends BaseServiceImpl <Tarea, Long , TareaRepositorio> {
    public List<Integer> todasLasTareasOrdenadasPorFecha() {
        return this.findAll().stream()
                .map(t -> {
                    return t.getFechaActual().compareTo(t.getFechaCaducidad());
                }).collect(Collectors.toList());
    }
}
