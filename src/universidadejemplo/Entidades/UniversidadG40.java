package universidadejemplo.Entidades;

import java.time.LocalDate;
import universidadejemplo.AccesoADatos.*;

public class UniversidadG40 {

    public static void main(String[] args) {
        AlumnoData alu = new AlumnoData();
        Alumno alum= new Alumno(5, "Fiora", "Champ", LocalDate.of(2000, 10, 15), true);
        //alu.guardarAlumno(alum);
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
        Materia Mate = new Materia ("Literatura", 2020, true);
        mater.guardarMateria(Mate);
        
        /*mater.eliminarMateria(2);*/
        AlumnoData ad= new AlumnoData();
        MateriaData md= new MateriaData();
        InscripcionData id= new InscripcionData();
        Alumno al= ad.buscarAlumno(2);
        Materia mat= md.buscarMateria(3);
        Inscripcion ins= new Inscripcion(al, mat, 7);
        id.guardarInscripcion(ins);
        
    }
}

