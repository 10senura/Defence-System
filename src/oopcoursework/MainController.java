/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package oopcoursework;

import OBS.Observable;
import OBS.Observer;
import javax.swing.JFrame;


public  class MainController  extends javax.swing.JFrame implements Observable {
    
    private Observer ob;
    private Object controller;
          
    public MainController(Observer ob) {
        initComponents();
        setTitle("MainController");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setLocation(10, 0);
        
        this.ob=ob;  // main from conrtolar conect the obs
        Slider.setValue(0);
        sendAll.setEnabled(true);

    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Slider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sendAll = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        MaintxtArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Slider.setBackground(new java.awt.Color(0, 51, 51));
        Slider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slider.setForeground(new java.awt.Color(255, 255, 255));
        Slider.setMajorTickSpacing(20);
        Slider.setMinorTickSpacing(10);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        Slider.setValue(0);
        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });
        add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soldier Count");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Position");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 20));

        sendAll.setBackground(new java.awt.Color(0, 51, 51));
        sendAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendAll.setForeground(new java.awt.Color(255, 255, 255));
        sendAll.setText("Send");
        sendAll.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sendAllAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                sendAllAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        sendAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAllActionPerformed(evt);
            }
        });
        add(sendAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 70, 30));

        jButton3.setBackground(new java.awt.Color(0, 51, 51));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Missile Operati...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, 30));

        jCheckBox1.setBackground(new java.awt.Color(0, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Area Clear");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 90, 30));

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" MainController");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 180, 30));

        jCheckBox2.setBackground(new java.awt.Color(0, 51, 51));
        jCheckBox2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Send Private ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 100, 30));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Tank", "Helicopter", "Submarin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fuel Amount");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ammo Amount");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        txtArea.setBackground(new java.awt.Color(0, 102, 102));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setRows(6);
        txtArea.setTabSize(9);
        txtArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                txtAreaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(txtArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 70));

        MaintxtArea.setBackground(new java.awt.Color(0, 102, 102));
        MaintxtArea.setColumns(20);
        MaintxtArea.setForeground(new java.awt.Color(255, 255, 255));
        MaintxtArea.setRows(6);
        MaintxtArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MaintxtAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                MaintxtAreaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                MaintxtAreaAncestorRemoved(evt);
            }
        });
        jScrollPane3.setViewportView(MaintxtArea);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 170, 90));

        txtArea4.setBackground(new java.awt.Color(0, 102, 102));
        txtArea4.setColumns(20);
        txtArea4.setForeground(new java.awt.Color(255, 255, 255));
        txtArea4.setRows(6);
        jScrollPane4.setViewportView(txtArea4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 180, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download-compresskaru.com (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         System.out.println(jCheckBox1.isSelected());
         ob.AreaChangecleared(jCheckBox1.isSelected());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
      System.out.println(jCheckBox1.isSelected());
         ob.AreaChangecleared(jCheckBox1.isSelected());    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
                  System.out.println(Slider.getValue());
                  int value=Slider.getValue();
                  ob.AreaChangecleared(value);       
    }//GEN-LAST:event_SliderStateChanged

    private void MaintxtAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MaintxtAreaAncestorAdded
                 
    }//GEN-LAST:event_MaintxtAreaAncestorAdded

    private void sendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAllActionPerformed
                    ob.sendMessage("Main Controler:"+MaintxtArea.getText());

    }//GEN-LAST:event_sendAllActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaAncestorMoved

    }//GEN-LAST:event_txtAreaAncestorMoved

    private void MaintxtAreaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MaintxtAreaAncestorMoved

    }//GEN-LAST:event_MaintxtAreaAncestorMoved

    private void sendAllAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sendAllAncestorAdded
    }//GEN-LAST:event_sendAllAncestorAdded

    private void sendAllAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sendAllAncestorMoved
    }//GEN-LAST:event_sendAllAncestorMoved

    private void MaintxtAreaAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MaintxtAreaAncestorRemoved
    }//GEN-LAST:event_MaintxtAreaAncestorRemoved



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MaintxtArea;
    private javax.swing.JSlider Slider;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton sendAll;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea4;
    // End of variables declaration//GEN-END:variables

    private void setLocatoinRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void msg(String msg) {
        System.out.println("msg");
        txtArea.append("\n"+msg);    
    }
    @Override
    public void SendMsg(String send){
        System.out.println("send");
        sendAll.setText("\n"+send);
    }
    
    @Override
    public void areaMsg(boolean msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void recieveMsg(String msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void WarStrength(int value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

    
    
