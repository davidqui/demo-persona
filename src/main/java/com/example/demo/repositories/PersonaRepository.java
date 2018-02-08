package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 02/08/2018
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {

}
