/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.manegement.system;

import common.OpenPdf;
import dao.BillDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;

/**
 *
 * @author jagta
 */
public class ViewBillAndOrderPlacedDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewBillAndOrderPlacedDetails
     */
    public ViewBillAndOrderPlacedDetails() {
        initComponents();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
        Date date = new Date();
        String todayDate = dFormat.format(date);
        txtlblFilterByDate.setText(todayDate);
    }
    
    public void tableDetails(){
        String date = txtlblFilterByDate.getText();
        String incDec =(String) txtChangeOrderByID.getSelectedItem();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if(incDec.equals("INC")){
            ArrayList<Bill> list = BillDao.getAllReccordsbyInc(date);
            Iterator<Bill> itr = list.iterator();
            while(itr.hasNext()){
                Bill billObj = itr.next();
                dtm.addRow(new Object[] {billObj.getId(),billObj.getName(),billObj.getMobileNumber(),billObj.getEmail(),billObj.getDate(),billObj.getTotal(),billObj.getCreatedBy()});
            }
        }
        else{
            ArrayList<Bill> list = BillDao.getAllReccordsbyDesc(date);
            Iterator<Bill> itr = list.iterator();
            while(itr.hasNext()){
                Bill billObj = itr.next();
                dtm.addRow(new Object[] {billObj.getId(),billObj.getName(),billObj.getMobileNumber(),billObj.getEmail(),billObj.getDate(),billObj.getTotal(),billObj.getCreatedBy()});
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblFilterByDate = new javax.swing.JLabel();
        txtlblFilterByDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtChangeOrderByID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblClickOnRowToOpenBill = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jLabel1.setText("View Bill & Order Placed Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 25, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 40, -1, -1));

        lblFilterByDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFilterByDate.setForeground(new java.awt.Color(255, 255, 255));
        lblFilterByDate.setText("Filter By Date");
        getContentPane().add(lblFilterByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        txtlblFilterByDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtlblFilterByDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlblFilterByDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtlblFilterByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Order By ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        txtChangeOrderByID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtChangeOrderByID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INC", "DESC" }));
        txtChangeOrderByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChangeOrderByIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtChangeOrderByID, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 250, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Mobile Number", "Email", "Date", "Total", "Created By"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 1309, -1));

        lblClickOnRowToOpenBill.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblClickOnRowToOpenBill.setForeground(new java.awt.Color(255, 255, 255));
        lblClickOnRowToOpenBill.setText("*Click On Row To Open Bill*");
        getContentPane().add(lblClickOnRowToOpenBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 700, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundSolid.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtlblFilterByDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlblFilterByDateKeyReleased
        // TODO add your handling code here:
        tableDetails();
    }//GEN-LAST:event_txtlblFilterByDateKeyReleased

    private void txtChangeOrderByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChangeOrderByIDActionPerformed
        // TODO add your handling code here:
        tableDetails();
    }//GEN-LAST:event_txtChangeOrderByIDActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        OpenPdf.OpenById(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        tableDetails();
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ViewBillAndOrderPlacedDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBillAndOrderPlacedDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBillAndOrderPlacedDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBillAndOrderPlacedDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBillAndOrderPlacedDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClickOnRowToOpenBill;
    private javax.swing.JLabel lblFilterByDate;
    private javax.swing.JComboBox<String> txtChangeOrderByID;
    private javax.swing.JTextField txtlblFilterByDate;
    // End of variables declaration//GEN-END:variables
}
