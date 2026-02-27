package com.informaticonfig.demo.controllers;

import java.util.HashMap;
// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.demo.models.Empleados;

// API Rest
@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
    @GetMapping(path = "detalles_info2")
    public Map<String, Object> detalles_info2()
    {
        Empleados empleado1 = new Empleados("Atom", "Nava", "Apple Street", "Practicante", 21, 1111, 1);
        System.out.println("ENTRO EL CONTROLLER");
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);
        
        return respuesta;
    }

}
