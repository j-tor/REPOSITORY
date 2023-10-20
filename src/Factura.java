

public class Factura extends javax.swing.JFrame {

   
   Ticket ticket;
   PalindromoAir palindromo=new PalindromoAir();
    public Factura(Ticket ticket) {
        this.ticket=ticket;
       initComponents(); 
       setLocationRelativeTo(null);
       lbnombre.setText(ticket.getnombrePasajero());
       String total=Double.toString(ticket.gettotalpagado());
       total_pagado.setText(total);
     
       
       if(palindromo.isPalindromo(ticket.getnombrePasajero())==false){
           descuento.setText("0");
           
       }else {
           descuento.setText("160");
           JOptionPane.showMessageDialog(null, "Descuento 20% Aplicado");
       }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        total_pagado = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Factura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Pasajero: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        lbnombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre.setText("nombre");
        getContentPane().add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 130, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total a Pagado: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        total_pagado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_pagado.setForeground(new java.awt.Color(255, 255, 255));
        total_pagado.setText(".......");
        getContentPane().add(total_pagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, -1));

        descuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descuento.setText(".....");
        getContentPane().add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 701, 412));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descuento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel total_pagado;
    // End of variables declaration//GEN-END:variables
}
