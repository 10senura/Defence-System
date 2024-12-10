/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package oopcoursework;

import OBS.Observable;
import javax.swing.JFrame;


public class Helicopter extends javax.swing.JFrame implements Observable {
        private MainController controller;
        
    public Helicopter(MainController controller ) {
        initComponents();
        setTitle("Helicoper");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(650, 330);
        this.controller=controller;
        btnLaser.setEnabled(false);
        btnMissile.setEnabled(false);
        btnShoot.setEnabled(false);  //button to statr in the false on
        setVisible(true);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        lblArea = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtMsg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        textField1.setText("textField1");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArea.setBackground(new java.awt.Color(0, 51, 51));
        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 51, 51));
        lblArea.setText("Area Not Cleared");
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 20));

        jSlider1.setBackground(new java.awt.Color(0, 51, 51));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(204, 255, 204));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 50, 280));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 50, -1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 50, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Soldier Co...");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 100, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Ammo Cou...");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 100, 20));

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 30));

        txtMsg.setBackground(new java.awt.Color(0, 51, 51));
        txtMsg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMsg.setForeground(new java.awt.Color(255, 255, 255));
        txtMsg.setText("Send");
        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });
        add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 70, 30));

        txtArea.setBackground(new java.awt.Color(0, 102, 102));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(5);
        txtArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txtArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 90));

        btnShoot.setBackground(new java.awt.Color(0, 51, 51));
        btnShoot.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

        btnMissile.setBackground(new java.awt.Color(0, 51, 51));
        btnMissile.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnMissile.setText("Missile Operati...");
        btnMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileActionPerformed(evt);
            }
        });
        add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 30));

        btnLaser.setBackground(new java.awt.Color(0, 51, 51));
        btnLaser.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnLaser.setForeground(new java.awt.Color(255, 255, 255));
        btnLaser.setText("Laser Operation");
        btnLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserActionPerformed(evt);
            }
        });
        add(btnLaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.setOpaque(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 80, 30));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Helicopter");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green-plane-sustainable-energy-concept.jpg"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
    }//GEN-LAST:event_exitForm

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaserActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
              controller.msg("HELICOPTER :"+jTextField1.getText());
    }//GEN-LAST:event_txtMsgActionPerformed

    private void txtAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorAdded
                                // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaAncestorAdded

    private void btnMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissileActionPerformed
   
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Helicopter().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnShoot;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArea;
    private java.awt.TextField textField1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JButton txtMsg;
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
        btnMissile.setEnabled(false);
        }else if(value>=25){
        btnMissile.setEnabled(true);
        }
  if(value<50){
        btnLaser.setEnabled(false);
        }else if(value>=50){
        btnLaser.setEnabled(true);
        }
    }  

    
    @Override
    public void SendMsg(String msg) {
        System.out.println("msg");
        txtArea.append("\n"+msg);  
    } 

   
}
