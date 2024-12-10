/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package oopcoursework;

import OBS.Observable;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public  class Tank extends javax.swing.JFrame implements Observable {
    private MainController controller;
   
    public Tank( MainController controller ) {
         initComponents();  
         setTitle("Tank");
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setLocation(650, 0);
         this.controller=controller;
         btnRotare.setEnabled(false);
         btnRedar.setEnabled(false);
         jButton3.setEnabled(false);
         btnShoot.setEnabled(false);
         setVisible(true);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnShoot = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRedar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnRotare = new javax.swing.JButton();
        btnMissile = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area Not Cleared");
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 20));

        jSlider1.setBackground(new java.awt.Color(0, 51, 51));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(51, 153, 0));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 70, 250));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 50, -1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 50, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Co...");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Cou...");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 100, 20));

        txtMsg.setBackground(new java.awt.Color(0, 51, 51));
        txtMsg.setForeground(new java.awt.Color(255, 255, 255));
        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });
        add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 70, -1));

        txtArea.setBackground(new java.awt.Color(0, 51, 51));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        txtArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtAreaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txtArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 340, 90));

        btnShoot.setBackground(new java.awt.Color(0, 51, 51));
        btnShoot.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Missile Operati...");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 30));

        btnRedar.setBackground(new java.awt.Color(0, 51, 51));
        btnRedar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRedar.setForeground(new java.awt.Color(255, 255, 255));
        btnRedar.setText("Redar Operation");
        btnRedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedarActionPerformed(evt);
            }
        });
        add(btnRedar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 80, 30));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tank\n");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 210, 30));

        btnRotare.setBackground(new java.awt.Color(0, 51, 51));
        btnRotare.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRotare.setForeground(new java.awt.Color(255, 255, 255));
        btnRotare.setText("Rotare Shoting");
        btnRotare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotareActionPerformed(evt);
            }
        });
        add(btnRotare, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 30));

        btnMissile.setBackground(new java.awt.Color(0, 51, 51));
        btnMissile.setForeground(new java.awt.Color(102, 255, 255));
        btnMissile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view-armed-tank-used-combat-war-time.jpg"))); // NOI18N
        btnMissile.setText("jLabel6");
        add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
    }//GEN-LAST:event_exitForm

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
                  
    }//GEN-LAST:event_txtMsgActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnRedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRedarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnRotareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRotareActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              controller.msg("TANK :"+txtMsg.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorAdded
                                
    }//GEN-LAST:event_txtAreaAncestorAdded

    private void txtAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorMoved
    }//GEN-LAST:event_txtAreaAncestorMoved

    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Tank().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnMissile;
    private javax.swing.JButton btnRedar;
    private javax.swing.JButton btnRotare;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaMsg(boolean msg) {
        if(msg){
         lblArea.setText("Area Clead");
        }else{
        lblArea.setText("Area Not Clead");
        }
    }

    @Override
    public void recieveMsg(String msg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void WarStrength(int value) {
        if(value<10){
        btnShoot.setEnabled(false);
        }else if(value>=10){
        btnShoot.setEnabled(true);
        }
        if(value<25){
        jButton3.setEnabled(false);
        }else if(value>=25){
        jButton3.setEnabled(true);
        }
         if(value<50){
        btnRedar.setEnabled(false);
        }else if(value>=50){
        btnRedar.setEnabled(true);
        }
          if(value<70){
        btnRotare.setEnabled(false);
        }else if(value>=70){
        btnRotare.setEnabled(true);
        }
        
    }

    @Override
    public void SendMsg(String msg){
        System.out.println("msg");
        txtArea.append("\n"+msg); 
    }
}