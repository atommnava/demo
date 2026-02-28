package com.informaticonfig.demo.controllers;

import java.util.HashMap;
// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.demo.models.Empleados;
import com.informaticonfig.demo.models.dto.ClaseDTO;

// API Rest
@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
    @GetMapping(path = "detalles_info2")
    public ClaseDTO detalles_info(Model model)
    {
        ClaseDTO dto = new ClaseDTO();
        dto.setTitulo("Administrador");
        dto.setUsuario("Atom");
        return dto;
    }

}
