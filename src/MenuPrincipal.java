




public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
          setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        vender_boleto = new javax.swing.JButton();
        lista_pasajeros = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelar_ticket = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú Principal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        vender_boleto.setBackground(new java.awt.Color(0, 0, 204));
        vender_boleto.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        vender_boleto.setForeground(new java.awt.Color(255, 255, 255));
        vender_boleto.setText("Vender Ticket");
        vender_boleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vender_boletoActionPerformed(evt);
            }
        });
        getContentPane().add(vender_boleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        lista_pasajeros.setBackground(new java.awt.Color(0, 0, 204));
        lista_pasajeros.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lista_pasajeros.setForeground(new java.awt.Color(255, 255, 255));
        lista_pasajeros.setText("Lista de Pasajeros");
        lista_pasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_pasajerosActionPerformed(evt);
            }
        });
        getContentPane().add(lista_pasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 213, 353));

        cancelar_ticket.setBackground(new java.awt.Color(0, 0, 255));
        cancelar_ticket.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cancelar_ticket.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_ticket.setText("Cancelar Ticket");
        cancelar_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_ticketActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salir ");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 320, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lista_pasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_pasajerosActionPerformed
   ListadePasajeros lista = new ListadePasajeros();
   lista.setVisible(true);
   this.dispose();
    }//GEN-LAST:event_lista_pasajerosActionPerformed

    private void vender_boletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vender_boletoActionPerformed
       JavaTicket ticket = new JavaTicket();
       ticket.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_vender_boletoActionPerformed

    private void cancelar_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_ticketActionPerformed
    CancelarTicket cancelar= new CancelarTicket();
    cancelar.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_cancelar_ticketActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar_ticket;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lista_pasajeros;
    private javax.swing.JButton vender_boleto;
    // End of variables declaration//GEN-END:variables
}
