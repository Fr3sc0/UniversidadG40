package universidadejemplo.Entidades;

import java.time.LocalDate;
import universidadejemplo.AccesoADatos.AlumnoData;


public class UniversidadG40 {

    public static void main(String[] args) {
        Alumno Luna= new Alumno(40050123, "Luna", "Sol", LocalDate.of(1996, 5, 10), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(Luna);
         
    }

}
