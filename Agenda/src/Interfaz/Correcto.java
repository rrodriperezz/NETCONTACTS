/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import static Interfaz.InterfazGrafica.mostrarHub;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Usuarios;
import main.UsuariosSql;
import main.hash;
import static Interfaz.Registro.txtContra;
import static Interfaz.Registro.txtUsuarioReg;

public class Correcto extends javax.swing.JFrame {

    public Correcto() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JPanel();
        btnCorrecto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        favicon.setText("NETCONTACTS");
        jPanel1.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("REGISTRO EXITOSO.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 240, 60));

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        btnCorrecto.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnCorrecto.setForeground(new java.awt.Color(255, 255, 255));
        btnCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCorrecto.setText("ENTRAR");
        btnCorrecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorrecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorrectoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorrectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCorrectoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCorrecto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 130, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Screenshot from 2022-02-13 17-59-29.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrectoMouseClicked

        UsuariosSql modSql = new UsuariosSql();
        Usuarios mod = new Usuarios();

        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String contra = new String(txtContra.getPassword());

        String nuevaContra = hash.sha1(contra);

        mod.setUsuario(txtUsuarioReg.getText());
        mod.setPassword(nuevaContra);
        mod.setLast_conexion(fecha.format(date));

//           Verificar si los datos estan correctos
        if (modSql.Login(mod)) {

            if (mostrarHub == null) {

                mostrarHub = new Hub();
                mostrarHub.setVisible(true);
                this.setVisible(false);
                mostrarHub = null;

            }
        }


    }//GEN-LAST:event_btnCorrectoMouseClicked

    private void btnCorrectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrectoMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnCorrectoMouseEntered

    private void btnCorrectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrectoMouseExited
        loginBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnCorrectoMouseExited

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked

    }//GEN-LAST:event_loginBtnMouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Correcto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btnCorrecto;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginBtn;
    // End of variables declaration//GEN-END:variables
}
