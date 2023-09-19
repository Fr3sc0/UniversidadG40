package universidadejemplo.Entidades;

import java.time.LocalDate;
import universidadejemplo.AccesoADatos.*;

public class UniversidadG40 {

    public static void main(String[] args) {
        AlumnoData alu = new AlumnoData();
        Alumno alum= new Alumno(444,"Francisco", "Iorfino", LocalDate.of(1997, 5, 20), true);
        //alu.guardarAlumno(alum);
        //alu.modificarAlumno();
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
            
//        MateriaData mater= new MateriaData();
//        Materia Mate = new Materia ("Geografia", 2019, true);
//        mater.guardarMateria(Mate);
        
        /*mater.eliminarMateria(2);*/
        AlumnoData ad= new AlumnoData();
        MateriaData md= new MateriaData();
        InscripcionData id= new InscripcionData();
        Alumno al= ad.buscarAlumno(4);
        Materia mat= md.buscarMateria(2);
        Inscripcion ins= new Inscripcion(al, mat, 7);
        //id.guardarInscripcion(ins);
        for(Inscripcion insc: id.obtenerInscripciones()){
            System.out.println("id"+insc.getIdInscripcion());
            System.out.println("Apellido: "+insc.getAlumno().getApellido());
            System.out.println("Materia: "+insc.getMateria().getNombre());
        }
       for(Materia materia: id.obtenerMateriasNoCursadas(3)){
           System.out.println("Nombre: "+ materia.getNombre());
       }
    }
}

