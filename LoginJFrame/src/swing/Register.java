/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author chunyen
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();

        //性別只能點一個
        ButtonGroup GD = new ButtonGroup();
        GD.add(jGender_Male);
        GD.add(jGender_Female);
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
        jLabel_Title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jButton_GO = new javax.swing.JButton();
        jButton_Return = new javax.swing.JButton();
        rePassword = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jRepass = new javax.swing.JPasswordField();
        jGender = new javax.swing.JLabel();
        jGender_Male = new javax.swing.JRadioButton();
        jGender_Female = new javax.swing.JRadioButton();
        jUsername_fill = new javax.swing.JLabel();
        jPassword_fill = new javax.swing.JLabel();
        jRepassword_fill = new javax.swing.JLabel();
        jGender_fill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_Title.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Register Form");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        Username.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Username.setText("使用者帳號：");

        Password.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Password.setText("密碼：");

        jButton_GO.setText("送出");
        jButton_GO.setMaximumSize(new java.awt.Dimension(40, 30));
        jButton_GO.setMinimumSize(new java.awt.Dimension(60, 30));
        jButton_GO.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton_GO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GOMouseClicked(evt);
            }
        });

        jButton_Return.setText("返回");
        jButton_Return.setMaximumSize(new java.awt.Dimension(40, 30));
        jButton_Return.setMinimumSize(new java.awt.Dimension(60, 30));
        jButton_Return.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton_Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ReturnMouseClicked(evt);
            }
        });

        rePassword.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        rePassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rePassword.setText("確認密碼：");

        jGender.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jGender.setText("性別：");

        jGender_Male.setBackground(new java.awt.Color(204, 204, 204));
        jGender_Male.setText("男");

        jGender_Female.setBackground(new java.awt.Color(204, 204, 204));
        jGender_Female.setText("女");

        jUsername_fill.setForeground(new java.awt.Color(255, 0, 0));
        jUsername_fill.setText("* 必填");

        jPassword_fill.setForeground(new java.awt.Color(255, 0, 0));
        jPassword_fill.setText("* 必填");

        jRepassword_fill.setForeground(new java.awt.Color(255, 0, 0));
        jRepassword_fill.setText("* 必填");

        jGender_fill.setForeground(new java.awt.Color(255, 0, 0));
        jGender_fill.setText("* 必填");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_GO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jButton_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jUsername))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPass))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jGender_Male)
                                                .addGap(18, 18, 18)
                                                .addComponent(jGender_Female)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jRepass, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jUsername_fill)
                                    .addComponent(jPassword_fill)
                                    .addComponent(jRepassword_fill)
                                    .addComponent(jGender_fill))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername_fill))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword_fill))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rePassword)
                    .addComponent(jRepass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRepassword_fill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGender)
                    .addComponent(jGender_Male)
                    .addComponent(jGender_Female)
                    .addComponent(jGender_fill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_GO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ReturnMouseClicked
        // TODO add your handling code here:
        Login a = new Login();
        a.setVisible(true);
        a.pack();
        a.setLocationRelativeTo(null);
        a.setTitle("完成");
        a.setResizable(false); //視窗無法開到最大，不然版面會亂掉

        this.dispose();
    }//GEN-LAST:event_jButton_ReturnMouseClicked

    private void jButton_GOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GOMouseClicked
        // TODO add your handling code here:
        String Username = jUsername.getText();
        String Password = String.valueOf(jPass.getPassword());
        String rePassword = String.valueOf(jRepass.getPassword());
        String gender = "Male";
        jUsername_fill.setText("*必填");
        jPassword_fill.setText("*必填");
        jRepassword_fill.setText("*必填");
        jGender_fill.setText("*必填");

        if (jGender_Male.isSelected()) {
            gender = "Male";
        }

        if (RegisterDBUG()) {
            if (!check(Username)) {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String addquery = "INSERT INTO `tuser`" + "(`Username`," + "`Password`," + "`Gender`)" + "VALUES" + "(?,?,?);";
                try {
                    ps = DBConnection.getConnection().prepareStatement(addquery);

                    ps.setString(1, Username);
                    ps.setString(2, Password);
                    ps.setString(3, gender);

                    if (ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "帳號完成註冊。");
                        ps.close();
                    } else {
                        JOptionPane.showMessageDialog(null, "帳號註冊失敗。");
                        ps.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton_GOMouseClicked

    public boolean RegisterDBUG() {
        String user = jUsername.getText();
        String pass = String.valueOf(jPass.getPassword());
        String repass = String.valueOf(jRepass.getPassword());
        String gender = jGender.getText();

        //使用者有無填寫
        if (user.trim().equals("") || pass.trim().equals("")
                || repass.trim().equals("") || gender.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "有資料尚未填寫唷！", "Error", 2);
            return false;
        } else if (!pass.equals(repass)) {
            jRepassword_fill.setText("與密碼不相同！");
            JOptionPane.showMessageDialog(null, "密碼與確認密碼不相同。", "Error", 2);
            return false;
        } else {
            return true;
        }
    }

    public boolean check(String username) {
        PreparedStatement st;
        ResultSet rs;
        boolean reuser = false;
        String query = "SELECT * FROM `tuser` WHERE `Username` = ?";
        try {
            st = DBConnection.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            if (rs.next()) {
                reuser = true;
                jUsername_fill.setText("帳號已經被使用過！");
                JOptionPane.showMessageDialog(null, "帳號已經重複使用囉！");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reuser;
    }

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton jButton_GO;
    private javax.swing.JButton jButton_Return;
    private javax.swing.JLabel jGender;
    private javax.swing.JRadioButton jGender_Female;
    private javax.swing.JRadioButton jGender_Male;
    private javax.swing.JLabel jGender_fill;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JLabel jPassword_fill;
    private javax.swing.JPasswordField jRepass;
    private javax.swing.JLabel jRepassword_fill;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel jUsername_fill;
    private javax.swing.JLabel rePassword;
    // End of variables declaration//GEN-END:variables
}
