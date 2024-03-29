/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import customComps.RoundedTextField;
import customComps.RoundedPanel;
import customComps.BackgroundPanel;
import java.sql.*;

import customComps.RoundedPasswordField;
import db.dao.DoctorDAO;
import db.entities.Doctor;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import validations.EmailChecker;

/**
 *
 * @author Aleja
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new BackgroundPanel("/resources/Artboard 1.png");
        Form = new RoundedPanel();
        labelTitle = new javax.swing.JLabel();
        labelSubtitle = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        inputEmail = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        labelPassword1 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        chkPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HealthSphere");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        BgPanel.setPreferredSize(new java.awt.Dimension(881, 519));
        BgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Form.setBackground(new java.awt.Color(217, 217, 217, 120
        ));

        labelTitle.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 36)); // NOI18N
        labelTitle.setText("Acceder");

        labelSubtitle.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 14)); // NOI18N
        labelSubtitle.setText("Iniciar Sesión para continuar");

        btnLogIn.setBackground(new java.awt.Color(217, 217, 217, 120));
        btnLogIn.setFont(new java.awt.Font("Hack Nerd Font Propo", 1, 12));
        btnLogIn.setText("Iniciar sesión");
        btnLogIn.setToolTipText("");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        inputEmail.setForeground(new java.awt.Color(153, 153, 153));
        inputEmail.setText("ejemplo@gmail.com");
        inputEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputEmailFocusLost(evt);
            }
        });
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 14)); // NOI18N
        labelPassword.setText("Contraseña");

        labelEmail.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 14)); // NOI18N
        labelEmail.setText("Email");

        btnSignup.putClientProperty("Component.style", "JButtonRounded");
        btnSignup.setBackground(new java.awt.Color(217, 217, 217, 120));
        btnSignup.setFont(new java.awt.Font("Hack Nerd Font Propo", 1, 12)); // NOI18N
        btnSignup.setText("Regístrate");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 14)); // NOI18N
        labelPassword1.setText("¿No tienes cuenta?");

        inputPassword.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 14)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(153, 153, 153));
        inputPassword.setText("Ingrese Contraseña");
        inputPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPasswordFocusLost(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        chkPassword.setFont(new java.awt.Font("Hack", 0, 12)); // NOI18N
        chkPassword.setText("Mostrar Contraseña");
        chkPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkPasswordMouseClicked(evt);
            }
        });
        chkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(labelTitle))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(labelSubtitle))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(labelEmail))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(labelPassword))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(chkPassword))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(labelPassword1)
                        .addGap(5, 5, 5)
                        .addComponent(btnSignup))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelTitle)
                .addGap(6, 6, 6)
                .addComponent(labelSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(chkPassword)
                .addGap(15, 15, 15)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BgPanel.add(Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 410, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        if(!new EmailChecker(inputEmail.getText()).isValid()) {
            JOptionPane.showMessageDialog(null, "El email no es válido", "Por favor verifique su correo electrónico", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        try {
            Doctor doc = new DoctorDAO().getDoctor(inputEmail.getText(), new String(inputPassword.getPassword()));      
            if (doc != null) {
                SessionManager.getInstance().login(doc); // we add a session of the current user
                this.dispose();
                new Dashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "El usuario o contraseña es incorrecto", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
                return;
            }     
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha sucedido un error interno en la aplicación, por favor contacte un administrador", "Error interno", JOptionPane.ERROR_MESSAGE);
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        this.dispose();
        new Signup().setVisible(true);
        
    }//GEN-LAST:event_btnSignupActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
            
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailFocusGained
        // TODO add your handling code here:
         if(inputEmail.getText().equals("ejemplo@gmail.com")){
            inputEmail.setText("");
            inputEmail.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_inputEmailFocusGained

    private void inputEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputEmailFocusLost
        // TODO add your handling code here:
        if(inputEmail.getText().equals("")){
            inputEmail.setText("ejemplo@gmail.com");
            inputEmail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputEmailFocusLost

    private void inputPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusGained
        // TODO add your handling code here:
        if(inputPassword.getText().equals("Ingrese Contraseña")){
            inputPassword.setText("");
            inputPassword.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_inputPasswordFocusGained

    private void inputPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPasswordFocusLost
        // TODO add your handling code here:
         if(inputPassword.getText().equals("")){
            inputPassword.setText("Ingrese Contraseña");
            inputPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_inputPasswordFocusLost

    private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed

        if (chkPassword.isSelected()) {
        inputPassword.setEchoChar((char) 0); // Mostrar contraseña
        } else {
        inputPassword.setEchoChar('*'); // Ocultar contraseña
    }
                
    }//GEN-LAST:event_chkPasswordActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
      
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void chkPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkPasswordMouseClicked
       
    }//GEN-LAST:event_chkPasswordMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel Form;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignup;
    private javax.swing.JCheckBox chkPassword;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelSubtitle;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables




}
