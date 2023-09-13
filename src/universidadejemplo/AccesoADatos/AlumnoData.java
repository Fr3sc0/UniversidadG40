
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

public class AlumnoData {
    
    private Connection con=null;
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }
    public void guardarAlumno(Alumno alumno){
        String sql= "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUE(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(1);
                JOptionPane.showMessageDialog(null, "Alumno guardado exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
          
    }
    public void modificarAlumno(Alumno alu){
        
        String sql="UPDATE alumno SET dni= ?, apellido = ?, nombre = ?, fechaNacimiento = ?"
                + "WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, alu.getDni());
            ps.setString(2, alu.getApellido());
            ps.setString(3, alu.getNombre());
            ps.setDate(4, Date.valueOf(alu.getFechaNacimiento()));
            ps.setInt(5, alu.getIdAlumno());
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Exito al modificar al alumno.");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
    }
    
    public void eliminarAlumno(int id){
        String sql="UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if(exito==1){
               JOptionPane.showMessageDialog(null, "Exito al eliminar al alumno.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
    }
    
    public Alumno buscarAlumno(int id){
        String sql="SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alu=null;
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                alu=new Alumno();
                alu.setIdAlumno(id);
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
         return alu;
        
    }
    
    public List<Alumno> listarAlumnos(){
        String sql="SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos=new ArrayList<>();
        
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Alumno alu=new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(true);
                alumnos.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno.");
        }
        return alumnos;
        
    }
}
