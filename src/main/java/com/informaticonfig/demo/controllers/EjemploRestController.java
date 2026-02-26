package com.informaticonfig.demo.controllers;

import java.util.HashMap;
// Importaciones
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// API Rest
@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @RequestMapping(path = "/detalles_info2", method=RequestMethod.GET)
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
