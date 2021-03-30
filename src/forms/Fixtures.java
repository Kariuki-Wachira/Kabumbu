package forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kariuki
 */
public class Fixtures extends javax.swing.JFrame {

    /**
     * Creates new form Referees
     */
    public Fixtures() {
        initComponents();
        hometeam();
        awayteam();
        referee();
        refschoollabel.setVisible(false);
        fetch();
        homeid.setVisible(false);
        awayid.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        errorfixtureslabel = new javax.swing.JLabel();
        gameidtextfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        hometeamcb = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nameofrefereecb = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        awayteamcb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        refschoollabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        homeid = new javax.swing.JLabel();
        awayid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("VS");

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setText("UPDATE TABLE");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel4.setText("Teams:");

        errorfixtureslabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        errorfixtureslabel.setForeground(new java.awt.Color(255, 0, 0));

        gameidtextfield.setEditable(false);

        jButton2.setText("FIND");
        jButton2.setToolTipText("Click to search for referee");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setText("ADD");
        jButton1.setToolTipText("Click to add referee ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hometeamcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Home Team" }));
        hometeamcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hometeamcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hometeamcbActionPerformed(evt);
            }
        });

        jButton5.setText("RESET");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        jLabel2.setText("FIXTURES AND REFEREES");

        jTable1.setBackground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setText("BACK");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel6.setText("Game ID:");

        nameofrefereecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pick Referee" }));
        nameofrefereecb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameofrefereecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameofrefereecbActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("DELETE");
        jButton3.setToolTipText("Click to delete referee");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        awayteamcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Away Team" }));
        awayteamcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        awayteamcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awayteamcbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel3.setText("Name of the referee:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forms/Capture.PNG"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel8.setText("Search ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refschoollabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(homeid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(awayid)
                        .addGap(321, 321, 321))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameofrefereecb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hometeamcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(awayteamcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gameidtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 59, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorfixtureslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(refschoollabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeid)
                            .addComponent(awayid))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hometeamcb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(awayteamcb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(gameidtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameofrefereecb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errorfixtureslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void hometeam() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            Statement stat = conn.createStatement();
            String selectQuery = "select school_name from schools";
            ResultSet rs = stat.executeQuery(selectQuery);
            while (rs.next()) {
                hometeamcb.addItem(rs.getString("school_name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void awayteam() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            Statement stat = conn.createStatement();
            String selectQuery = "select school_name from schools";
            ResultSet rs = stat.executeQuery(selectQuery);
            while (rs.next()) {
                awayteamcb.addItem(rs.getString("school_name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void referee() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            Statement stat = conn.createStatement();
            String selectQuery = "select teacher_name from schools";
            ResultSet rs = stat.executeQuery(selectQuery);
            while (rs.next()) {
                nameofrefereecb.addItem(rs.getString("teacher_name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void hometeamcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hometeamcbActionPerformed
        if (hometeamcb.getSelectedItem().equals(awayteamcb.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "You Have to select two different teams from the list");
            hometeamcb.setSelectedItem("Select Home Team");
        }
        if (hometeamcb.getSelectedItem().equals(refschoollabel.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Referee cannot be from any of the schools above");
            nameofrefereecb.setSelectedItem("Pick Referee");
            refschoollabel.setText("");
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            String sql = "select school_id from schools where school_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, (hometeamcb.getSelectedItem().toString()));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                homeid.setText(rs.getString("school_id"));
            }
            if (hometeamcb.getSelectedItem().equals("Select Home Team")) {
                homeid.setText("");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, evt);
        }
        gameidtextfield.setText(homeid.getText() + awayid.getText());

    }//GEN-LAST:event_hometeamcbActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Switchboard switchboard = new Switchboard();
        switchboard.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (hometeamcb.getSelectedItem().equals("Select Home Team")) {
            errorfixtureslabel.setText("Select the home team");
        } else if (awayteamcb.getSelectedItem().equals("Select Away Team")) {
            errorfixtureslabel.setText("Select the away team");
        } else if (nameofrefereecb.getSelectedItem().equals("Pick Referee")) {
            errorfixtureslabel.setText("Select a referee for the game " + gameidtextfield.getText());
        } else {
            errorfixtureslabel.setText("");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
                String sql2 = "insert into fixtures values(?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql2);
                pstmt.setString(1, gameidtextfield.getText());
                pstmt.setString(2, hometeamcb.getSelectedItem().toString());
                pstmt.setString(3, awayteamcb.getSelectedItem().toString());
                pstmt.setString(4, nameofrefereecb.getSelectedItem().toString());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "You have successfully added " + gameidtextfield.getText() + " to the upcoming fixtures");
                gameidtextfield.setText("");
                hometeamcb.setSelectedItem("Select Home Team");
                awayteamcb.setSelectedItem("Select Away Team");
                nameofrefereecb.setSelectedItem("Pick Referee");
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "The fixture exixts or you are capturing wrong data");
            }
            fetch();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (search.getText().isEmpty()) {
            errorfixtureslabel.setText("Input the game id you are here to look for");
        } else {
            errorfixtureslabel.setText("");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
                String sql = "select * from fixtures where game_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, (search.getText()));
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    hometeamcb.setSelectedItem(rs.getString("home_team"));
                    awayteamcb.setSelectedItem(rs.getString("away_team"));
                    nameofrefereecb.setSelectedItem(rs.getString("referee_name"));
                } else {
                    JOptionPane.showMessageDialog(null, "Record not found");
                    search.setText("");
                }
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, evt);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void fetch() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            String q = "select game_id as 'Game ID', home_team as 'Home Team', away_team as 'Away Team', referee_name as 'Referee Name' from fixtures";
            PreparedStatement pstm = conn.prepareStatement(q);
            ResultSet rs = null;
            rs = pstm.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (search.getText().isEmpty()) {
            errorfixtureslabel.setText("Input the game id you want to delete");
        } else {
            errorfixtureslabel.setText("");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
                String sql = "delete from fixtures where game_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, (search.getText()));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "You have succesfully removed " + search.getText() + " from fixtures");
                search.setText("");
                hometeamcb.setSelectedItem("Select Home Team");
                awayteamcb.setSelectedItem("Select Away Team");
                nameofrefereecb.setSelectedItem("Pick Referee");
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, evt);
            }
            fetch();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        gameidtextfield.setText("");
        hometeamcb.setSelectedItem("Select Home Team");
        awayteamcb.setSelectedItem("Select Away Team");
        nameofrefereecb.setSelectedItem("Pick Referee");
        refschoollabel.setText("");
        search.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void awayteamcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awayteamcbActionPerformed
        if (awayteamcb.getSelectedItem().equals(hometeamcb.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "You Have to select two different teams from the list");
            awayteamcb.setSelectedItem("Select Away Team");
        }
        if (hometeamcb.getSelectedItem().equals(refschoollabel.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Referee cannot be from any of the schools above");
            nameofrefereecb.setSelectedItem("Pick Referee");
            refschoollabel.setText("");
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            String sql = "select school_id from schools where school_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, (awayteamcb.getSelectedItem().toString()));
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                awayid.setText(rs.getString("school_id"));
            }
            if (awayteamcb.getSelectedItem().equals("Select Away Team")) {
                awayid.setText("");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, evt);
        }

        gameidtextfield.setText(homeid.getText() + awayid.getText());

    }//GEN-LAST:event_awayteamcbActionPerformed

    private void nameofrefereecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameofrefereecbActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kabumbu?autoReconnect=true&useSSL=false", "root", "7819");
            String sql = "select * from schools where teacher_name = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, (nameofrefereecb.getSelectedItem().toString()));
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                refschoollabel.setText(rs.getString("school_name"));
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, evt);
        }
        if (hometeamcb.getSelectedItem().equals(refschoollabel.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Referee cannot be from any of the schools above");
            nameofrefereecb.setSelectedItem("Pick Referee");
            refschoollabel.setText("");
        }
        if (awayteamcb.getSelectedItem().equals(refschoollabel.getText().toString())) {
            JOptionPane.showMessageDialog(null, "Referee cannot be from any of the schools above");
            nameofrefereecb.setSelectedItem("Pick Referee");
            refschoollabel.setText("");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_nameofrefereecbActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        fetch();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Fixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fixtures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fixtures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel awayid;
    private javax.swing.JComboBox<String> awayteamcb;
    private javax.swing.JLabel errorfixtureslabel;
    private javax.swing.JTextField gameidtextfield;
    private javax.swing.JLabel homeid;
    private javax.swing.JComboBox<String> hometeamcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> nameofrefereecb;
    private javax.swing.JLabel refschoollabel;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}