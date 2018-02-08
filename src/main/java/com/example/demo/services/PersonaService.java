package com.example.demo.services;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 02/08/2018
 */
@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona buscar(final String docid) {
        return personaRepository.findOne(docid);
    }

    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> listarTodos() {
        return personaRepository.findAll(new Sort(Sort.Direction.ASC, "docid"));
    }

}
