package com.example.salesianostriana.dam.ToDoList.controller;

import com.example.salesianostriana.dam.ToDoList.model.Tarea;
import com.example.salesianostriana.dam.ToDoList.service.TareaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarea")
@RequiredArgsConstructor
public class ControllerTarea {

    private final TareaServicio tareaServicio;

    @GetMapping ("/")
    public String list(Model model){
        model.addAttribute("listaTareas", tareaServicio.todasLasTareasOrdenadasPorFecha() );

        return "index.hmtl";
    }
    @GetMapping("/new")
    public String showFormNewTarea(Model model) {
        model.addAttribute("tarea", new Tarea());
        return "newTarea.html";
    }

    @PostMapping("/submit")
    public String submitNewTarea(
            @ModelAttribute("tarea") Tarea tarea) {
        tareaServicio.save(tarea);
        return "redirect:/";
    }



}
