
package oopcoursework;
import OBS.Observable;
import javax.swing.JFrame;

public  class Submarine extends javax.swing.JFrame implements Observable {
        private MainController controller;

    public Submarine(MainController controller  ) {
        initComponents();
        setTitle("Submarine");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocation(10, 330);
        this.controller=controller;
        btnTrident.setEnabled(false);
        btnTomahaw.setEnabled(false);
        btnSonar.setEnabled(false);
        btnShoot.setEnabled(false);
        setVisible(true);
         

    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblArea = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtMsgsub = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnShoot = new javax.swing.JButton();
        btnSonar = new javax.swing.JButton();
        btnTomahaw = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnTrident = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area Not Cleared");
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 180, 20));

        jSlider1.setBackground(new java.awt.Color(0, 0, 51));
        jSlider1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(0, 204, 255));
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 70, 250));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 50, -1));
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 50, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Co...");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Cou...");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, 20));

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 30));

        txtMsgsub.setBackground(new java.awt.Color(0, 0, 51));
        txtMsgsub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMsgsub.setForeground(new java.awt.Color(255, 255, 255));
        txtMsgsub.setText("Send");
        txtMsgsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgsubActionPerformed(evt);
            }
        });
        add(txtMsgsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 80, 30));

        txtArea.setBackground(new java.awt.Color(0, 102, 153));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 80));

        btnShoot.setBackground(new java.awt.Color(0, 0, 51));
        btnShoot.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 30));

        btnSonar.setBackground(new java.awt.Color(0, 0, 51));
        btnSonar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSonar.setForeground(new java.awt.Color(255, 255, 255));
        btnSonar.setText("Sonar Operati...");
        add(btnSonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, 30));

        btnTomahaw.setBackground(new java.awt.Color(0, 0, 51));
        btnTomahaw.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTomahaw.setForeground(new java.awt.Color(255, 255, 255));
        btnTomahaw.setText("Tomahawk Missile");
        btnTomahaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawActionPerformed(evt);
            }
        });
        add(btnTomahaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 51));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Position");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, 30));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Submarine\n");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 170, 40));

        btnTrident.setBackground(new java.awt.Color(0, 0, 51));
        btnTrident.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnTrident.setForeground(new java.awt.Color(255, 255, 255));
        btnTrident.setText("Trident -2 Missile");
        btnTrident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentActionPerformed(evt);
            }
        });
        add(btnTrident, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Energy\n");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oxigen");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 30));

        jSlider2.setBackground(new java.awt.Color(0, 0, 51));
        jSlider2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSlider2.setForeground(new java.awt.Color(0, 204, 255));
        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(0);
        add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vecteezy_ai-generated-a-large-black-submarine-in-the-sea-under-an-old_37350402.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
    }//GEN-LAST:event_exitForm

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnTomahawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomahawActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnTridentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTridentActionPerformed

    private void txtMsgsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgsubActionPerformed
              controller.msg("SUBMARINE :"+jTextField1.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgsubActionPerformed

    private void txtAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorAdded
    }//GEN-LAST:event_txtAreaAncestorAdded

    private void txtAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorMoved
                   //controller.msg("Main controler :"+txtArea.getText());

    }//GEN-LAST:event_txtAreaAncestorMoved

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Submarine().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomahaw;
    private javax.swing.JButton btnTrident;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JButton txtMsgsub;
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
    }

    @Override
    public void WarStrength(int value) {
    if(value<10){
        btnShoot.setEnabled(false);
        }else if(value>=10){
        btnShoot.setEnabled(true);
        }  
      if(value<25){
        btnSonar.setEnabled(false);
        }else if(value>=25){
        btnSonar.setEnabled(true);
        }
         if(value<50){
        btnTomahaw.setEnabled(false);
        }else if(value>=50){
        btnTomahaw.setEnabled(true);
        }
          if(value<70){
        btnTrident.setEnabled(false);
        }else if(value>=70){
        btnTrident.setEnabled(true);
        } 
    }
    
    @Override
    public void SendMsg(String msg) {
        System.out.println("msg");
        txtArea.append("\n"+msg);  
    } 
}

