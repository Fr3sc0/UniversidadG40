package universidadejemplo.vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.Materia;

public class GestionMaterias extends javax.swing.JInternalFrame {

    private MateriaData md=new MateriaData();
    private Materia materiaActual=null;
    
    public GestionMaterias() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Materia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bNuevo = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        tfAnio = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        rbEstado = new javax.swing.JRadioButton();

        Materia.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        Materia.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

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

        tfAnio.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N
        tfAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnioActionPerformed(evt);
            }
        });

        tfNombre.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N

        tfCodigo.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N

        bBuscar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        rbEstado.setEnabled(false);
        rbEstado.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(Materia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(140, 140, 140)
                                                .addComponent(bBuscar))
                                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bGuardar)
                                            .addComponent(rbEstado))
                                        .addGap(42, 42, 42)
                                        .addComponent(bEliminar)
                                        .addGap(50, 50, 50)
                                        .addComponent(bSalir))))
                            .addComponent(bNuevo))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Materia)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bGuardar)
                        .addComponent(bEliminar)
                        .addComponent(bSalir)))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnioActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        try{
        Integer codigo = Integer.parseInt(tfCodigo.getText());
        materiaActual= md.buscarMateria(codigo);
            if (materiaActual != null) {
                tfNombre.setText(materiaActual.getNombre());
                tfAnio.setText(Integer.toString(materiaActual.getAnio()));
                rbEstado.setSelected(materiaActual.isEstado());
            }
        }catch(NumberFormatException Ex){
            JOptionPane.showMessageDialog(this, "Usted debe ingresar solo numeros enteros.");
            tfCodigo.setText("");
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void limpiarCampos(){
        tfCodigo.setText("");
        tfNombre.setText("");
        tfAnio.setText("");
        rbEstado.setSelected(false);
    }
    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        limpiarCampos();
        materiaActual=null;
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        try{
        Integer codigo=Integer.parseInt(tfCodigo.getText());
        String nombre=tfNombre.getText();
        Integer anio=Integer.parseInt(tfAnio.getText());
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos.");
                return;
            }
            Boolean estado= rbEstado.isSelected();
            if (materiaActual==null) {
                materiaActual=new Materia(nombre, anio, true);
                md.guardarMateria(materiaActual);
            }else{
                materiaActual.setNombre(nombre);
                materiaActual.setAnio(anio);
                md.modificarMateria(materiaActual);
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un codigo válido.");
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (materiaActual!=null) {
            md.eliminarMateria(materiaActual.getIdMateria());
            materiaActual=null;
            limpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay una materia seleccionado.");
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Materia;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfAnio;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
