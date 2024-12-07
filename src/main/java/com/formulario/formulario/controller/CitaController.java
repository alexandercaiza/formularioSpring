package com.formulario.formulario.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.formulario.formulario.model.Cita;

import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class CitaController {

    // Muestra el formulario
    @GetMapping("/citaForm")
    public String mostrarFormulario(Model model) {
        // Crea una nueva instancia de la clase Cita y la agrega al modelo
        model.addAttribute("cita", new Cita());
        return "citaForm"; // El nombre de la plantilla Thymeleaf para el formulario
    }

    // Procesa los datos del formulario con validación
    @PostMapping("/procesarCita")
    public String procesarFormulario(@Valid  Cita cita, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Si hay errores de validación, vuelve al formulario
            return "citaForm";
        }
        // Si no hay errores, pasa al siguiente paso (mostrar resultados)
        model.addAttribute("cita", cita);
        return "citaResultado"; // Nombre de la plantilla para mostrar los resultados
    }
}
