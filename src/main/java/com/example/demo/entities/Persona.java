package com.example.demo.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jorge Alfonso García Espinosa
 * @since 1.8
 * @version 02/08/2018
 */
@Entity
@Table(name = "PRUEBA_PERSONA")
@SuppressWarnings("PersistenceUnitPresent")
public class Persona implements Serializable {

    private static final long serialVersionUID = -8805249061150464625L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "DOCID")
    private String docid;
    @Size(max = 254)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 254)
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "EDAD")
    private BigInteger edad;

    public Persona() {
    }

    public Persona(String docid) {
        this.docid = docid;
    }

    public Persona(String docid, String nombre, String apellido, BigInteger edad) {
        this.docid = docid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.docid);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
        hash = 67 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.docid, other.docid)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.edad, other.edad);
    }

    @Override
    public String toString() {
        return "com.example.demo.entities.Persona[ docid=" + docid + " ]";
    }

}
