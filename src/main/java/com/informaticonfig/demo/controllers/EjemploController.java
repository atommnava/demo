package com.informaticonfig.demo.controllers;

// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.informaticonfig.demo.models.Empleados;

import io.micrometer.observation.annotation.ObservationKeyValue;

@Controller
public class EjemploController {
    @GetMapping("detalles_info")
    public String info(Model model)
    {
        System.out.println("ENTRO EL CONTROLLER");
        Empleados empleado1 = new Empleados("Atom", "Nava", "Apple Street", "Practicante",
         21, 1111, 1);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }

}
