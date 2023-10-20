
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;





public class ListadePasajeros extends javax.swing.JFrame {
    private PalindromoAir pala;
    
    public ListadePasajeros() {
        initComponents();
        setLocationRelativeTo(null);
        PalindromoAir pal = new PalindromoAir();
        String texto = "Erorr 404"
                + " list not found";
        
        lista_De_pasajeros.setEditable(false);
        lista_De_pasajeros.setText(texto);
        //pala.printPassengers();
     
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_De_pasajeros = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lista de Pasajeros ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 330, 40));

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        lista_De_pasajeros.setColumns(20);
        lista_De_pasajeros.setRows(5);
        jScrollPane1.setViewportView(lista_De_pasajeros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 350, 190));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 566, 416));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lista_De_pasajeros;
    // End of variables declaration//GEN-END:variables


public void printPassengers() {
        String textToPrint = lista_De_pasajeros.getText(); // Obtener el texto del TextArea

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        if (printerJob.printDialog()) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                // Manejar la excepción en caso de un error de impresión
                e.printStackTrace();
            }
        }}
public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadePasajeros().setVisible(true);
            }
        });
    }
}


 

