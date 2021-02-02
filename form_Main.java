/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopd.hvktmm;
import javax.swing.JFrame;

/**
 *
 * @author Laptop88
 */
public class form_Main extends javax.swing.JFrame /*implements Runnable*/ {
    public form_Main() {
        initComponents();
        this.setTitle("Steganography");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        lb_gio = new javax.swing.JLabel();
        lb_welcom = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lableanhdong = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuLopSV = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuBĐ = new javax.swing.JMenuItem();
        menuPD = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        jMenuItem2.setText("jMenuItem2");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_gio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_gio.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(lb_gio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 290, 50));

        lb_welcom.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_welcom.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lb_welcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 640, 50));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 450, 260));
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 450, 260));

        lableanhdong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BGR1.png"))); // NOI18N
        getContentPane().add(lableanhdong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1670, -1));

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Action");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        menuLopSV.setBackground(new java.awt.Color(255, 255, 255));
        menuLopSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuLopSV.setText("LSB Steganography");
        menuLopSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLopSVActionPerformed(evt);
            }
        });
        jMenu2.add(menuLopSV);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Visual Cryptography");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        menuBĐ.setBackground(new java.awt.Color(255, 255, 255));
        menuBĐ.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuBĐ.setText("Share");
        menuBĐ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBĐActionPerformed(evt);
            }
        });
        jMenu3.add(menuBĐ);

        menuPD.setBackground(new java.awt.Color(255, 255, 255));
        menuPD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuPD.setText("Combination");
        menuPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPDActionPerformed(evt);
            }
        });
        jMenu3.add(menuPD);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLopSVActionPerformed
        Form_Action form_lop_sinhvien = new Form_Action();
        form_lop_sinhvien.setVisible(true);
    }//GEN-LAST:event_menuLopSVActionPerformed

    private void menuPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPDActionPerformed

    }//GEN-LAST:event_menuPDActionPerformed

    private void menuBĐActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBĐActionPerformed
        Form_VC form_VC = new Form_VC();
        form_VC.setVisible(true);
    }//GEN-LAST:event_menuBĐActionPerformed

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
            java.util.logging.Logger.getLogger(form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lableanhdong;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb_gio;
    private javax.swing.JLabel lb_welcom;
    private javax.swing.JMenuItem menuBĐ;
    private javax.swing.JMenuItem menuLopSV;
    private javax.swing.JMenuItem menuPD;
    // End of variables declaration//GEN-END:variables

}
