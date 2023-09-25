
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;

public class MateriaData {
    private Connection con=null;
     
    public MateriaData(){
        con = Conexion.getConexion();
    }
    public void guardarMateria(Materia materia){
        String sql= "INSERT INTO materia(nombre, anio, estado) VALUE(?, ?, ?)";
        
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
        
        String sql="UPDATE materia SET nombre= ?, anio = ? WHERE idMateria=?";

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
    public Materia buscarMateria(int id){
        String sql="SELECT nombre, anio FROM materia WHERE idMateria = ? AND estado = 1";
        Materia mat=null;
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                mat=new Materia();
                mat.setIdMateria(id);
                mat.setNombre(rs.getString("nombre"));
                mat.setAnio(rs.getInt("Anio"));
                mat.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "Materia no encontrada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
         return mat;
    }
    public List <Materia> listarMaterias(){
        String sql="SELECT idMateria, nombre, anio FROM Materia WHERE estado = 1";
        ArrayList <Materia> materias= new ArrayList<>();
         try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Materia materia= new Materia();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("Anio"));
               materia.setEstado(true);  
            }
                
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
         return materias;    
    }
}
