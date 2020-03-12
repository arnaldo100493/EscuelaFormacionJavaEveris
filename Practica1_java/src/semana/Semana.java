
package semana;


public class Semana extends javax.swing.JFrame {

    
    public Semana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDia = new javax.swing.JLabel();
        Tdia = new javax.swing.JTextField();
        labelRespuesta = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDia.setText("Ingrese Dia de Semana:");
        getContentPane().add(labelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 20));
        getContentPane().add(Tdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 90, -1));
        getContentPane().add(labelRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String dia = Tdia.getText();
        if (dia.equalsIgnoreCase("lunes" ) || dia.equalsIgnoreCase("martes") ||
            dia.equalsIgnoreCase("miercoles" )||dia.equalsIgnoreCase("miércoles" )
           || dia.equalsIgnoreCase("jueves" )|| dia.equalsIgnoreCase("viernes" ) ) { 
            labelRespuesta.setText("Es un dia Entre Semana");            
        }else if(dia.equalsIgnoreCase("sabado" ) || dia.equalsIgnoreCase("sábado" ) 
                ||dia.equalsIgnoreCase("domingo") ){
            labelRespuesta.setText("Es Fin de Semana");  
        }else if(dia.equalsIgnoreCase("") ){
            labelRespuesta.setText("Por Favor Ingrese un Dia"); 
        }else{
             labelRespuesta.setText("No Es Un Dia La Semana"); 
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tdia;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelRespuesta;
    // End of variables declaration//GEN-END:variables
}
