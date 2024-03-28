/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import customComps.BackgroundPanel;
import customComps.RoundedButton;
import customComps.RoundedPanel;
import customComps.RoundedTextField;
import java.util.Date;

/**
 *
 * @author Nyderlin Rivas
 */
public class Records extends javax.swing.JFrame {

    /**
     * Creates new form Records
     */
    public Records() {
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

        BgPanel = new BackgroundPanel("/resources/Artboard 1.png");
        Form3 = new RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecordsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        SearchTxt = new RoundedTextField();
        detailsButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1023, 664));
        setResizable(false);

        Form3.setBackground(new java.awt.Color(217, 217, 217,120));
        Form3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Hack", 0, 24)); // NOI18N
        jLabel1.setText("Registros");
        Form3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        RecordsTable.setBackground(new java.awt.Color(217, 217, 217));
        RecordsTable.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        RecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(RecordsTable);

        Form3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 730, 380));

        backButton.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        backButton.setText("Volver");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        Form3.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 100, 30));

        SearchTxt.setFont(new java.awt.Font("Hack", 1, 18)); // NOI18N
        SearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTxtActionPerformed(evt);
            }
        });
        Form3.add(SearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 260, 36));

        detailsButton1.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        detailsButton1.setText("Detalles");
        detailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButton1ActionPerformed(evt);
            }
        });
        Form3.add(detailsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, -1, 30));

        BgPanel.setPreferredSize(new java.awt.Dimension(881, 519));

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Form3, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Form3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void SearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTxtActionPerformed

    private void detailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel Form3;
    private javax.swing.JTable RecordsTable;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JButton backButton;
    private javax.swing.JButton detailsButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
