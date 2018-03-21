/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.views;

import com.br.vfbellaver.Implements.ModeloContratoDaoImp;
import com.br.vfbellaver.models.ModeloContrato;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author vfbellaver
 */
public class DefinicoesDeContrato extends javax.swing.JFrame {

    /**
     * Creates new form DefinicoesDeContrato
     */
    public DefinicoesDeContrato() {
        initComponents();
        iniciaObjetosDaoImp();
    }
            
    ModeloContrato modContrato;
    ModeloContratoDaoImp modContDaoImp;

    public void iniciaObjetosDaoImp(){
        modContDaoImp = new ModeloContratoDaoImp();
        iniciaDadosModeloContrato();
    }
    public void iniciaDadosModeloContrato(){
        try {
            modContrato = modContDaoImp.buscarPorId(1);
            
            if (modContrato != null) {
                nomeContrato.setText(modContrato.getNomeModeloContrato());
                locatarioContrato.setText(modContrato.getNomeLocatario());
                cpfLocatario.setText(String.valueOf(modContrato.getCpfLocatario()));
                rgLocatario.setText(String.valueOf(modContrato.getRgLocatario()));
                orgEmissorRgLocatario.setText(modContrato.getOrgaoEmissorLocatario());
                estadoCivilLocatario.setText(modContrato.getEstadoCivilLocatario());
                nacionalidadeLocatario.setText(modContrato.getNacionalidadeLocatario());
                clausulasContrato.setText(modContrato.getClausulasContrato());
            }else {
                JOptionPane.showMessageDialog(null, "Ainda não existe contrato cadastrado.");
            }
        } catch (Exception ex) {
            Logger.getLogger(DefinicoesDeContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomeContrato = new javax.swing.JTextField();
        locatarioContrato = new javax.swing.JTextField();
        rgLocatario = new javax.swing.JTextField();
        cpfLocatario = new javax.swing.JTextField();
        orgEmissorRgLocatario = new javax.swing.JTextField();
        enderecoLocatario = new javax.swing.JTextField();
        nacionalidadeLocatario = new javax.swing.JTextField();
        estadoCivilLocatario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clausulasContrato = new javax.swing.JTextArea();
        salvarContratoBtn = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Estado Civil:");

        jTextField3.setText("jTextField3");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/definicoes-contrato.png"))); // NOI18N
        jLabel1.setText("Definições padrão do Contrato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nome Contrato:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Locatário:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nacionalidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Estado Civil:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("RG:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Orgão Emissor:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Endereço:");

        nomeContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nomeContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeContratoActionPerformed(evt);
            }
        });

        locatarioContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locatarioContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locatarioContratoActionPerformed(evt);
            }
        });

        rgLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rgLocatario.setMinimumSize(new java.awt.Dimension(120, 26));
        rgLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgLocatarioActionPerformed(evt);
            }
        });

        cpfLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cpfLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfLocatarioActionPerformed(evt);
            }
        });

        orgEmissorRgLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        orgEmissorRgLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgEmissorRgLocatarioActionPerformed(evt);
            }
        });

        enderecoLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        enderecoLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoLocatarioActionPerformed(evt);
            }
        });

        nacionalidadeLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nacionalidadeLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadeLocatarioActionPerformed(evt);
            }
        });

        estadoCivilLocatario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        estadoCivilLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoCivilLocatarioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Cláusulas Contrato:");

        clausulasContrato.setColumns(20);
        clausulasContrato.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        clausulasContrato.setRows(5);
        jScrollPane1.setViewportView(clausulasContrato);

        salvarContratoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salvarContratoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/ok-icon-th.png"))); // NOI18N
        salvarContratoBtn.setText("Salvar");
        salvarContratoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarContratoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(nomeContrato))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(939, 939, 939)
                        .addComponent(salvarContratoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(locatarioContrato)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nacionalidadeLocatario)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cpfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rgLocatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(orgEmissorRgLocatario))
                                    .addComponent(estadoCivilLocatario)))
                            .addComponent(enderecoLocatario))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(locatarioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rgLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cpfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(orgEmissorRgLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nacionalidadeLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(estadoCivilLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(enderecoLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarContratoBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeContratoActionPerformed

    private void locatarioContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locatarioContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locatarioContratoActionPerformed

    private void rgLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgLocatarioActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void cpfLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfLocatarioActionPerformed

    private void orgEmissorRgLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgEmissorRgLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgEmissorRgLocatarioActionPerformed

    private void enderecoLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoLocatarioActionPerformed

    private void nacionalidadeLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadeLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadeLocatarioActionPerformed

    private void estadoCivilLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoCivilLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoCivilLocatarioActionPerformed

    private void salvarContratoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarContratoBtnActionPerformed
       
        modContrato.setNomeModeloContrato(nomeContrato.getText());
        modContrato.setNomeLocatario(locatarioContrato.getText());
        modContrato.setCpfLocatario(Long.parseLong(cpfLocatario.getText()));
        modContrato.setRgLocatario(Long.parseLong(rgLocatario.getText()));
        modContrato.setOrgaoEmissorLocatario(orgEmissorRgLocatario.getText());
        modContrato.setEstadoCivilLocatario(estadoCivilLocatario.getText());
        modContrato.setNacionalidadeLocatario(nacionalidadeLocatario.getText());
        modContrato.setEnderecoLocatario(enderecoLocatario.getText());
        modContrato.setClausulasContrato(clausulasContrato.getText());

        try {
            if (modContrato == null) {
                modContDaoImp.persistir(modContrato);
                JOptionPane.showMessageDialog(null, "Contrado salvo com sucesso!");
                setVisible(false);
            } else {
                modContDaoImp.alterar(modContrato);
                JOptionPane.showMessageDialog(null, "Contrado alterado com sucesso!");
                setVisible(false);
            }
            setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar. \n Erro = " + ex.getMessage());
        }


    }//GEN-LAST:event_salvarContratoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DefinicoesDeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefinicoesDeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefinicoesDeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefinicoesDeContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DefinicoesDeContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea clausulasContrato;
    private javax.swing.JTextField cpfLocatario;
    private javax.swing.JTextField enderecoLocatario;
    private javax.swing.JTextField estadoCivilLocatario;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField locatarioContrato;
    private javax.swing.JTextField nacionalidadeLocatario;
    private javax.swing.JTextField nomeContrato;
    private javax.swing.JTextField orgEmissorRgLocatario;
    private javax.swing.JTextField rgLocatario;
    private javax.swing.JButton salvarContratoBtn;
    // End of variables declaration//GEN-END:variables
}
