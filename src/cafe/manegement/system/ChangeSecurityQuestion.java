/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.manegement.system;

import dao.UserDao;
import model.User;

/**
 *
 * @author jagta
 */
public class ChangeSecurityQuestion extends javax.swing.JFrame {
    public String userEmail;

    /**
     * Creates new form ChangeSecurityQuestion
     */
    public ChangeSecurityQuestion() {
        initComponents();
    }
    
    public ChangeSecurityQuestion(String email) {
        initComponents();
        userEmail = email;
        txtOldSecurityQuestion.setEditable(false);
        btnUpdate.setEnabled(false);
    }
    
    public void validateField(){
        String password = txtPassword.getText();
        String securityQuestion = txtNewSecurityQuestion.getText();
        String answer = txtNewAnswer.getText();
        if(!password.equals("") && !securityQuestion.equals("") && !answer.equals("")){
            btnUpdate.setEnabled(true);
        }
        else
            btnUpdate.setEnabled(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChangeSecurityQuestion = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblOldSecurityQuestion = new javax.swing.JLabel();
        txtOldSecurityQuestion = new javax.swing.JTextField();
        lblNewSecurityQuestion = new javax.swing.JLabel();
        txtNewSecurityQuestion = new javax.swing.JTextField();
        lblNewAnswer = new javax.swing.JLabel();
        txtNewAnswer = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 136));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblChangeSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChangeSecurityQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblChangeSecurityQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        lblChangeSecurityQuestion.setText("Change Security Question");
        getContentPane().add(lblChangeSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 23, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        lblOldSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOldSecurityQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblOldSecurityQuestion.setText("Old Security Question :-");
        getContentPane().add(lblOldSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 107, -1, -1));

        txtOldSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtOldSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 104, 347, -1));

        lblNewSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewSecurityQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblNewSecurityQuestion.setText("New Security Question :-");
        getContentPane().add(lblNewSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 145, 190, -1));

        txtNewSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNewSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewSecurityQuestionKeyTyped(evt);
            }
        });
        getContentPane().add(txtNewSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 145, 347, -1));

        lblNewAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewAnswer.setForeground(new java.awt.Color(255, 255, 255));
        lblNewAnswer.setText("New Answer :-");
        getContentPane().add(lblNewAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 190, -1, -1));

        txtNewAnswer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNewAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 190, 347, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password :-");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 235, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 293, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 293, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 235, 347, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smallBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        User user = UserDao.getSecurityQuestion(userEmail);
        txtOldSecurityQuestion.setText(user.getSecurityQuestion());
        
    }//GEN-LAST:event_formComponentShown

    private void txtNewSecurityQuestionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewSecurityQuestionKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNewSecurityQuestionKeyTyped

    private void txtNewAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewAnswerKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNewAnswerKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String password = txtPassword.getText();
        String securityQuestion = txtNewSecurityQuestion.getText();
        String answer = txtNewAnswer.getText();
        UserDao.changeSecurityQuestion(userEmail, password, securityQuestion, answer);
        setVisible(false);
        new ChangeSecurityQuestion(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangeSecurityQuestion(userEmail).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeSecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChangeSecurityQuestion;
    private javax.swing.JLabel lblNewAnswer;
    private javax.swing.JLabel lblNewSecurityQuestion;
    private javax.swing.JLabel lblOldSecurityQuestion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtNewAnswer;
    private javax.swing.JTextField txtNewSecurityQuestion;
    private javax.swing.JTextField txtOldSecurityQuestion;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
