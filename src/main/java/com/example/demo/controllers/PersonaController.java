package com.example.demo.controllers;

import com.example.demo.entities.Persona;
import com.example.demo.services.PersonaService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 02/08/2018
 */
@Controller
@RequestMapping("/personas")
public class PersonaController {

    private static final String MSG_ERROR = "msg_error";
    private static final String MSG_OK = "msg_ok";

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String mostrarFormulario(Model model) {
        final List<Persona> personas = personaService.listarTodos();
        model.addAttribute("personas", personas);

        return "personas";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String registrarPersona(@RequestParam("docid") String docid, @RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("edad") Integer edad, Model model) {
        final String template = "personas";

        List<Persona> personas = personaService.listarTodos();
        model.addAttribute("personas", personas);

        if (docid == null || docid.trim().isEmpty()) {
            model.addAttribute(MSG_ERROR, "Debe ingresar el número del documento.");
            return template;
        }

        final Persona persona = personaService.buscar(docid);
        if (persona != null) {
            model.addAttribute(MSG_ERROR, "Ya existe una persona con el número de identidad indicado.");
            return template;
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            model.addAttribute(MSG_ERROR, "Debe ingresar el nombre.");
            return template;
        }

        if (apellido == null || apellido.trim().isEmpty()) {
            model.addAttribute(MSG_ERROR, "Debe ingresar el apellido.");
            return template;
        }

        if (edad <= 0) {
            model.addAttribute(MSG_ERROR, "Debe ingresar la edad.");
            return template;
        }

        final Persona nuevaPersona = personaService.guardar(new Persona(docid, nombre, apellido, BigInteger.valueOf(edad)));
        model.addAttribute(MSG_OK, "Se ha creado exitosamente a " + nuevaPersona.getNombre() + " " + nuevaPersona.getApellido() + " (" + nuevaPersona.getDocid() + ").");

        personas = personaService.listarTodos();
        model.addAttribute("personas", personas);

        return template;
    }
}
