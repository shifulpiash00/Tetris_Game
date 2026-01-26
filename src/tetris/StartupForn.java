package tetris;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartupForn extends javax.swing.JFrame {
    private static Mode mf;
    
    public StartupForn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnLeaderboard = new javax.swing.JButton();
        btnIns = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        crdbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setText("Start Game");
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartMouseExited(evt);
            }
        });
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 134, -1));

        btnLeaderboard.setText("Leaderboard");
        btnLeaderboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLeaderboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLeaderboardMouseExited(evt);
            }
        });
        btnLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderboardActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 134, -1));

        btnIns.setText("Instructions");
        btnIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsMouseExited(evt);
            }
        });
        btnIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsActionPerformed(evt);
            }
        });
        jPanel1.add(btnIns, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 134, -1));

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitMouseExited(evt);
            }
        });
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 134, 20));

        crdbtn.setText("Credits");
        crdbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crdbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crdbtnMouseExited(evt);
            }
        });
        crdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdbtnActionPerformed(evt);
            }
        });
        jPanel1.add(crdbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 134, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/O.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdbtnActionPerformed
        this.setVisible(false);
        Tetris.showCredit();
    }//GEN-LAST:event_crdbtnActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnQuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseEntered
        setColorQ(btnQuit);
    }//GEN-LAST:event_btnQuitMouseEntered

    private void btnInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsActionPerformed
        this.setVisible(false);
        Tetris.showIns();
    }//GEN-LAST:event_btnInsActionPerformed

    private void btnInsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsMouseExited
        resetColorI(btnIns);
    }//GEN-LAST:event_btnInsMouseExited

    private void btnInsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsMouseEntered
        setColorI(btnIns);
    }//GEN-LAST:event_btnInsMouseEntered

    private void btnLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderboardActionPerformed
        this.setVisible(false);
        Tetris.showLeaderboard();
    }//GEN-LAST:event_btnLeaderboardActionPerformed

    private void btnLeaderboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeaderboardMouseExited
        resetColorL(btnLeaderboard);
    }//GEN-LAST:event_btnLeaderboardMouseExited

    private void btnLeaderboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeaderboardMouseEntered
        setColorL(btnLeaderboard);
    }//GEN-LAST:event_btnLeaderboardMouseEntered

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        this.setVisible(false);
        mf = new Mode();
        mf.setVisible(true);

        //        Tetris.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseExited
        resetColor(btnStart);
    }//GEN-LAST:event_btnStartMouseExited

    private void btnStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseEntered
        setColor(btnStart);
    }//GEN-LAST:event_btnStartMouseEntered

    private void btnQuitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseExited
        resetColorQ(btnQuit);
    }//GEN-LAST:event_btnQuitMouseExited

    private void crdbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crdbtnMouseEntered
        setColorCr(crdbtn);
    }//GEN-LAST:event_crdbtnMouseEntered

    private void crdbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crdbtnMouseExited
        resetColorCr(crdbtn);
    }//GEN-LAST:event_crdbtnMouseExited
    
    private void setColor(JButton j){
        j.setBackground(new Color(242,173,95));
    }
    private void resetColor(JButton j){
        j.setBackground(new Color(240,240,240));
    }
        private void setColorL(JButton j){
        j.setBackground(new Color(161,83,101));
    }
    private void resetColorL(JButton j){
        j.setBackground(new Color(240,240,240));
    }    private void setColorI(JButton j){
        j.setBackground(new Color(84,117,168));
    }
    private void resetColorI(JButton j){
        j.setBackground(new Color(240,240,240));
    }   
    private void setColorQ(JButton j){
        j.setBackground(new Color(62,166,139));
    }
    private void resetColorQ(JButton j){
        j.setBackground(new Color(240,240,240));
    }    private void setColorC(JButton j){
        j.setBackground(new Color(112,131,68));
    }
    private void resetColorC(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorCr(JButton j){
        j.setBackground(new Color(203,123,243));
    }
    private void resetColorCr(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorBa(JButton j){
        j.setBackground(new Color(157,189,161));
    }
    private void resetColorBa(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    
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
            java.util.logging.Logger.getLogger(StartupForn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartupForn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartupForn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartupForn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupForn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIns;
    private javax.swing.JButton btnLeaderboard;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton crdbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
