package paqueteprincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ventanaprincipal extends javax.swing.JFrame {

    BotonContador btnBotonA;
    BotonContador btnBotonB;
    BotonContador btnBotonC;

    public ventanaprincipal() {
        initComponents();

        CreacionVentana();

    }

    public void CreacionVentana() {

        this.setTitle("Ejercicio de Herencia");
        this.setSize(320, 400);

        btnBotonA = new BotonContador();
        btnBotonA.setText("Boton A");
        btnBotonA.setBounds(10, 10, 100, 30);
        this.getContentPane().add(btnBotonA);

        btnBotonB = new BotonContador();
        btnBotonB.setText("Boton B");
        btnBotonB.setBounds(130, 10, 100, 30);
        this.getContentPane().add(btnBotonB);

        btnBotonC = new BotonContador();
        btnBotonC.setText("Boton C");
        btnBotonC.setBounds(70, 45, 100, 30);
        this.getContentPane().add(btnBotonC);

        btnBotonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonA(evt);
            }
        });

        btnBotonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonB(evt);
            }
        });

        btnBotonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PulsacionBotonC(evt);
            }
        });

    }

    public void PulsacionBotonA(ActionEvent evt) {
        btnBotonA.incrementa();
    }

    public void PulsacionBotonB(ActionEvent evt) {
        btnBotonB.incrementa();
    }

    public void PulsacionBotonC(ActionEvent evt) {
        btnBotonC.incrementa();
        btnBotonC.aumenta(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerPulsaciones.setText("Ver Pulsaciones");
        btnVerPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar ");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jTextField1.setText("3");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerPulsaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReiniciar)
                    .addComponent(btnVerPulsaciones))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        btnBotonA.reiniciar();
        btnBotonB.reiniciar();
        btnBotonC.reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnVerPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsacionesActionPerformed
        String info;

        info = "El boton A se ha pulsado " + btnBotonA.getPulsaciones() + "\n";
        info = info + "El boton B se ha pulsado " + btnBotonB.getPulsaciones() + "\n";
        info = info + "El boton C se ha pulsado " + btnBotonC.getPulsaciones() + "\n";
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnVerPulsacionesActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int num = Integer.parseInt(jTextField1.getText());
        btnBotonA.setPulsaciones(num);
        btnBotonB.setPulsaciones(num);
        btnBotonC.setPulsaciones(num);
    
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
