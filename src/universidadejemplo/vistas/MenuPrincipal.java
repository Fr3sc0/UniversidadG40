package universidadejemplo.vistas;

import java.awt.Color;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAlumno = new javax.swing.JMenu();
        menuAlumno = new javax.swing.JMenuItem();
        mMateria = new javax.swing.JMenu();
        menuMateria = new javax.swing.JMenuItem();
        mAdministracion = new javax.swing.JMenu();
        menuInscripciones = new javax.swing.JMenuItem();
        menuNotas = new javax.swing.JMenuItem();
        mConsultas = new javax.swing.JMenu();
        AluXMat = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        mAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Alumno.png"))); // NOI18N
        mAlumno.setText("Alumno");

        menuAlumno.setText("Formulario de Alumno");
        menuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlumnoActionPerformed(evt);
            }
        });
        mAlumno.add(menuAlumno);

        jMenuBar1.add(mAlumno);

        mMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Materia.png"))); // NOI18N
        mMateria.setText("Materia");

        menuMateria.setText("Formulario de Materia");
        menuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaActionPerformed(evt);
            }
        });
        mMateria.add(menuMateria);

        jMenuBar1.add(mMateria);

        mAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Administracion.png"))); // NOI18N
        mAdministracion.setText("Administración");

        menuInscripciones.setText("Manejo de Inscripciones");
        menuInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInscripcionesActionPerformed(evt);
            }
        });
        mAdministracion.add(menuInscripciones);

        menuNotas.setText("Manipulacion de Notas");
        menuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNotasActionPerformed(evt);
            }
        });
        mAdministracion.add(menuNotas);

        jMenuBar1.add(mAdministracion);

        mConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Consulta.png"))); // NOI18N
        mConsultas.setText("Consultas");

        AluXMat.setText("Alumnos por Materia");
        AluXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AluXMatActionPerformed(evt);
            }
        });
        mConsultas.add(AluXMat);

        jMenuBar1.add(mConsultas);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadejemplo/Recursos/Salir.png"))); // NOI18N
        mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSalirMouseClicked(evt);
            }
        });
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlumnoActionPerformed

        escritorio.removeAll();
        escritorio.repaint();
        GestionAlumnos ga=new GestionAlumnos();
        ga.setVisible(true);
        ga.getContentPane().setBackground(new Color(140,10,100));
        escritorio.add(ga);
        escritorio.moveToFront(ga);
    }//GEN-LAST:event_menuAlumnoActionPerformed

    private void menuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNotasActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        Notas notas=new Notas();
        notas.setVisible(true);
        escritorio.add(notas);
        escritorio.moveToFront(notas);
    }//GEN-LAST:event_menuNotasActionPerformed

    private void menuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionMaterias gm=new GestionMaterias();
        gm.setVisible(true);
        escritorio.add(gm);
        escritorio.moveToFront(gm);
    }//GEN-LAST:event_menuMateriaActionPerformed

    private void menuInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInscripcionesActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        Inscripciones ins=new Inscripciones();
        ins.setVisible(true);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
    }//GEN-LAST:event_menuInscripcionesActionPerformed

    private void AluXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AluXMatActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        AlumnoXMateria axm=new AlumnoXMateria();
        axm.setVisible(true);
        escritorio.add(axm);
        escritorio.moveToFront(axm);
    }//GEN-LAST:event_AluXMatActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        
    }//GEN-LAST:event_mSalirActionPerformed

    private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
       
        System.exit(0);
    }//GEN-LAST:event_mSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AluXMat;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mAdministracion;
    private javax.swing.JMenu mAlumno;
    private javax.swing.JMenu mConsultas;
    private javax.swing.JMenu mMateria;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuItem menuAlumno;
    private javax.swing.JMenuItem menuInscripciones;
    private javax.swing.JMenuItem menuMateria;
    private javax.swing.JMenuItem menuNotas;
    // End of variables declaration//GEN-END:variables
}
