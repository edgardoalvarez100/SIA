/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frreportes.java
 *
 * Created on 06-jun-2012, 22:43:09
 */
/**
 *
 * @author andres
 */
public class frreportes extends javax.swing.JFrame {

    /** Creates new form frreportes */
    public frreportes() {
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
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        bt_1 = new javax.swing.JMenuItem();
        bt_2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setTitle("Modulo Reportes");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30));
        jLabel1.setText("REPORTES");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes A");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        bt_1.setText(" CUANTOS ESTUDIANTES APROBARON EL SEMESTRE");
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        jMenu2.add(bt_1);

        bt_2.setText("CUANTOS ESTUDIANTES REPROBARON EL SEMESTRE");
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        jMenu2.add(bt_2);

        jMenuItem1.setText("CUANTAS ASIGNATURAS TIPO A HAY Y CUAL ES LA SUMA DE SUS CRÉDITOS");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("CUANTAS ASIGNATURAS TIPO B HAY Y CUAL ES LA SUMA DE SUS CRÉDITOS");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("CUANTOS ESTUDIANTES OBTUVIERON PROMEDIO PONDERADO INFERIOR A 2.0");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes B");

        jMenuItem4.setText("CUANTOS ESTUDIANTES OBTUVIERON PROMEDIO PONDERADO ENTRE 2.0 Y MENOR A 3.0");
        jMenu3.add(jMenuItem4);

        jMenuItem6.setText("CUANTOS ESTUDIANTES OBTUVIERON PROMEDIO PONDERADO ENTRE 3.0 Y MENOR A 4.0.");
        jMenu3.add(jMenuItem6);

        jMenuItem5.setText("CUANTOS ESTUDIANTES OBTUVIERON PROMEDIO PONDERADO ENTRE 4.0 Y 5.0");
        jMenu3.add(jMenuItem5);

        jMenuItem7.setText("CUÀL ES EL NOMBRE DEL ESTUDIANTE QUE OBTUVO EL MEJOR PROMEDIO PONDERADO DEL CURSO Y CUÁL FUE ESE PROMEDIO");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes C");

        jMenuItem9.setText("jMenuItem9");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("jMenuItem10");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem11");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem12");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("CUAL ES LA ASIGNATURA CON MAYOR CANTIDAD DE CREDITOS");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        //Estudiantes que aprobaron
        
        
        Reporte.Archivo="Estudiantes_aprobados.html";
        Reporte.SQL="SELECT e.EST_COD_MATRICULA, UPPER(e.EST_NOMBRES), UPPER(e.EST_APELLIDOS), fn_multiplicacion(e.est_codigo)/fn_suma_creditos(e.est_codigo) FROM SIA_NOTAS n INNER JOIN SIA_PROYECCIONES p ON n.PRO_CODIGO=p.PRO_CODIGO INNER JOIN SIA_ASIGNATURAS a ON p.ASI_CODIGO=a.ASI_CODIGO INNER JOIN SIA_ESTUDIANTES e ON e.EST_CODIGO=p.EST_CODIGO WHERE (fn_multiplicacion(e.est_codigo)/fn_suma_creditos(e.est_codigo)) >=3 GROUP BY e.EST_CODIGO, e.EST_COD_MATRICULA, e.EST_NOMBRES, e.EST_APELLIDOS ORDER BY e.EST_CODIGO"; 
        Reporte.Logo="images/logo.png";
        Reporte.ncol=4;
        String V[]={"CODIGO","NOMBRES", "APELLIDOS","P. PONDERADO"};
        Reporte.Titulo="Estudiantes Aprobados";
        Reporte.ReportHTML(V);
        
    }//GEN-LAST:event_bt_1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
     
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
//Estudiantes que reprobaron
        
        
        Reporte.Archivo="Estudiantes_reprobados.html";
        Reporte.SQL="SELECT e.EST_COD_MATRICULA, UPPER(e.EST_NOMBRES), UPPER(e.EST_APELLIDOS), fn_multiplicacion(e.est_codigo)/fn_suma_creditos(e.est_codigo) FROM SIA_NOTAS n INNER JOIN SIA_PROYECCIONES p ON n.PRO_CODIGO=p.PRO_CODIGO INNER JOIN SIA_ASIGNATURAS a ON p.ASI_CODIGO=a.ASI_CODIGO INNER JOIN SIA_ESTUDIANTES e ON e.EST_CODIGO=p.EST_CODIGO WHERE (fn_multiplicacion(e.est_codigo)/fn_suma_creditos(e.est_codigo))<3 GROUP BY e.EST_CODIGO, e.EST_COD_MATRICULA, e.EST_NOMBRES, e.EST_APELLIDOS ORDER BY e.EST_CODIGO"; 
        Reporte.Logo="images/logo.png";
        Reporte.ncol=4;
        String V[]={"CODIGO","NOMBRES", "APELLIDOS","P. PONDERADO"};
        Reporte.Titulo="Estudiantes Reprobados";
        Reporte.ReportHTML(V);
    }//GEN-LAST:event_bt_2ActionPerformed

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
            java.util.logging.Logger.getLogger(frreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frreportes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bt_1;
    private javax.swing.JMenuItem bt_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}