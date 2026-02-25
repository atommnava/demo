package com.informaticonfig.demo.controllers;

// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import io.micrometer.observation.annotation.ObservationKeyValue;

@Controller
public class EjemploController {
    @GetMapping("detalles_info")
    public String info(Map<String, Object> model)
    {
        System.out.println("ENTRO EL CONTROLLER");
        model.put("titulo", "Servidor en línea");
        model.put("servidor", "Informaticonfig");
        model.put("ip", "127.0.0.1");
        return "detalles_info";
    }

}
