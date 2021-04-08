package cjava.beans;

import java.lang.String;
import java.util.Objects;

/**
 *
 * @author emaravi
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean genero;
    
    int i=0;
    public Persona(){
        this.nombre= null;
        this.genero= false;
        this.id = i++;
    }

    public Persona(String nombre, boolean genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public int getId() {
        
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return getId() == persona.getId() &&
                isGenero() == persona.isGenero() &&
                Objects.equals(getNombre(), persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), isGenero());
    }
}
