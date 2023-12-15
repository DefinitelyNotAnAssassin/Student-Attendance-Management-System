package com.mycompany.oop_project;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class AdminForm extends javax.swing.JFrame {

   
    public AdminForm() {
        initComponents();
        Database db = new Database();
        db.connect();
        String sql  = "SELECT s.student_number, c.course_name, a.attendance_id, a.is_present, a.attendance_date  FROM Attendance a INNER JOIN Students s ON a.student_id = s.student_number INNER JOIN Courses c ON a.course_id = c.course_id ORDER BY attendance_id DESC";
        ResultSet set = db.executeSearch(sql);
        
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
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
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
        HeaderPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CenterePanel = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        p2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        p3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        studentnumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        birthdate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        email1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        p5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        courseid = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        coursename = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        coursecode = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        AdminPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        AdminPanel.add(panelCover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 700));

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        HeaderPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 30, 30));

        AdminPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1040, 30));

        CenterePanel.setLayout(new java.awt.CardLayout());

        p1.setBackground(new java.awt.Color(255, 249, 245));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel9.setText("Student Attendance");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        CenterePanel.add(p1, "card2");

        p2.setBackground(new java.awt.Color(255, 249, 245));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel15.setText("Student Course");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Course Code"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        CenterePanel.add(p2, "card3");

        p3.setBackground(new java.awt.Color(255, 249, 245));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel16.setText("Student Accounts");
        p3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 448, 57));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Student Number", "First Name", "Last Name", "Birthdate", "Email"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        p3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 129, 750, 390));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Student Number");
        p3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 125, 360, -1));

        studentnumber.setBackground(new java.awt.Color(255, 249, 245));
        studentnumber.setFont(studentnumber.getFont().deriveFont(studentnumber.getFont().getSize()+2f));
        studentnumber.setBorder(null);
        studentnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnumberActionPerformed(evt);
            }
        });
        p3.add(studentnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 155, 203, 32));

        jLabel18.setText("____________________________");
        p3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 175, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("First Name");
        p3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 205, 360, -1));

        firstname.setBackground(new java.awt.Color(255, 249, 245));
        firstname.setFont(firstname.getFont().deriveFont(firstname.getFont().getSize()+2f));
        firstname.setBorder(null);
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        p3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 235, 205, 32));

        jLabel20.setText("____________________________");
        p3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 255, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Last Name");
        p3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 285, 360, -1));

        lastname.setBackground(new java.awt.Color(255, 249, 245));
        lastname.setFont(lastname.getFont().deriveFont(lastname.getFont().getSize()+2f));
        lastname.setBorder(null);
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        p3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 315, 216, 32));

        jLabel22.setText("____________________________");
        p3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 335, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Birthdate");
        p3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 365, 360, -1));

        birthdate.setBackground(new java.awt.Color(255, 249, 245));
        birthdate.setFont(birthdate.getFont().deriveFont(birthdate.getFont().getSize()+2f));
        birthdate.setBorder(null);
        birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateActionPerformed(evt);
            }
        });
        p3.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 395, 209, 32));

        jLabel24.setText("____________________________");
        p3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 415, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Username");
        p3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 360, -1));

        username.setBackground(new java.awt.Color(255, 249, 245));
        username.setFont(username.getFont().deriveFont(username.getFont().getSize()+2f));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        p3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 197, 32));

        jLabel26.setText("____________________________");
        p3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        Button1.setBackground(new java.awt.Color(189, 0, 0));
        Button1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("DELETE");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        p3.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 110, 40));

        Button2.setBackground(new java.awt.Color(189, 0, 0));
        Button2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("ADD");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        p3.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 110, 40));

        Button3.setBackground(new java.awt.Color(189, 0, 0));
        Button3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("SEARCH");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        p3.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 110, 40));

        Button4.setBackground(new java.awt.Color(189, 0, 0));
        Button4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("EDIT");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        p3.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 110, 40));

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Email");
        p3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 446, 360, -1));

        email1.setBackground(new java.awt.Color(255, 249, 245));
        email1.setFont(email1.getFont().deriveFont(email1.getFont().getSize()+2f));
        email1.setBorder(null);
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        p3.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 476, 197, 32));

        jLabel35.setText("____________________________");
        p3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 496, -1, -1));

        CenterePanel.add(p3, "card4");

        p4.setBackground(new java.awt.Color(255, 249, 245));

        p5.setBackground(new java.awt.Color(255, 249, 245));
        p5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel27.setText("Student Course");
        p5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 350, 57));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Course Code"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        p5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 129, 750, 390));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Course ID");
        p5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 360, -1));

        courseid.setBackground(new java.awt.Color(255, 249, 245));
        courseid.setFont(courseid.getFont().deriveFont(courseid.getFont().getSize()+2f));
        courseid.setBorder(null);
        courseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseidActionPerformed(evt);
            }
        });
        p5.add(courseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 203, 32));

        jLabel29.setText("____________________________");
        p5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Course Name");
        p5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 360, -1));

        coursename.setBackground(new java.awt.Color(255, 249, 245));
        coursename.setFont(coursename.getFont().deriveFont(coursename.getFont().getSize()+2f));
        coursename.setBorder(null);
        coursename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursenameActionPerformed(evt);
            }
        });
        p5.add(coursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 205, 32));

        jLabel31.setText("____________________________");
        p5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Course Code");
        p5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 360, -1));

        coursecode.setBackground(new java.awt.Color(255, 249, 245));
        coursecode.setFont(coursecode.getFont().deriveFont(coursecode.getFont().getSize()+2f));
        coursecode.setBorder(null);
        coursecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursecodeActionPerformed(evt);
            }
        });
        p5.add(coursecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 216, 32));

        jLabel33.setText("____________________________");
        p5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        Button5.setBackground(new java.awt.Color(189, 0, 0));
        Button5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("DELETE");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        p5.add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 110, 40));

        Button6.setBackground(new java.awt.Color(189, 0, 0));
        Button6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("ADD");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        p5.add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 110, 40));

        Button7.setBackground(new java.awt.Color(189, 0, 0));
        Button7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("SEARCH");
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        p5.add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 110, 40));

        Button8.setBackground(new java.awt.Color(189, 0, 0));
        Button8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("EDIT");
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        p5.add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 110, 40));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        CenterePanel.add(p4, "card5");

        AdminPanel.add(CenterePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 1040, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1153, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onClick (JPanel panel){     
        panel.setBackground (new Color (204,0,0));
    }
    
    private void onLeaveClick (JPanel panel){
        panel.setBackground (new Color (102,0,0));
    }   
    
    
    
    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        int x = evt.getXOnScreen() - jLabel1.getWidth() / 2;
        int y = evt.getYOnScreen() - jLabel1.getHeight() / 2;
        jLabel7.setLocation(x, y);
         
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.RED);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel7MouseExited

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        onClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        Database db = new Database();
        db.connect();
        String sql = "SELECT s.student_number, c.course_name, a.attendance_id, a.is_present, a.attendance_date  FROM Attendance a INNER JOIN Students s ON a.student_id = s.student_number INNER JOIN Courses c ON a.course_id = c.course_id ORDER BY attendance_id DESC";
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
        
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        Database db = new Database();
        db.connect();
        

         String sql  = "SELECT * FROM Courses";
        ResultSet set = db.executeSearch(sql);
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        try {
            while (set.next()){
                Object[] row = {set.getInt("course_id"), set.getString("course_name"), set.getString("course_code")};
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        onLeaveClick(btn1);
        onClick(btn2);
        onLeaveClick(btn3);
        onLeaveClick(btn4);
        
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        p4.setVisible(false);
        
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onClick(btn3);
        onLeaveClick(btn4);
        
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
        p4.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        onLeaveClick(btn1);
        onLeaveClick(btn2);
        onLeaveClick(btn3);
        onClick(btn4);
        
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn5MouseClicked

    private void studentnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnumberActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        db.connect();
        db.executeStatement("DELETE FROM Students WHERE student_number = " + studentnumber.getText());
      
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
         Database db = new Database();
        db.connect();
        
        db.createAccount(username.getText(), "sdca2023", studentnumber.getText(), firstname.getText(), lastname.getText(), birthdate.getText(), email1.getText());
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        Database db = new Database();
        db.connect();
            
         String sql  = "UPDATE Students SET first_name = '{first_name}', last_name = '{last_name}', email = '{email}', birthdate = '{birthdate}' WHERE student_number = " + studentnumber.getText();
         String translated_sql = db.replaceWildcards(sql, "{first_name}", firstname.getText(),"{last_name}", lastname.getText(),"{email}", email1.getText(),"{birthdate}", birthdate.getText());
         db.executeStatement(translated_sql);
         
         
        
        
        
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        Database db = new Database();
        db.connect();
        
        
        db.executeStatement("UPDATE Courses SET course_name = \'" + coursename.getText() +"\' WHERE course_code = '" + coursecode.getText() + "\'");
        
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        Database db = new Database();
        db.connect();
        String sql;
        if(coursecode.getText().equals("")){
            sql = "SELECT * FROM Courses";
        }
        else{
           sql  = "SELECT * FROM Courses WHERE course_code = \'" + coursecode.getText() + "\'";
        }
         
         System.out.println(sql);
        ResultSet set = db.executeSearch(sql);
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable4.getModel();
        tableModel.setRowCount(0);
        try {
            while (set.next()){
                Object[] row = {set.getInt("course_id"), set.getString("course_name"), set.getString("course_code")};
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
       Database db = new Database();
       db.connect();
       
       db.createCourse(coursename.getText(), coursecode.getText());
       
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        Database db = new Database();
        db.connect();
        
        db.executeStatement("DELETE FROM Courses WHERE course_code = \'" + coursecode.getText() + "\'");
    }//GEN-LAST:event_Button5ActionPerformed

    private void coursecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursecodeActionPerformed

    private void coursenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursenameActionPerformed

    private void courseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseidActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
       Database db = new Database();
        db.connect();
        String sql;
        if (studentnumber.getText().equals("")){
             sql = "SELECT * FROM Students";
        }
        else{
              sql  = "SELECT * FROM Students WHERE student_number = " + studentnumber.getText();
        }

       
         System.out.println(sql);
        ResultSet set = db.executeSearch(sql);
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable3.getModel();
        tableModel.setRowCount(0);
        try {
            while (set.next()){
                Object[] row = {set.getInt("student_number"), set.getString("first_name"), set.getString("last_name"),set.getString("birthdate"),set.getString("email")};
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JPanel CenterePanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTextField birthdate;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn5;
    private javax.swing.JTextField coursecode;
    private javax.swing.JTextField courseid;
    private javax.swing.JTextField coursename;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField firstname;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField lastname;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private com.raven.component.PanelCover panelCover1;
    private javax.swing.JTextField studentnumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
