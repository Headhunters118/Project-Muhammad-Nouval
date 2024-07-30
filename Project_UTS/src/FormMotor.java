/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Muhammad Nouval
 */
public final class FormMotor extends javax.swing.JFrame {
    
    Motor mtr= new Motor();

    /**
     * Creates new form Motor
     */
    public FormMotor() {
        initComponents();
        Bersih();
    }
    
//   void aktif() {
//   R1.setEnabled(true);
//    R2.setEnabled(true);
//    R3.setEnabled(true);
//    }
    void Bersih() {
    THARGA.setEnabled(false);
    TDISKON.setEnabled(false);
    TOTHER.setEnabled(false);
    tnmpembeli.setText("");
    CBMERK.setSelectedIndex(0);
    bg.clearSelection();
    THARGA.setText("");
    BDISKON.setEnabled(false);
    TDISKON.setText("");
    TOTHER.setText("");
    R1.setEnabled(false);
    R2.setEnabled(false);
    R3.setEnabled(false);
    BHITUNG.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnmpembeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CBMERK = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        R1 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        THARGA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CBJENIS = new javax.swing.JComboBox<>();
        BDISKON = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TDISKON = new javax.swing.JTextField();
        TOTHER = new javax.swing.JTextField();
        BBARU = new javax.swing.JButton();
        BHITUNG = new javax.swing.JButton();
        BSELESAI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PENJUALAN MOTOR ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEALER MAJU MOTOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(181, 181, 181))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.setText("NAMA PEMBELI");

        tnmpembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnmpembeliActionPerformed(evt);
            }
        });

        jLabel4.setText("DATA MOTOR");

        jLabel5.setText("MERK MOTOR");

        CBMERK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "HONDA", "YAMAHA" }));
        CBMERK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBMERKActionPerformed(evt);
            }
        });

        jLabel6.setText("JENIS MOTOR");

        bg.add(R1);
        R1.setText("BEBEK");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        bg.add(R2);
        R2.setText("MATIC");
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        bg.add(R3);
        R3.setText("SPORT");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });

        jLabel7.setText("HARGA MOTOR");

        jLabel8.setText("JENIS BAYAR");

        CBJENIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "CASH", "CREDIT" }));

        BDISKON.setBackground(new java.awt.Color(153, 204, 255));
        BDISKON.setText("HITUNG DISKON");
        BDISKON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDISKONActionPerformed(evt);
            }
        });

        jLabel9.setText("DATA HARGA MOTOR");

        jLabel10.setText("DISKON");

        jLabel11.setText("TOTAL BAYAR");

        TDISKON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDISKONActionPerformed(evt);
            }
        });

        BBARU.setBackground(new java.awt.Color(153, 204, 255));
        BBARU.setText("BARU");
        BBARU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBARUActionPerformed(evt);
            }
        });

        BHITUNG.setBackground(new java.awt.Color(153, 204, 255));
        BHITUNG.setText("HITUNG TOTAL");
        BHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHITUNGActionPerformed(evt);
            }
        });

        BSELESAI.setBackground(new java.awt.Color(153, 204, 255));
        BSELESAI.setText("SELESAI");
        BSELESAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSELESAIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(tnmpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(R1)
                                        .addGap(43, 43, 43)
                                        .addComponent(R2)
                                        .addGap(43, 43, 43)
                                        .addComponent(R3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBJENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BDISKON)
                                            .addComponent(BSELESAI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TDISKON, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(THARGA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BHITUNG)
                                            .addComponent(TOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(CBMERK, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BBARU)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnmpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBMERK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(R1)
                    .addComponent(R2)
                    .addComponent(R3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(THARGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBJENIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDISKON))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TDISKON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TOTHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BBARU)
                    .addComponent(BHITUNG)
                    .addComponent(BSELESAI))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBMERKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBMERKActionPerformed
        // TODO add your handling code here:
        String merkMotor= CBMERK.getSelectedItem().toString();
        bg.clearSelection();
        BDISKON.setEnabled(false);
        if (merkMotor.equalsIgnoreCase("HONDA")) {
        mtr.setMerkMotor(merkMotor);
        R1.setEnabled(true);
        R2.setEnabled(true);
        R3.setEnabled(true);
        THARGA.setText("");
        TDISKON.setText("");
        TOTHER.setText("");
        }else if (merkMotor.equalsIgnoreCase("YAMAHA")) {
        mtr.setMerkMotor((merkMotor));
        R1.setEnabled(true);
        R2.setEnabled(false);
        R3.setEnabled(false);
        THARGA.setText("");
        TDISKON.setText("");
        TOTHER.setText("");}
        
            
    }//GEN-LAST:event_CBMERKActionPerformed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
        BDISKON.setEnabled(true);
        THARGA.setText(mtr.setJenisMotor("BEBEK"));
        TDISKON.setText("");
        TOTHER.setText("");
//        
    }//GEN-LAST:event_R1ActionPerformed

    private void BDISKONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDISKONActionPerformed
        // TODO add your handling code here:
        String diskon = mtr.totalDiskon();
        BHITUNG.setEnabled(true);
        TDISKON.setText(diskon);
    }//GEN-LAST:event_BDISKONActionPerformed

    private void BSELESAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSELESAIActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BSELESAIActionPerformed

    private void BBARUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBARUActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_BBARUActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
        BDISKON.setEnabled(true);
        THARGA.setText(mtr.setJenisMotor("MATIC"));
        TDISKON.setText("");
        TOTHER.setText("");
//        aktif();
    }//GEN-LAST:event_R2ActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        // TODO add your handling code here:
        BDISKON.setEnabled(true);
        THARGA.setText(mtr.setJenisMotor("SPORT"));
        TDISKON.setText("");
        TOTHER.setText("");
//        aktif();
    }//GEN-LAST:event_R3ActionPerformed

    private void tnmpembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnmpembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnmpembeliActionPerformed

    private void TDISKONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDISKONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TDISKONActionPerformed

    private void BHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHITUNGActionPerformed
        // TODO add your handling code here:
        String resultBayar = mtr.totalBayar();
        TOTHER.setText(resultBayar);
    }//GEN-LAST:event_BHITUNGActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBARU;
    private javax.swing.JButton BDISKON;
    private javax.swing.JButton BHITUNG;
    private javax.swing.JButton BSELESAI;
    private javax.swing.JComboBox<String> CBJENIS;
    private javax.swing.JComboBox<String> CBMERK;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JTextField TDISKON;
    private javax.swing.JTextField THARGA;
    private javax.swing.JTextField TOTHER;
    private javax.swing.ButtonGroup bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tnmpembeli;
    // End of variables declaration//GEN-END:variables

    private String setJenisMotor(String bebek) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String totalDiskon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setMerkMotor(String merkMotor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
