
package universidadejemplo.Entidades;

public class Materia {
    private int idMateria; 
    private int anio;
    private String Nombre;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, int anio, String Nombre, boolean estado) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.Nombre = Nombre;
        this.estado = estado;
    }

    public Materia(int anio, String Nombre, boolean estado) {
        this.anio = anio;
        this.Nombre = Nombre;
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
        return "Materia{" + "idMateria=" + idMateria + ", anio=" + anio + ", Nombre=" + Nombre + '}';
    }
    
}
