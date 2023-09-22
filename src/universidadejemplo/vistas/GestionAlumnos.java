package universidadejemplo.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    
    public GestionAlumnos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfDni)
                                    .addComponent(tfApellido)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addComponent(bBuscar))
                            .addComponent(rbEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bEliminar)
                                    .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(bSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(bNuevo)
                        .addGap(39, 39, 39)
                        .addComponent(bGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo)
                    .addComponent(bGuardar)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     AlumnoData ad = new AlumnoData();
    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        ad.buscarAlumnoPorDni(Integer.parseInt(tfDni.getText()));
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        tfApellido.setText("");
        tfNombre.setText("");
        tfDni.setText("");
        rbEstado.setSelected(false);
        dcFechaNac.setCalendar(null);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        /*if(){
            LocalDate fecha= dcFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumno al=new Alumno(Integer.parseInt(tfDni.getText()), tfApellido.getText(),tfNombre.getText(), fecha, rbEstado.isSelected());
            ad.modificarAlumno(al);
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un dni valido!");
        }*/
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        AlumnoData ad=new AlumnoData();
        ad.eliminarAlumno(Integer.parseInt(tfDni.getText()));
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private com.toedter.calendar.JDateChooser dcFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
