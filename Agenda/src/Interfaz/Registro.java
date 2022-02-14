package Interfaz;

import static Interfaz.InterfazGrafica.mostrarCorrecto;
import static Interfaz.InterfazGrafica.mostrarLogin;
import static Interfaz.InterfazGrafica.mostrarReg;
import main.TextPrompt;
import static Interfaz.LogIn.txtUsuario;
import java.awt.Color;

import javax.swing.JOptionPane;
import main.*;
import static main.UsuariosSql.esContra;

public class Registro extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public Registro() {

        initComponents();
        setLocationRelativeTo(null);

        TextPrompt uno = new TextPrompt("RobDiaz983", txtUsuarioReg);
        TextPrompt dos = new TextPrompt("Roberto", txtNombre);
        TextPrompt tres = new TextPrompt("********", txtContra);
        TextPrompt cuatro = new TextPrompt("********", txtContra1);
        TextPrompt cinco = new TextPrompt("Robertodiaz983@gmail.com", txtCorreo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        favicon2 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        btnVolverText = new javax.swing.JLabel();
        btnReg = new javax.swing.JPanel();
        btnRegText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContra1 = new javax.swing.JPasswordField();
        userLabel1 = new javax.swing.JLabel();
        txtUsuarioReg = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        passLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        passLabel2 = new javax.swing.JLabel();
        passLabel4 = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(254, 254, 254));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rsz_1rsz_minimal-wallpaper-for-smartphone-full-123-scaled.jpg"))); // NOI18N
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        title2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title2.setText("REGISTRARSE");
        Panel.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        favicon2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/favicon.png"))); // NOI18N
        favicon2.setText("NETCONTACTS");
        Panel.add(favicon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("NOMBRE");
        Panel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CORREO");
        Panel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnVolver.setBackground(new java.awt.Color(0, 134, 190));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });

        btnVolverText.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnVolverText.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolverText.setText("VOLVER");
        btnVolverText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolverText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolverText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Panel.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 130, 40));

        btnReg.setBackground(new java.awt.Color(0, 134, 190));
        btnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegMouseClicked(evt);
            }
        });

        btnRegText.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnRegText.setForeground(new java.awt.Color(255, 255, 255));
        btnRegText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegText.setText("REGISTRAR");
        btnRegText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegLayout = new javax.swing.GroupLayout(btnReg);
        btnReg.setLayout(btnRegLayout);
        btnRegLayout.setHorizontalGroup(
            btnRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegText, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnRegLayout.setVerticalGroup(
            btnRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Panel.add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 130, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 430, 20));

        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        Panel.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 430, -1));

        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        Panel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 160, -1));

        txtContra1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtContra1.setBorder(null);
        txtContra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContra1ActionPerformed(evt);
            }
        });
        Panel.add(txtContra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, -1));

        userLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel1.setText("USUARIO");
        Panel.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtUsuarioReg.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUsuarioReg.setBorder(null);
        txtUsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegActionPerformed(evt);
            }
        });
        Panel.add(txtUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 20));

        passLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel1.setText("CONTRASEÑA");
        passLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        passLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        passLabel1.setName(""); // NOI18N
        passLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel.add(passLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 160, 20));

        txtContra.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtContra.setBorder(null);
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        Panel.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, 20));

        passLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel2.setText("CONTRASEÑA");
        Panel.add(passLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        passLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel4.setText("REPITA SU");
        passLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        passLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        passLabel4.setName(""); // NOI18N
        passLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Panel.add(passLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 90, 30));

        txtError.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        txtError.setForeground(new java.awt.Color(151, 2, 2));
        Panel.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 540, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContra1ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtUsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegActionPerformed

    private void btnRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegMouseClicked

    }//GEN-LAST:event_btnRegMouseClicked

    private void btnRegTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegTextMouseExited
        btnReg.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnRegTextMouseExited

    private void btnRegTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegTextMouseEntered
        btnReg.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnRegTextMouseEntered

    private void btnRegTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegTextMouseClicked

        UsuariosSql modSql = new UsuariosSql();
        Usuarios mod = new Usuarios();
        String pass = new String(txtContra1.getPassword());
        String passConfirm = new String(txtContra.getPassword());

//     Comprobar si los campos estan vacios
        if (txtUsuarioReg.getText().equals("")
                || pass.equals("")
                || passConfirm.equals("")
                || txtCorreo.getText().equals("")
                || txtNombre.getText().equals("")) {

            txtError.setText("(*) COMPLETA TODOS LOS CAMPOS");
        } else {

//      Continua con el registro
            if (pass.equals(passConfirm)) {

//              Existe Usuario?
                if (modSql.existeUsuario(txtUsuarioReg.getText()) == 0) {

//                  Correo valido?
                    if (modSql.esEmail(txtCorreo.getText())) {

                        if (modSql.esContra(pass)) {

                            String nuevaPass = hash.sha1(pass);
                            mod.setUsuario(txtUsuarioReg.getText());
                            mod.setNombre(txtNombre.getText());
                            mod.setCorreo(txtCorreo.getText());
                            mod.setPassword(nuevaPass);

                            if (modSql.registrar(mod)) {

                                if (mostrarCorrecto == null) {

                                    mostrarCorrecto = new Correcto();
                                    mostrarCorrecto.setVisible(true);
                                    mostrarCorrecto = null;
                                    this.dispose();
                                }

                            } else {
                                txtError.setText("(*) ERROR AL GUARDAR");
                            }
                        } else {
                            txtError.setText("(*) LA CONTRASEÑA DEBE CONTENER 8 DIGITOS (2 LETRAS, 2 NUMEROS, MAYUSCULAS Y MINUSCULAS)");
                        }
                    } else {
                        txtError.setText("(*) EL MAIL NO ES VALIDO.");
                    }
                } else {
                    txtError.setText("(*) ESTE NOMBRE DE USUARIO YA EXISTE");
                }
            } else {
                txtError.setText("(*) LAS CONTRASEÑAS NO COINCIDEN");
            }
        }
    }//GEN-LAST:event_btnRegTextMouseClicked

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited

    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered

    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnVolverTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTextMouseExited
        btnVolver.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnVolverTextMouseExited

    private void btnVolverTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTextMouseEntered
        btnVolver.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_btnVolverTextMouseEntered

    private void btnVolverTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverTextMouseClicked
        if (mostrarLogin == null) {

            mostrarLogin = new LogIn();
            mostrarLogin.setVisible(true);
            this.setVisible(false);
            mostrarLogin = null;

        }
    }//GEN-LAST:event_btnVolverTextMouseClicked

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        
    }//GEN-LAST:event_txtNombreFocusGained

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel btnReg;
    private javax.swing.JLabel btnRegText;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JLabel btnVolverText;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon2;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passLabel1;
    private javax.swing.JLabel passLabel2;
    private javax.swing.JLabel passLabel4;
    private javax.swing.JLabel title2;
    public static javax.swing.JPasswordField txtContra;
    private javax.swing.JPasswordField txtContra1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel txtError;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtUsuarioReg;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
