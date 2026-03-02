package com.informaticonfig.demo.controllers;

import java.util.Arrays;
import java.util.List;
// Importaciones
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.informaticonfig.demo.models.Empleados;

import io.micrometer.observation.annotation.ObservationKeyValue;

@Controller
public class EjemploController {
    @GetMapping("detalles_info")
    public String info(Model model)
    {
        System.out.println("ENTRO EL CONTROLLER");
        Empleados empleado1 = new Empleados("Atom", "Nava", "Apple St", "Practicante",
         21, 1111, 1);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados()
    {
        return Arrays.asList(
            new Empleados("María", "Perez", "Calle segunda no.2",
          "Secretaria", 20, 123654987, 02),
            new Empleados("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
            new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
            new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
            new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
            new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05)
        );
    }
}
