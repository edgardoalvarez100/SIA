/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frestudiantes.java
 *
 * Created on 25-may-2012, 12:33:19
 */
/**
 *
 * @author andres
 */
public class frestudiantes extends javax.swing.JFrame {

    /** Creates new form frestudiantes */
    public frestudiantes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        btsalir = new javax.swing.JMenuItem();
        MenuGestiones = new javax.swing.JMenu();
        btagregarest = new javax.swing.JMenuItem();
        btactualizarest = new javax.swing.JMenuItem();
        bteliminarest = new javax.swing.JMenuItem();
        MenuMatricula = new javax.swing.JMenu();
        MenuNuevo = new javax.swing.JMenuItem();
        MenuActualizar = new javax.swing.JMenuItem();
        MenuEliminar = new javax.swing.JMenuItem();

        setTitle("Modulo Estudiantes");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-estudiantes.jpg"))); // NOI18N

        MenuArchivo.setText("Archivo");

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(btsalir);

        jMenuBar1.add(MenuArchivo);

        MenuGestiones.setText("Gestionar");
        MenuGestiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGestionesActionPerformed(evt);
            }
        });

        btagregarest.setText("Agregar Nuevo");
        btagregarest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarestActionPerformed(evt);
            }
        });
        MenuGestiones.add(btagregarest);

        btactualizarest.setText("Actualizar");
        btactualizarest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarestActionPerformed(evt);
            }
        });
        MenuGestiones.add(btactualizarest);

        bteliminarest.setText("Eliminar");
        bteliminarest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarestActionPerformed(evt);
            }
        });
        MenuGestiones.add(bteliminarest);

        jMenuBar1.add(MenuGestiones);

        MenuMatricula.setText("Matricula");
        MenuMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMatriculaActionPerformed(evt);
            }
        });

        MenuNuevo.setText("Nuevo");
        MenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoActionPerformed(evt);
            }
        });
        MenuMatricula.add(MenuNuevo);

        MenuActualizar.setText("Actualiza");
        MenuMatricula.add(MenuActualizar);

        MenuEliminar.setText("Eliminar");
        MenuMatricula.add(MenuEliminar);

        jMenuBar1.add(MenuMatricula);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed

    this.hide();
}//GEN-LAST:event_btsalirActionPerformed

private void btagregarestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarestActionPerformed
// Boton Agregar Nuevo Estudiante
    nuevo_estudiante a = new nuevo_estudiante();
    a.setLocationRelativeTo(null);
    a.setVisible(true);
    
}//GEN-LAST:event_btagregarestActionPerformed

private void MenuGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGestionesActionPerformed

}//GEN-LAST:event_MenuGestionesActionPerformed

private void btactualizarestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarestActionPerformed
// ACTUALIZAR
    actualizar_estudiante a = new actualizar_estudiante();
    a.setLocationRelativeTo(null);
    a.setVisible(true);
}//GEN-LAST:event_btactualizarestActionPerformed

private void bteliminarestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarestActionPerformed
// boton Eliminar:
    eliminar_estudiante a = new eliminar_estudiante();
    a.setLocationRelativeTo(null);
    a.setVisible(true);
}//GEN-LAST:event_bteliminarestActionPerformed

private void MenuMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMatriculaActionPerformed

}//GEN-LAST:event_MenuMatriculaActionPerformed

private void MenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoActionPerformed

    nuevo_matricula a = new nuevo_matricula();
    a.setLocationRelativeTo(null);
    a.setVisible(true);
}//GEN-LAST:event_MenuNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(frestudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frestudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frestudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frestudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frestudiantes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuActualizar;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem MenuEliminar;
    private javax.swing.JMenu MenuGestiones;
    private javax.swing.JMenu MenuMatricula;
    private javax.swing.JMenuItem MenuNuevo;
    private javax.swing.JMenuItem btactualizarest;
    private javax.swing.JMenuItem btagregarest;
    private javax.swing.JMenuItem bteliminarest;
    private javax.swing.JMenuItem btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}