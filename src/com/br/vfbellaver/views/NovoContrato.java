/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.views;

import com.br.vfbellaver.Implements.ContratoDaoImp;
import com.br.vfbellaver.Implements.ImovelDaoImp;
import com.br.vfbellaver.Implements.InquilinoDaoImp;
import com.br.vfbellaver.Implements.ModeloContratoDaoImp;
import com.br.vfbellaver.models.Imovel;
import com.br.vfbellaver.models.Inquilino;
import com.br.vfbellaver.models.ModeloContrato;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vfbellaver
 */
public class NovoContrato extends javax.swing.JFrame {

    /**
     * Creates new form NovoContrato
     */
    public NovoContrato() {
        initComponents();
        iniciaObjetosImp();
        iniciaComboBoxInquilinos();
        iniciaComboBoxModeloContrato();
        iniciaComboBoxImovel();
    }
    
    InquilinoDaoImp inqDaoImp;
    ContratoDaoImp contDaoImp;
    ImovelDaoImp imovDaoImp;
    ModeloContratoDaoImp modContImp;

    private void iniciaObjetosImp() {
        inqDaoImp = new InquilinoDaoImp();
        contDaoImp = new ContratoDaoImp();
        imovDaoImp = new ImovelDaoImp();
        modContImp = new ModeloContratoDaoImp();
    }

    private void iniciaComboBoxModeloContrato() {
        try {
            List<ModeloContrato> listaModelos = modContImp.listarTodos(ModeloContrato.class);
            modeloContrato.setModel(new GenericComboModel(listaModelos));
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR IMÓVEIS: " + ex.getMessage());
        }
    }

    private void iniciaComboBoxImovel() {
        try {
            List<Inquilino> listaInquilinos = inqDaoImp.listarTodos(Imovel.class);
            imovelSelect.setModel(new GenericComboModel(listaInquilinos));
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR IMÓVEIS: " + ex.getMessage());
        }
    }

    private void iniciaComboBoxInquilinos() {
        try {
            List<Inquilino> listaInquilinos = inqDaoImp.listarTodos(Inquilino.class);
           locatarioSelect.setModel(new GenericComboModel(listaInquilinos));
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR INQUILINOS: " + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locatarioSelect = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        valorAluguel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        localContrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dataContrato = new com.toedter.calendar.JDateChooser();
        dataEntrada = new com.toedter.calendar.JDateChooser();
        gerarContratoBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        modeloContrato = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        imovelSelect = new javax.swing.JComboBox<>();
        cancelarContratoBtn = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setPreferredSize(new java.awt.Dimension(900, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/contrato.png"))); // NOI18N
        jLabel1.setText("Novo Contrato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Selecione o locatário:");

        locatarioSelect.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locatarioSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Valor do Aluguel:");

        valorAluguel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        valorAluguel.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        valorAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAluguelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Local:");

        localContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        localContrato.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        localContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localContratoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Data:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Data Entrada:");

        dataContrato.setFocusable(false);
        dataContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        dataEntrada.setFocusable(false);
        dataEntrada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        gerarContratoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gerarContratoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/imprimir.png"))); // NOI18N
        gerarContratoBtn.setText("Gerar para Imprimir");
        gerarContratoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarContratoBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Modelo Contrato:");

        modeloContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        modeloContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        modeloContrato.setSelectedItem("Selecione");
        modeloContrato.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Imóvel:");

        imovelSelect.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        imovelSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        imovelSelect.setToolTipText("");

        cancelarContratoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelarContratoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/cancelar.png"))); // NOI18N
        cancelarContratoBtn.setText("Cancelar");
        cancelarContratoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarContratoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarContratoBtn)
                        .addGap(26, 26, 26)
                        .addComponent(gerarContratoBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(locatarioSelect, 0, 648, Short.MAX_VALUE)
                            .addComponent(localContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modeloContrato, 0, 648, Short.MAX_VALUE)
                            .addComponent(imovelSelect, 0, 648, Short.MAX_VALUE))))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(modeloContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(imovelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(locatarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(localContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dataContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerarContratoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarContratoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAluguelActionPerformed

    private void localContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localContratoActionPerformed

    private void gerarContratoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarContratoBtnActionPerformed
        
        // VERIFICANDO SE TODOS OS CAMPOS ESTÃO PREENCHIDOS
        if(modeloContrato.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Selecione um modelo de contrato.");
            return;
        }
        if(imovelSelect.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Selecione o endereço do imóvel.");
            return;
        }   
        if(locatarioSelect.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Selecione um locatário.");
            return;
        }
        if(dataEntrada.getDate() == null){
             JOptionPane.showMessageDialog(null, "Selecione a data de entrada no imóvel.");
             return;
        }
        if(valorAluguel.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Informe o valor do Aluguel.");
             return;
        }
        if(localContrato.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Informe o local de assinatura.");
             return;
        }
        if(dataContrato.getDate() == null){
             JOptionPane.showMessageDialog(null, "Selecione a data de assinatura.");
             return;
        }
        
        
    }//GEN-LAST:event_gerarContratoBtnActionPerformed

    private void cancelarContratoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarContratoBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelarContratoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NovoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarContratoBtn;
    private com.toedter.calendar.JDateChooser dataContrato;
    private com.toedter.calendar.JDateChooser dataEntrada;
    private javax.swing.JButton gerarContratoBtn;
    private javax.swing.JComboBox<String> imovelSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField localContrato;
    private javax.swing.JComboBox<String> locatarioSelect;
    private javax.swing.JComboBox<String> modeloContrato;
    private javax.swing.JTextField valorAluguel;
    // End of variables declaration//GEN-END:variables
}
