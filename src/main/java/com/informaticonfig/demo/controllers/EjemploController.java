package com.informaticonfig.demo.controllers;

// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.informaticonfig.demo.models.Empleados;
import com.informaticonfig.demo.models.dto.ClaseDTO;

import io.micrometer.observation.annotation.ObservationKeyValue;

@Controller
public class EjemploController {
    @GetMapping("detalles_info")
    public ClaseDTO detalles_info(Model model)
    {
        ClassDTO dto = new ClaseDTO();
        dto.setTitulo("Administrador");
        dto.setUsuario("Atom");
        return dto;
    }

}
