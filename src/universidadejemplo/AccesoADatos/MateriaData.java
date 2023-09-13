
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;

public class MateriaData {
    private Connection con=null;
     
    public MateriaData(){
        con = Conexion.getConexion();
    }
    public void guardarMateria(Materia materia){
        String sql= "INSERT INTO materia(nombre, anio, estado)"
                + "VALUE(?, ?, ?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(1);
                JOptionPane.showMessageDialog(null, "Materia guardada exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
    public void modificarMateria(Materia mat){
        
        String sql="UPDATE materia SET nombre= ?, anio = ?"
                + "WHERE idMateria = ?";

        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnio());
            ps.setInt(3, mat.getIdMateria());
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Exito al modificar la materia.");
            } else{
                JOptionPane.showMessageDialog(null, "La materia no a sido encontrada");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
    public void eliminarMateria(int id){
        String sql="UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            int exito = ps.executeUpdate();
            if(exito==1){
               JOptionPane.showMessageDialog(null, "Exito al eliminar la materia.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }
}
