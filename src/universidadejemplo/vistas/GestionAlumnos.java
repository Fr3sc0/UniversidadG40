package universidadejemplo.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.Alumno;

public class GestionAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual= null;

    public GestionAlumnos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        rbEstado = new javax.swing.JRadioButton();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        bBuscar = new javax.swing.JButton();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        bBuscar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bNuevo.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bGuardar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });

        bEliminar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
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
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbEstado)
                    .addComponent(tfDni)
                    .addComponent(tfNombre)
                    .addComponent(tfApellido)
                    .addComponent(dcFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBuscar)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(bNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(bGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(bEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bSalir)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rbEstado))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo)
                    .addComponent(bGuardar)
                    .addComponent(bEliminar)
                    .addComponent(bSalir))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
        Integer dni = Integer.parseInt(tfDni.getText());
        alumnoActual= aluData.buscarAlumnoPorDni(dni);
            if (alumnoActual != null) {
                tfApellido.setText(alumnoActual.getApellido());
                tfNombre.setText(alumnoActual.getNombre());
                rbEstado.setSelected(alumnoActual.isEstado());
                LocalDate lc= alumnoActual.getFechaNacimiento();
                java.util.Date date= java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                dcFechaNac.setDate(date);
            }
        }catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(this, "Usted debe ingresar solo numeros enteros.");
            tfDni.setText("");
        }
    }    
        private void limpiarCampos(){
        tfApellido.setText("");
        tfNombre.setText("");
        tfDni.setText("");
        rbEstado.setSelected(true);
        dcFechaNac.setDate(new Date());
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        alumnoActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        Integer dni=Integer.parseInt(tfDni.getText());
        String nombre=tfNombre.getText();
        String apellido=tfApellido.getText();
            if (nombre.isEmpty()||apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.");
                return;
            }
            java.util.Date sfecha=dcFechaNac.getDate();
            LocalDate fechaNac=sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado= rbEstado.isSelected();
            if (alumnoActual==null) {
                alumnoActual=new Alumno(dni, apellido, nombre, fechaNac, estado);
                aluData.guardarAlumno(alumnoActual);
            }else{
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNacimiento(fechaNac);
                aluData.modificarAlumno(alumnoActual);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido.");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (alumnoActual!=null) {
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado.");
        }
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
