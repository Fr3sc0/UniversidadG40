package universidadejemplo.vistas;

import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Inscripciones extends javax.swing.JInternalFrame {
    
    private List<Materia> listaM;
    private List<Alumno> listaA;
    
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    
   
    public Inscripciones() {
        initComponents();
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();        
        
        cargaAlumnos();
        armarCabeceraTabla();
        
        
    }

    private void cargaAlumnos(){
        for(Alumno item: listaA){
            cbAlumnos.addItem(item);
        }
    }
   
    private void armarCabeceraTabla(){
        ArrayList<Object> filacabecera = new ArrayList<>();
        filacabecera.add("idMateria"); //??
        filacabecera.add("nombre");
        filacabecera.add ("anio");
        for(Object it: filacabecera){
            modelo. addColumn(it);
        }
        tMaterias.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
             modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptas(){
        Alumno selec = (Alumno)cbAlumnos.getSelectedItem();
        listaM = (ArrayList) inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m: listaM){
            modelo.addRow(new Object[]{m.getIdMateria() , m.getNombre() ,m.getAnio()});
        }
    
    }
    
    private void cargaDatosInscriptas(){
        Alumno selec = (Alumno) cbAlumnos.getSelectedItem();
        List <Materia> lista =(ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista){
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnio()});
            
        }
    }
    
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        bInscribir = new javax.swing.JButton();
        bAInscripcion = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        cbAlumnos.setFont(new java.awt.Font("Sitka Subheading", 0, 14)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        rbInscriptas.setText("Materia Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        rbNoInscriptas.setText("Materias no Inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tMaterias);

        bInscribir.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bInscribir.setText("Inscribir");
        bInscribir.setEnabled(false);
        bInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscribirActionPerformed(evt);
            }
        });

        bAInscripcion.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bAInscripcion.setText("Anular Inscripcion");
        bAInscripcion.setEnabled(false);
        bAInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAInscripcionActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(rbInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbNoInscriptas)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67)
                                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bInscribir)
                                .addGap(79, 79, 79)
                                .addComponent(bAInscripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(bSalir)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInscriptas)
                    .addComponent(rbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInscribir)
                    .addComponent(bAInscripcion)
                    .addComponent(bSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        borrarFilaTabla();
        rbNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        bInscribir.setEnabled(false);
        bAInscripcion.setEnabled(true);
        
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
       
        borrarFilaTabla();
        rbInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        bAInscripcion.setEnabled(false);
        bInscribir.setEnabled(true);
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void bInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscribirActionPerformed
        
        int filaSeleccionada=tMaterias.getSelectedRow();
        if(filaSeleccionada!= -1){
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m=new Materia(idMateria,nombreMateria,anio, true);
            Inscripcion i =new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            
            
        }
    }//GEN-LAST:event_bInscribirActionPerformed

    private void bAInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAInscripcionActionPerformed
        
        int filaSeleccionada = tMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
                        
            Alumno a=(Alumno) cbAlumnos.getSelectedItem();
            int idMateria =(Integer) modelo.getValueAt(filaSeleccionada, 0);
            
            inscData.borrarInscripcion(a.getIdAlumno() , idMateria);
            borrarFilaTabla();
        }          
        
    }//GEN-LAST:event_bAInscripcionActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
       
        dispose();
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
     
        //??
    }//GEN-LAST:event_cbAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAInscripcion;
    private javax.swing.JButton bInscribir;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables
}
