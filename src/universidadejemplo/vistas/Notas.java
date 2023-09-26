package universidadejemplo.vistas;

import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Notas extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;

    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;

    private DefaultTableModel modelo;

    public Notas() {
        initComponents();

        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        inscData = new InscripcionData();
        mData = new MateriaData();
        modelo = new DefaultTableModel();

        cargaAlumnos();
        armarCabeceraTabla();
        obtenerInscripcionesPorAlumno();

    }

    private void cargaAlumnos() {
        for (Alumno item : listaA) {
            cbAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("idMateria");
        filacabecera.add("nombre");
        filacabecera.add("nota");
        //filacabecera.add ("anio");
        for (Object it : filacabecera) {
            modelo.addColumn(it);
        }

        tAlumnos.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void obtenerInscripcionesPorAlumno() {
        borrarFilaTabla();
        Alumno selec = (Alumno) cbAlumnos.getSelectedItem();
        List<Inscripcion> lista = (ArrayList) inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        for (Inscripcion m : lista) {
            modelo.addRow(new Object[]{m.getMateria().getIdMateria(), m.getMateria().getNombre(), m.getNota()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        bGuardar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        cbAlumnos.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tAlumnos);

        bGuardar.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(bGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSalir)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)
                        .addContainerGap(249, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardar)
                    .addComponent(bSalir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        obtenerInscripcionesPorAlumno();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        int filaSeleccionada = tAlumnos.getSelectedRow();
        if (filaSeleccionada != -1) {
            try {
                Alumno a = (Alumno) cbAlumnos.getSelectedItem();
                double nota = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());
                if (nota > 10 && nota < 0) {
                    JOptionPane.showMessageDialog(null, "Porfavor ingrese una nota valida!");
                } else {
                    int idMateria = (int) modelo.getValueAt(filaSeleccionada, 0);

                    inscData.actualizarNota(a.getIdAlumno(), idMateria, nota);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Error al ingresar la nota");
            }
        }
    }//GEN-LAST:event_bGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
