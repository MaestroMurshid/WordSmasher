

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Toshiba
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public HomePage() {
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

        btn_new_game = new javax.swing.JButton();
        btn_leader = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        btn_new_game.setBackground(new java.awt.Color(255, 255, 255));
        btn_new_game.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_new_game.setText("Start");
        btn_new_game.setMaximumSize(new java.awt.Dimension(600, 600));
        btn_new_game.setMinimumSize(new java.awt.Dimension(600, 600));
        btn_new_game.setPreferredSize(new java.awt.Dimension(600, 600));
        btn_new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_new_gameActionPerformed(evt);
            }
        });
        getContentPane().add(btn_new_game);
        btn_new_game.setBounds(180, 230, 239, 45);

        btn_leader.setBackground(new java.awt.Color(255, 255, 255));
        btn_leader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_leader.setText("Leaderboards");
        btn_leader.setMaximumSize(new java.awt.Dimension(131, 37));
        btn_leader.setMinimumSize(new java.awt.Dimension(131, 37));
        btn_leader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leaderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_leader);
        btn_leader.setBounds(180, 290, 239, 45);

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setMaximumSize(new java.awt.Dimension(131, 37));
        btn_exit.setMinimumSize(new java.awt.Dimension(131, 37));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(180, 350, 239, 45);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mohdm\\Documents\\NetBeansProjects\\WordSmasher\\src\\wordsmasher\\WORD-SMASHER (1).png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 30, 540, 80);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starry night Image.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 600, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_new_gameActionPerformed
        GamePicker gmp= new GamePicker();
        gmp.setVisible(true);
        this.dispose();
                
        
    }//GEN-LAST:event_btn_new_gameActionPerformed

    private void btn_leaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leaderActionPerformed
        leadermenu ldsh= new leadermenu();
        ldsh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_leaderActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_leader;
    private javax.swing.JButton btn_new_game;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}