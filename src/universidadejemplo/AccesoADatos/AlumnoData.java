
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
}
