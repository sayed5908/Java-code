/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ReturnBook extends javax.swing.JFrame {
    Connection cn = null;
    PreparedStatement ps = null;

    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        initComponents();
       // cn = SQLConnection.ConnecrDb();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        issue = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        srchbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 90, 75, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 143, 75, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 190, 75, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 237, 75, -1));

        bid.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 90, 126, -1));

        sid.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 143, 126, -1));

        issue.setBackground(new java.awt.Color(255, 255, 204));
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        getContentPane().add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 190, 126, -1));

        due.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 237, 126, -1));

        srchbtn.setBackground(new java.awt.Color(255, 255, 204));
        srchbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        srchbtn.setText("Search");
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(srchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 140, -1, -1));

        returnbtn.setBackground(new java.awt.Color(255, 255, 204));
        returnbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnbtn.setText("Return");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 305, -1, -1));

        closebtn.setBackground(new java.awt.Color(255, 255, 204));
        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 305, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\pxfuel.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueActionPerformed

    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        // TODO add your handling code here:
        
        String bookID = bid.getText();
        String studentID = sid.getText();
        try {
             Connection cn = SQLConnection.ConnecrDb();
           PreparedStatement st = cn.prepareStatement("SELECT * from issue WHERE BookId = ? AND StudentId = ?");
           st.setString(1, bookID);
           st.setString(2, studentID);
                   
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                issue.setText(rs.getString(3));
                due.setText(rs.getString(4));
//                bid.setEditable(false);
//                sid.setEditable(false);
            }
            else
                JOptionPane.showMessageDialog(null, "Book is not issued to this student");
//            setVisible(false);
//            new ReturnBook().setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
             JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_srchbtnActionPerformed

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        String bookID = bid.getText();
        String studentID = sid.getText();
        try {
             Connection cn = SQLConnection.ConnecrDb();
            Statement st  = cn.createStatement();
            st.executeUpdate("UPDATE issue set returnbook='YES' WHERE StudentId='"+studentID+"' AND BookId='"+bookID+"'");
            
            JOptionPane.showMessageDialog(null, "Book successfully returned");
            setVisible(false);
            new ReturnBook().setVisible(true);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_returnbtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.show();
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bid;
    private javax.swing.JButton closebtn;
    private javax.swing.JTextField due;
    private javax.swing.JTextField issue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton returnbtn;
    private javax.swing.JTextField sid;
    private javax.swing.JButton srchbtn;
    // End of variables declaration//GEN-END:variables
}
