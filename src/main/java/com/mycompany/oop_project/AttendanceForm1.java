package com.mycompany.oop_project;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
public class AttendanceForm1 extends javax.swing.JFrame {
    User current_user;
   
    public AttendanceForm1(User current_user) {
        initComponents();
        this.current_user = current_user;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCover1 = new com.raven.component.PanelCover();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelCover2 = new com.raven.component.PanelCover();
        jLabel7 = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSignout = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnAttendance = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        AFpannel = new javax.swing.JPanel();
        CenteredPannel = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ButtonAttendance = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Attendance = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        panelCover1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        panelCover1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));

        btn1.setBackground(new java.awt.Color(102, 0, 0));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Management_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ATTENDANCE");

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addGroup(btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(btn1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        panelCover1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 120, 60));

        btn5.setBackground(new java.awt.Color(102, 0, 0));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logout.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SIGN OUT");

        javax.swing.GroupLayout btn5Layout = new javax.swing.GroupLayout(btn5);
        btn5.setLayout(btn5Layout);
        btn5Layout.setHorizontalGroup(
            btn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn5Layout.createSequentialGroup()
                .addGroup(btn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4))
                    .addGroup(btn5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btn5Layout.setVerticalGroup(
            btn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCover1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 120, 70));

        btn2.setBackground(new java.awt.Color(102, 0, 0));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Books.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("COURSE");

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn2Layout.createSequentialGroup()
                .addGroup(btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5))
                    .addGroup(btn2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCover1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 120, 60));

        btn3.setBackground(new java.awt.Color(102, 0, 0));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Registration.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EDIT ACCOUNT");

        javax.swing.GroupLayout btn3Layout = new javax.swing.GroupLayout(btn3);
        btn3.setLayout(btn3Layout);
        btn3Layout.setHorizontalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        btn3Layout.setVerticalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCover1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 120, 60));

        btn4.setBackground(new java.awt.Color(102, 0, 0));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit File.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EDIT COURSE");

        javax.swing.GroupLayout btn4Layout = new javax.swing.GroupLayout(btn4);
        btn4.setLayout(btn4Layout);
        btn4Layout.setHorizontalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn4Layout.createSequentialGroup()
                .addGroup(btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13))
                    .addGroup(btn4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btn4Layout.setVerticalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        panelCover1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo_white.png"))); // NOI18N
        panelCover1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 90));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCover2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STUDENT");
        panelCover2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        btnHome.setBackground(new java.awt.Color(102, 0, 0));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Home.png"))); // NOI18N
        btnHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 6, -1, 24));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HOME");
        btnHome.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        panelCover2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 120, 60));

        btnSignout.setBackground(new java.awt.Color(102, 0, 0));
        btnSignout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignoutMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logout.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("SIGN OUT");

        javax.swing.GroupLayout btnSignoutLayout = new javax.swing.GroupLayout(btnSignout);
        btnSignout.setLayout(btnSignoutLayout);
        btnSignoutLayout.setHorizontalGroup(
            btnSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignoutLayout.createSequentialGroup()
                .addGroup(btnSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnSignoutLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel16))
                    .addGroup(btnSignoutLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel17)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnSignoutLayout.setVerticalGroup(
            btnSignoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSignoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCover2.add(btnSignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 120, 70));

        btnAttendance.setBackground(new java.awt.Color(102, 0, 0));
        btnAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttendanceMouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Management_1.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ATTENDANCE");

        javax.swing.GroupLayout btnAttendanceLayout = new javax.swing.GroupLayout(btnAttendance);
        btnAttendance.setLayout(btnAttendanceLayout);
        btnAttendanceLayout.setHorizontalGroup(
            btnAttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAttendanceLayout.createSequentialGroup()
                .addGroup(btnAttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAttendanceLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel18))
                    .addGroup(btnAttendanceLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        btnAttendanceLayout.setVerticalGroup(
            btnAttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAttendanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCover2.add(btnAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 120, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo_white.png"))); // NOI18N
        panelCover2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 90));

        getContentPane().add(panelCover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 700));

        AFpannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CenteredPannel.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 249, 245));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonAttendance.setBackground(new java.awt.Color(189, 0, 0));
        ButtonAttendance.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ButtonAttendance.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAttendance.setText("PRESENT");
        ButtonAttendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAttendanceActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 50));

        jLabel21.setText("___________________________________");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, -1));

        txtCourseID.setFont(txtCourseID.getFont().deriveFont(txtCourseID.getFont().getSize()+2f));
        txtCourseID.setBorder(null);
        txtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 277, 32));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Enter Course code");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 140, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel23.setText("Attendance Management System");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 34, -1, -1));

        Home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 380, 350));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("X");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel26MouseDragged(evt);
            }
        });
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        Home.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Weelcomeeee.png"))); // NOI18N
        Home.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, -60, 1500, 280));

        CenteredPannel.add(Home, "card2");

        p1.setBackground(new java.awt.Color(255, 249, 245));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel20.setText("Student Attendance");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Attendance ID", "Student ID", "Course ID", "Attendance Date", "Present"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AttendanceLayout = new javax.swing.GroupLayout(Attendance);
        Attendance.setLayout(AttendanceLayout);
        AttendanceLayout.setHorizontalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AttendanceLayout.setVerticalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CenteredPannel.add(Attendance, "card3");

        AFpannel.add(CenteredPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 700));

        getContentPane().add(AFpannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 830, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onClick (JPanel panel){     
        panel.setBackground (new Color (204,0,0));
    }
    
    private void onLeaveClick (JPanel panel){
        panel.setBackground (new Color (102,0,0));
    }   
    
    
    
    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
       
    }//GEN-LAST:event_btn1MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:

      

    }//GEN-LAST:event_btn5MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked

    }//GEN-LAST:event_btn4MouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        onClick(btnHome);
        onLeaveClick(btnAttendance);
        

        Home.setVisible(true);
        Attendance.setVisible(false);
       
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignoutMouseClicked
        // TODO add your handling code here:

        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSignoutMouseClicked

    private void btnAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttendanceMouseClicked
        // TODO add your handling code here:
        onClick(btnAttendance);
        onLeaveClick(btnHome);
        
         
      

       
        Database db = new Database();
        db.connect();
        String sql = "SELECT s.student_number, c.course_name, a.attendance_id, a.is_present, a.attendance_date  FROM Attendance a INNER JOIN Students s ON a.student_id = s.student_number INNER JOIN Courses c ON a.course_id = c.course_id  WHERE s.student_number = " + current_user.student_number + " ORDER BY attendance_id DESC";
        ResultSet set = db.executeSearch(sql);
        //Trigger
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        try {
            while (set.next()){
               Object[] row = {set.getInt("a.attendance_id"), set.getString("student_number"), set.getString("course_name"), set.getString("attendance_date"), set.getInt("is_present")};
                 tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  

        Home.setVisible(false);
        Attendance.setVisible(true);
       
    }//GEN-LAST:event_btnAttendanceMouseClicked

    private void ButtonAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAttendanceActionPerformed
        String course_code = txtCourseID.getText();
         Database db = new Database();
         db.connect();
         Course course = db.getCourse(course_code);
         txtCourseID.setText("");
            //db.isAccountExisting(current_user.student_number);

         db.studentAttendance(current_user.student_number, course.course_id);
       
    }//GEN-LAST:event_ButtonAttendanceActionPerformed

    private void txtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseIDActionPerformed

    }//GEN-LAST:event_txtCourseIDActionPerformed

    private void jLabel26MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseDragged
        int x = evt.getXOnScreen() - jLabel1.getWidth() / 2;
        int y = evt.getYOnScreen() - jLabel1.getHeight() / 2;
        jLabel1.setLocation(x, y);
    }//GEN-LAST:event_jLabel26MouseDragged

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        jLabel1.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel26MouseExited

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
            java.util.logging.Logger.getLogger(AttendanceForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceForm1(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AFpannel;
    private javax.swing.JPanel Attendance;
    private javax.swing.JButton ButtonAttendance;
    private javax.swing.JPanel CenteredPannel;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn5;
    private javax.swing.JPanel btnAttendance;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnSignout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel p1;
    private com.raven.component.PanelCover panelCover1;
    private com.raven.component.PanelCover panelCover2;
    private javax.swing.JTextField txtCourseID;
    // End of variables declaration//GEN-END:variables
}
