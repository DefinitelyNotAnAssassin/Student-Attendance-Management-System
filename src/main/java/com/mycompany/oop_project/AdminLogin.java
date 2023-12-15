package com.mycompany.oop_project;
import java.awt.Color;

public class AdminLogin extends javax.swing.JFrame {

    
    public AdminLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonSignin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 44, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Sign In");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 435, 52));

        ButtonSignin.setBackground(new java.awt.Color(189, 0, 0));
        ButtonSignin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        ButtonSignin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSignin.setText("SIGN IN");
        ButtonSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSigninActionPerformed(evt);
            }
        });
        bg.add(ButtonSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 358, 63));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 360, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Username");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 360, -1));

        jLabel5.setText("________________________________________________________");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        jLabel6.setText("________________________________________________________");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User_5.png"))); // NOI18N
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        txtUser.setFont(txtUser.getFont().deriveFont(txtUser.getFont().getSize()+2f));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        bg.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 280, 32));

        txtPass.setFont(txtPass.getFont().deriveFont(txtPass.getFont().getSize()+2f));
        txtPass.setBorder(null);
        bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 280, 30));

        Disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hide_2.png"))); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        bg.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Eye_2.png"))); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        bg.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Back to Signin");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen() - jLabel1.getWidth() / 2;
        int y = evt.getYOnScreen() - jLabel1.getHeight() / 2;
        jLabel1.setLocation(x, y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseExited

    private void ButtonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSigninActionPerformed

        
        if (txtUser.getText().equals("admin") && txtPass.getText().equals("admin123")){
            AdminForm af = new AdminForm();
            af.setVisible(true);
            dispose();
        }
        else{
            
        }
        
        
        
        
        
    }//GEN-LAST:event_ButtonSigninActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void DisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableMouseClicked

        txtPass.setEchoChar((char)0);
        Disable.setVisible(false);
        Disable.setEnabled(false);
        Show.setEnabled(true);
        Show.setEnabled(true);
    }//GEN-LAST:event_DisableMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked

        txtPass.setEchoChar((char)8226);
        Disable.setVisible(true);
        Disable.setEnabled(true);
        Show.setEnabled(false);
        Show.setEnabled(false);

    }//GEN-LAST:event_ShowMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LoginForm login = new LoginForm();
        login.show();
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSignin;
    private javax.swing.JLabel Disable;
    private javax.swing.JLabel Show;
    private javax.swing.JLayeredPane bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
