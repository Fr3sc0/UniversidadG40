package universidadejemplo.Entidades;

import java.time.LocalDate;

public class Materia {

    private int idMateria;
    private String Nombre;
    private int anio;
    private boolean estado;

    public Materia() {
    }

    public Materia(String Nombre, int anio, boolean estado) {
        this.Nombre = Nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(int idMateria, String Nombre, int anio, boolean estado) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return Nombre + ", " + anio;
    }

}
