package com.mycompany.attendancemanagementsystem;
import java.awt.Color;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

  
    public LoginForm() {
        initComponents();
       // txtUser.setBackground(new java.awt.Color(0,0,0,1));
       // txtPass.setBackground(new java.awt.Color(0,0,0,1));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        bg = new javax.swing.JLayeredPane();
        panelCover1 = new com.raven.component.PanelCover();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonSignin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo_white.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SYSTEM");

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 246, 252));
        jLabel12.setText("ATTENDANCE MANAGEMENT");

        javax.swing.GroupLayout panelCover1Layout = new javax.swing.GroupLayout(panelCover1);
        panelCover1.setLayout(panelCover1Layout);
        panelCover1Layout.setHorizontalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCover1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(151, 151, 151)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCover1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(35, 35, 35))
        );
        panelCover1Layout.setVerticalGroup(
            panelCover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCover1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel9)
                .addGap(113, 113, 113)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        bg.add(panelCover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

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
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 44, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(189, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 435, 52));

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
        bg.add(ButtonSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 358, 63));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 339, 360, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Username");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 360, -1));

        jLabel5.setText("________________________________________________________");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        jLabel6.setText("________________________________________________________");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User_5.png"))); // NOI18N
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Don't have an account?");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 149, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Sign Up");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 71, -1));

        txtUser.setFont(txtUser.getFont().deriveFont(txtUser.getFont().getSize()+2f));
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        bg.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 280, 32));

        txtPass.setFont(txtPass.getFont().deriveFont(txtPass.getFont().getSize()+2f));
        txtPass.setBorder(null);
        bg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 280, 30));

        Disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hide_2.png"))); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        bg.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Eye_2.png"))); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        bg.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(994, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSigninActionPerformed
        
         Database db = new Database();

         db.connect("StudentAttendance.db");
        
         String username = txtUser.getText();
         String password = txtPass.getText();
               
         db.authenticateAccount(username, password);
       
        
        
    }//GEN-LAST:event_ButtonSigninActionPerformed

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen() - jLabel1.getWidth() / 2;
        int y = evt.getYOnScreen() - jLabel1.getHeight() / 2;
        jLabel1.setLocation(x, y);
    }//GEN-LAST:event_jLabel1MouseDragged

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        for (double i = 0.0; i <=1.0; i = i+0.1){
        
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
            Thread.sleep(50);
            
               } catch(Exception e ) {
                    
               }       
        }
         
        
    }//GEN-LAST:event_formWindowOpened

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
    CreateAccount create = new CreateAccount();
    create.show();
    dispose();
    
    }//GEN-LAST:event_jLabel10MouseClicked

   
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.raven.component.PanelCover panelCover1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

   

   
}
