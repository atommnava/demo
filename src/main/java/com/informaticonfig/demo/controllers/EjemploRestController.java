package com.informaticonfig.demo.controllers;

import java.util.HashMap;
// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// API Rest
@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
    @GetMapping(path = "detalles_info2")
    public Map<String, Object> detalles_info2()
    {
        System.out.println("ENTRO EL CONTROLLER");
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en línea");
        respuesta.put("servidor", "Informaticonfig");
        respuesta.put("ip", "127.0.0.1");
        return respuesta;
    }

}
