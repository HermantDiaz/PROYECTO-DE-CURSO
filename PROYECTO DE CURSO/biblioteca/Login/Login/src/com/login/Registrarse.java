/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        imagen3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        Nuevousuariotxt = new javax.swing.JLabel();
        Nuevousuarioinput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        NuevaContraseñatxt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Nuevacontraseñainput = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        Registrarse = new javax.swing.JPanel();
        REGISTRARSEXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(153, 0, 204));

        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2(2).png"))); // NOI18N

        logo.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        logo.setText("CONTABILIDAD FINANCIERA");

        Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2(1).png"))); // NOI18N

        imagen2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        imagen2.setText("REGISTRARSE ");

        Nuevousuariotxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Nuevousuariotxt.setText("NUEVO USUARIO");

        Nuevousuarioinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nuevousuarioinput.setForeground(new java.awt.Color(204, 204, 204));
        Nuevousuarioinput.setText("Ingrese su nombre de usuario");
        Nuevousuarioinput.setBorder(null);
        Nuevousuarioinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NuevousuarioinputMousePressed(evt);
            }
        });
        Nuevousuarioinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevousuarioinputActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        NuevaContraseñatxt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NuevaContraseñatxt.setText("NUEVA CONTRASEÑA");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Nuevacontraseñainput.setForeground(new java.awt.Color(204, 204, 204));
        Nuevacontraseñainput.setText("********");
        Nuevacontraseñainput.setBorder(null);
        Nuevacontraseñainput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NuevacontraseñainputMousePressed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 111, 157));
        jSeparator3.setForeground(new java.awt.Color(255, 111, 157));

        Registrarse.setBackground(new java.awt.Color(255, 111, 157));
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        REGISTRARSEXT.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        REGISTRARSEXT.setForeground(new java.awt.Color(255, 255, 255));
        REGISTRARSEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REGISTRARSEXT.setText("Registrarse");
        REGISTRARSEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        REGISTRARSEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGISTRARSEXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RegistrarseLayout = new javax.swing.GroupLayout(Registrarse);
        Registrarse.setLayout(RegistrarseLayout);
        RegistrarseLayout.setHorizontalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REGISTRARSEXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        RegistrarseLayout.setVerticalGroup(
            RegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REGISTRARSEXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen2)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaContraseñatxt)
                    .addComponent(Nuevousuariotxt)
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Nuevacontraseñainput, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nuevousuarioinput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(Imagen1))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(imagen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Nuevousuariotxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevousuarioinput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NuevaContraseñatxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nuevacontraseñainput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevousuarioinputMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevousuarioinputMousePressed
        // TODO add your handling code here:
        if (Nuevousuarioinput.getText().equals("Ingrese su nombre de usuario")){
            Nuevousuarioinput.setText("");
            Nuevousuarioinput.setForeground(Color.black);
        }

        if(String.valueOf(Nuevacontraseñainput.getPassword()).isEmpty()){
            Nuevacontraseñainput.setText("********");
            Nuevacontraseñainput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NuevousuarioinputMousePressed

    private void NuevousuarioinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevousuarioinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevousuarioinputActionPerformed

    private void NuevacontraseñainputMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevacontraseñainputMousePressed
 
        if(String.valueOf(Nuevacontraseñainput.getPassword()).equals("********")){
            Nuevacontraseñainput.setText("");
            Nuevacontraseñainput.setForeground(Color.black);
        }

        if(Nuevousuarioinput.getText().isEmpty()){
            Nuevousuarioinput.setText("Ingrese su nombre de usuario");
            Nuevousuarioinput.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NuevacontraseñainputMousePressed

public static String NuevoUsuario;
public static String NuevaContraseña;

    
    private void REGISTRARSEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGISTRARSEXTMouseClicked
        // REGISTRO
        NuevoUsuario = Nuevousuarioinput.getText();
        NuevaContraseña = Nuevacontraseñainput.getText();
        
        JOptionPane.showMessageDialog(this, "Usuario y contraseña registrada");
        this.dispose();
        
        Login MostrarLogin = new Login();
        MostrarLogin.setVisible(true);
        
          
    }//GEN-LAST:event_REGISTRARSEXTMouseClicked


    
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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel NuevaContraseñatxt;
    private javax.swing.JPasswordField Nuevacontraseñainput;
    private javax.swing.JTextField Nuevousuarioinput;
    private javax.swing.JLabel Nuevousuariotxt;
    private javax.swing.JLabel REGISTRARSEXT;
    private javax.swing.JPanel Registrarse;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagen2;
    private javax.swing.JLabel imagen3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
