/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Salaryapp;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class ProjekEmployeeSalary extends javax.swing.JFrame {

    /**
     
     */
    public ProjekEmployeeSalary() {
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

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        basicSalaryTxt = new javax.swing.JTextField();
        AllowanceTxt = new javax.swing.JTextField();
        overtimeTxt = new javax.swing.JTextField();
        TotalIncomeTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nikTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        MaleButton = new javax.swing.JRadioButton();
        FemaleButton = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        CountButton = new javax.swing.JButton();
        NetSalaryTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTxt = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BPJSTxt = new javax.swing.JTextField();
        TaxTxt = new javax.swing.JTextField();
        TotalSpendingTxt = new javax.swing.JTextField();

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salaryapp/umbrella.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setText("Income");

        jLabel6.setText("Basic Salary");

        jLabel7.setText("Allowance");

        jLabel8.setText("Overtime");

        basicSalaryTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        basicSalaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicSalaryTxtActionPerformed(evt);
            }
        });

        AllowanceTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AllowanceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllowanceTxtActionPerformed(evt);
            }
        });

        overtimeTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        overtimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overtimeTxtActionPerformed(evt);
            }
        });

        TotalIncomeTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TotalIncomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalIncomeTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(basicSalaryTxt)
                    .addComponent(AllowanceTxt)
                    .addComponent(overtimeTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TotalIncomeTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AllowanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(overtimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(TotalIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NIK");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("date of birth");

        nikTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nikTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikTxtActionPerformed(evt);
            }
        });

        dateTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });

        nameTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        MaleButton.setText("Male");
        MaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleButtonActionPerformed(evt);
            }
        });

        FemaleButton.setText("Female");
        FemaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleButtonActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Salaryapp/test1.png"))); // NOI18N
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(FemaleButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nikTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(MaleButton)
                            .addComponent(FemaleButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        CountButton.setText("Count");
        CountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountButtonActionPerformed(evt);
            }
        });

        NetSalaryTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel12.setText("Net salary");

        OutputTxt.setBackground(new java.awt.Color(0, 0, 0));
        OutputTxt.setColumns(20);
        OutputTxt.setForeground(new java.awt.Color(255, 255, 255));
        OutputTxt.setRows(5);
        jScrollPane1.setViewportView(OutputTxt);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel9.setText("Subtraction");

        jLabel10.setText("BPJS");

        jLabel11.setText("Tax");

        BPJSTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        BPJSTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPJSTxtActionPerformed(evt);
            }
        });

        TaxTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        TotalSpendingTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TotalSpendingTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSpendingTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalSpendingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPJSTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(BPJSTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TaxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TotalSpendingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NetSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CountButton)
                    .addComponent(jLabel12)
                    .addComponent(NetSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basicSalaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicSalaryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basicSalaryTxtActionPerformed

    private void AllowanceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllowanceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AllowanceTxtActionPerformed

    private void overtimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overtimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overtimeTxtActionPerformed

    private void TotalIncomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalIncomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalIncomeTxtActionPerformed

    private void nikTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikTxtActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void MaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleButtonActionPerformed

    private void FemaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleButtonActionPerformed

    private void CountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountButtonActionPerformed
        //Kode Fungsi dari Tombol://JOption = untuk menampilkan pesan

        if(nikTxt.getText().isEmpty() ||  nameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Name Or NIK Not Complete",
                "ERROR",JOptionPane.ERROR_MESSAGE);
        }else if(MaleButton.isSelected() == false //ketika kedua tombol ini ga kepilih
            && FemaleButton.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Gender Not Selected",
                "Error",JOptionPane.ERROR_MESSAGE);
        }else if(dateTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Date of Birth Not Filled",
                "Error",JOptionPane.ERROR_MESSAGE);
        }else if(basicSalaryTxt.getText().isEmpty() ||
            AllowanceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Salary or Allowance not yet been filled",
                "Error",JOptionPane.ERROR_MESSAGE);
        }else if(BPJSTxt.getText().isEmpty() || TaxTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "BPJS or Tax not yet been filled",
                "Error",JOptionPane.ERROR_MESSAGE);
        }else {
            //fungsi dari tombol hitung
            double BasicSalary = Double.parseDouble(basicSalaryTxt.getText()),
            Allowance = Double.parseDouble(AllowanceTxt.getText()),        
            BPJS    = Double.parseDouble(BPJSTxt.getText()),
            Tax      = Double.parseDouble(TaxTxt.getText()),
            TotalIncome, TotalSpend, NetSalary;
            if(overtimeTxt.getText().isEmpty()){
                //bila lembur tidak ada
                TotalIncome = BasicSalary + Allowance;
                TotalIncomeTxt.setText("" + TotalIncome);
            } else {
                //bila lembur ada
                double overtime = Double.parseDouble(overtimeTxt.getText());
                TotalIncome = BasicSalary + Allowance + overtime;
                TotalIncomeTxt.setText("" + TotalIncome);
            }
            TotalSpend = BPJS + Tax;
            TotalSpendingTxt.setText("" + TotalSpend);
            
            NetSalary = TotalIncome - TotalSpend;
            NetSalaryTxt.setText("" + NetSalary);
            
            String gender;
            if(MaleButton.isSelected()){
            gender = "Male";
            } else{
            gender = "Female";
            }  
            // \t: (tab)
            OutputTxt.setText("NIK\t:" + nikTxt.getText() +"\nName \t:" 
                              +nameTxt.getText()+ "\nGender\t:" + gender + "\nDate of Birth\t:"
                              +dateTxt.getText()+"\nIncome\t:" + TotalIncome 
                              +"\nExpenditure\t:" + TotalSpend + "\nNet Salary\t:"
                              + NetSalary 
        );
        }
    }//GEN-LAST:event_CountButtonActionPerformed

    private void BPJSTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPJSTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BPJSTxtActionPerformed

    private void TotalSpendingTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSpendingTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSpendingTxtActionPerformed

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
            java.util.logging.Logger.getLogger(ProjekEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjekEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjekEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjekEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjekEmployeeSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AllowanceTxt;
    private javax.swing.JTextField BPJSTxt;
    private javax.swing.JButton CountButton;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JTextField NetSalaryTxt;
    private javax.swing.JTextArea OutputTxt;
    private javax.swing.JTextField TaxTxt;
    private javax.swing.JTextField TotalIncomeTxt;
    private javax.swing.JTextField TotalSpendingTxt;
    private javax.swing.JTextField basicSalaryTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField nikTxt;
    private javax.swing.JTextField overtimeTxt;
    // End of variables declaration//GEN-END:variables
}
