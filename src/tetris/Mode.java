package tetris;

import java.awt.Color;
import javax.swing.JButton;

public class Mode extends javax.swing.JFrame {
    
    //private GameArea ga;
    public static boolean Rgb;
    public static boolean blakWhite;
    public static boolean speeded;
    public static boolean pro;
    public static boolean noPower;
    public static int speedupPerLevel;
    
    

    public Mode() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRgb = new javax.swing.JButton();
        blackWhite = new javax.swing.JButton();
        speedBtn = new javax.swing.JButton();
        proBtn = new javax.swing.JButton();
        noPowerbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRgb.setText("RGB MODE");
        btnRgb.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnRgb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRgbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRgbMouseExited(evt);
            }
        });
        btnRgb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRgbActionPerformed(evt);
            }
        });
        jPanel1.add(btnRgb, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 129, 248, -1));

        blackWhite.setText("BLACK AND WHITE MODE");
        blackWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blackWhiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                blackWhiteMouseExited(evt);
            }
        });
        blackWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackWhiteActionPerformed(evt);
            }
        });
        jPanel1.add(blackWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 100, 248, -1));

        speedBtn.setText("SPEEDED MODE");
        speedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                speedBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                speedBtnMouseExited(evt);
            }
        });
        speedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(speedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 158, 248, -1));

        proBtn.setText("PRO MODE");
        proBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proBtnMouseExited(evt);
            }
        });
        proBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proBtnActionPerformed(evt);
            }
        });
        jPanel1.add(proBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 192, 248, -1));

        noPowerbtn.setText("NO POWER AND RGB MODE ");
        noPowerbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noPowerbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noPowerbtnMouseExited(evt);
            }
        });
        noPowerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPowerbtnActionPerformed(evt);
            }
        });
        jPanel1.add(noPowerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 221, 248, -1));

        backbtn.setText("BACK");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 254, 73, -1));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT MODE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 45, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/d.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnRgbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRgbActionPerformed
        this.setVisible(false);
        Rgb = true;
        Tetris.rgb = true;
        speedupPerLevel = 1000;
        Tetris.start();
    }//GEN-LAST:event_btnRgbActionPerformed

    private void blackWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackWhiteActionPerformed
        this.setVisible(false);
        blakWhite = true;
        //speedFix();
        speedupPerLevel = 1000;
        Tetris.start();      
    }//GEN-LAST:event_blackWhiteActionPerformed

    private void speedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedBtnActionPerformed
        this.setVisible(false);
        speeded = true;
        //speedFix();
        speedupPerLevel = 200;
        Tetris.start();
    }//GEN-LAST:event_speedBtnActionPerformed

    private void proBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proBtnActionPerformed
        this.setVisible(false);
        pro = true;
        //speedFix();
        speedupPerLevel = 200;
        Tetris.start();
    }//GEN-LAST:event_proBtnActionPerformed

    private void noPowerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPowerbtnActionPerformed
        this.setVisible(false);
        noPower = true;
        //speedFix();
        speedupPerLevel = 1000;
        Tetris.start();
    }//GEN-LAST:event_noPowerbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.setVisible(false);
        Tetris.showStartUp();
    }//GEN-LAST:event_backbtnActionPerformed
   
    private void setColorBW(JButton j){
        j.setBackground(new Color(121,164,239));
    }
    private void resetColorBW(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorR(JButton j){
        j.setBackground(new Color(150,121,155));
    }
    private void resetColorR(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorS(JButton j){
        j.setBackground(new Color(104,99,102));
    }
    private void resetColorS(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorP(JButton j){
        j.setBackground(new Color(178,162,56));
    }
    private void resetColorP(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorNo(JButton j){
        j.setBackground(new Color(196,56,56));
    }
    private void resetColorNo(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void setColorBa(JButton j){
        j.setBackground(new Color(157,189,161));
    }
    private void resetColorBa(JButton j){
        j.setBackground(new Color(240,240,240));
    }
    private void blackWhiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackWhiteMouseEntered
        setColorBW(blackWhite);
    }//GEN-LAST:event_blackWhiteMouseEntered

    private void blackWhiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackWhiteMouseExited
       resetColorBW(blackWhite);
    }//GEN-LAST:event_blackWhiteMouseExited

    private void btnRgbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRgbMouseEntered
        setColorR(btnRgb);
    }//GEN-LAST:event_btnRgbMouseEntered

    private void btnRgbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRgbMouseExited
         resetColorR(btnRgb);
    }//GEN-LAST:event_btnRgbMouseExited

    private void speedBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speedBtnMouseEntered
        setColorS(speedBtn);
    }//GEN-LAST:event_speedBtnMouseEntered

    private void speedBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speedBtnMouseExited
        resetColorS(speedBtn);
    }//GEN-LAST:event_speedBtnMouseExited

    private void proBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proBtnMouseEntered
        setColorP(proBtn);
    }//GEN-LAST:event_proBtnMouseEntered

    private void proBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proBtnMouseExited
       resetColorP(proBtn);
    }//GEN-LAST:event_proBtnMouseExited

    private void noPowerbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noPowerbtnMouseEntered
       setColorNo(noPowerbtn);
    }//GEN-LAST:event_noPowerbtnMouseEntered

    private void noPowerbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noPowerbtnMouseExited
         resetColorNo(noPowerbtn);
    }//GEN-LAST:event_noPowerbtnMouseExited

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        setColorBa(backbtn);
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        resetColorBa(backbtn);
    }//GEN-LAST:event_backbtnMouseExited

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
            java.util.logging.Logger.getLogger(Mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mode().setVisible(true);
                
            }
        });
    }
    
    public static void initModes(){
        Rgb = false;
        blakWhite = false;
        speeded = false;
        pro = false;
        noPower = false;
    }
    
//    public static void speedFix(){
//        if(speeded){
//            speedupPerLevel = 800;
//        }
//        else if(pro){
//            speedupPerLevel = 600;
//        }
//        else{
//            speedupPerLevel = 1000;
//        }
//        System.out.println(speedupPerLevel);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton blackWhite;
    public javax.swing.JButton btnRgb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton noPowerbtn;
    private javax.swing.JButton proBtn;
    private javax.swing.JButton speedBtn;
    // End of variables declaration//GEN-END:variables
}
