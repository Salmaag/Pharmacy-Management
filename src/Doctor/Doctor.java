/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import Login.Login;
import Patient.Patient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pharmacyManagement.pharmacyManagement;

/**
 *
 * @author DR.LAP
 */
public class Doctor extends javax.swing.JFrame {
 private JFrame frame2;
    /**
     * Creates new form Doctor
     */
    public Doctor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MCN = new javax.swing.JTextField();
        PID = new javax.swing.JTextField();
        AdC = new javax.swing.JTextField();
        Ophone = new javax.swing.JTextField();
        fna = new javax.swing.JTextField();
        surna = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        GA = new javax.swing.JTextField();
        Patnhs = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nhsNo = new javax.swing.JTextField();
        DocRef = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor");
        setPreferredSize(new java.awt.Dimension(1000, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Medical Centre Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Office phone");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Address of Centre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Patient ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Surname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Doctor's Nhs No.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Doctor's Ref No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Firstname");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        MCN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MCN.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(MCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, -1));

        PID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PID.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(PID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 160, -1));

        AdC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AdC.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(AdC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 160, -1));

        Ophone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Ophone.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(Ophone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 160, -1));

        fna.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fna.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(fna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, -1));

        surna.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        surna.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(surna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 160, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText("Patient NHS no.");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 153));
        jLabel20.setText("GA Appointment");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        GA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GA.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(GA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 160, -1));

        Patnhs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Patnhs.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(Patnhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 160, -1));

        jPanel1.setBackground(new java.awt.Color(251, 232, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setText("Pharmacy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(153, 0, 153));
        jButton8.setText("Patient");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, -1));

        ex.setBackground(new java.awt.Color(153, 153, 153));
        ex.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ex.setForeground(new java.awt.Color(153, 0, 153));
        ex.setText("Exit");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 90, -1));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 153));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jButton12.setBackground(new java.awt.Color(153, 153, 153));
        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 0, 153));
        jButton12.setText("Login");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 580, 80));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doc Ref No.", "Doc NHS No.", "Firstname", "Surname", "Med Centre Name", "Patient ID", "Address of Centre", "Office Phone", "GA Appointment", "Fur Info"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 910, 240));

        nhsNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nhsNo.setForeground(new java.awt.Color(0, 51, 102));
        nhsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhsNoActionPerformed(evt);
            }
        });
        getContentPane().add(nhsNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, -1));

        DocRef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DocRef.setForeground(new java.awt.Color(0, 51, 102));
        DocRef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Ref.", "D2001", "D2002", "D2003", "D2004" }));
        DocRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocRefActionPerformed(evt);
            }
        });
        getContentPane().add(DocRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, -1));

        jPanel3.setBackground(new java.awt.Color(251, 232, 251));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(null, "no data to delete", "Pharmacy Management System",
                    JOptionPane.OK_OPTION);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Pharmacy Management System",
                    JOptionPane.OK_OPTION);
            }

        }

        else
        {
            model.removeRow(jTable1.getSelectedRow());

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        frame2 = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame2,"Are you sure you want to exit" , "Pharmacy Management System",
            JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_exActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(new Object[] {DocRef.getSelectedItem().toString() ,nhsNo.getText(),
            fna.getText(),surna.getText(),MCN.getText(), PID.getText() , AdC.getText(),Ophone.getText() ,
            GA.getText() ,Patnhs.getText() });
    }//GEN-LAST:event_jButton6ActionPerformed

    private void nhsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhsNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhsNoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pharmacyManagement pharm = new pharmacyManagement();
        pharm.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
  //D2001,D2002,D2003,D2004
    private void DocRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocRefActionPerformed

        if(DocRef.getSelectedItem().equals("D2001")){
            nhsNo.setText("DR001");
            fna.setText("John");
            surna.setText("kennedy");
            MCN.setText("NYU Langone Hospitals");
            //PID.setText("");
            AdC.setText("Manhattan");
            Ophone.setText("9583493");
            GA.setText("Yes");
            //Patnhs.setText("no side effects");
           

        }

        if(DocRef.getSelectedItem().equals("D2002")){
            nhsNo.setText("DR002");
            fna.setText("Grace");
            surna.setText("Genny");
            MCN.setText("Mayo Clinic");
           // PID.setText("Keep away from children");
            AdC.setText("Arizona");
            Ophone.setText("8473947");
            GA.setText("Yes");
           // Patnhs.setText("no side effects");
            

        }

        if(DocRef.getSelectedItem().equals("D2003")){
            nhsNo.setText("DR003");
            fna.setText("George");
            surna.setText("Ezra");
            MCN.setText("Cedars-Sinai");
           // PID.setText("Keep away from children");
            AdC.setText(" California");
            Ophone.setText("857603");
            GA.setText("Yes");
            //Patnhs.setText("no side effects");

        }

        if(DocRef.getSelectedItem().equals("D2004")){
            nhsNo.setText("DR004");
            fna.setText("Michael");
            surna.setText("Mourny");
            MCN.setText("UCLA");
           // PID.setText("Keep away from children");
            AdC.setText("California");
            Ophone.setText("985803");
            GA.setText("Yes");
           // Patnhs.setText("no side effects");
            

            
        }
    }//GEN-LAST:event_DocRefActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Patient pat = new Patient();
        pat.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdC;
    private javax.swing.JComboBox<String> DocRef;
    private javax.swing.JTextField GA;
    private javax.swing.JTextField MCN;
    private javax.swing.JTextField Ophone;
    private javax.swing.JTextField PID;
    private javax.swing.JTextField Patnhs;
    private javax.swing.JButton ex;
    private javax.swing.JTextField fna;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nhsNo;
    private javax.swing.JTextField surna;
    // End of variables declaration//GEN-END:variables
}
