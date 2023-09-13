package universidadejemplo.Entidades;

import java.time.LocalDate;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.MateriaData;


public class UniversidadG40 {

    public static void main(String[] args) {
        /*AlumnoData alu = new AlumnoData();
        //Alumno Luna= new Alumno(1,40050123, "Luna", "Soledad", LocalDate.of(1996, 5, 10), true);
        //alu.guardarAlumno(Luna);
        //alu.modificarAlumno(Luna);
        //alu.eliminarAlumno(1);
        /*
        Alumno aluEnc = alu.buscarAlumno(1);
        if(aluEnc!=null){
          System.out.println("dni: "+aluEnc.getDni());
          System.out.println("Apellido: "+aluEnc.getApellido());
            System.out.println("Nombre: "+aluEnc.getNombre());
        }
        */
        /*for(Alumno alumno:alu.listarAlumnos()){
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNacimiento());*/
            
        MateriaData mater= new MateriaData();
        Materia Algebra = new Materia ("Algebra", 2022, true);
        //mater.guardarMateria(Algebra);
        mater.modificarMateria(Algebra);
        /*mater.eliminarMateria(2);*/
  
    }
}

