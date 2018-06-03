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
import com.br.vfbellaver.models.Contrato;
import com.br.vfbellaver.models.Imovel;
import com.br.vfbellaver.models.Inquilino;
import com.br.vfbellaver.models.ModeloContrato;
import com.br.vfbellaver.utils.CriarContratoRecibo;
import com.br.vfbellaver.utils.Impressao;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author vfbellaver
 */
public class ImprimirRecibo extends javax.swing.JFrame {

    /**
     * Creates new form NovoContrato
     */
    public ImprimirRecibo() {
        initComponents();
        iniciaObjetosImp();
        iniciaComboBoxInquilinos();
        iniciaComboBoxModeloContrato();
        iniciaComboBoxImovel();
        iniciaMesReferencia();
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

    private void iniciaMesReferencia() {
        mesReferencia.setModel(new javax.swing.DefaultComboBoxModel(
                new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                    "Junho", "Julho", "Agosto",
                    "Setembro", "Outubro", "Novembro", "Dezembro"}));
        Calendar cal = Calendar.getInstance();
        int data = cal.get(Calendar.YEAR);
        ArrayList<Integer> datas = new ArrayList<>();
        for (int i = 0;; i++) {
            datas.add(data - i);
            if (data - i == 2000) {
                break;
            }
        }
        anoReferencia.setModel(new javax.swing.DefaultComboBoxModel(datas.toArray()));
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
        valorPago = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        localContrato = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gerarContratoBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        modeloContrato = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        imovelSelect = new javax.swing.JComboBox<>();
        cancelarContratoBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dataPagamento = new com.toedter.calendar.JDateChooser();
        anoReferencia = new javax.swing.JComboBox<>();
        mesReferencia = new javax.swing.JComboBox<>();

        jLabel4.setText("jLabel4");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/contrato.png"))); // NOI18N
        jLabel1.setText("Recibo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("locatário:");

        locatarioSelect.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        locatarioSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Valor Pago");

        valorPago.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        valorPago.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        valorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPagoActionPerformed(evt);
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
        jLabel6.setText("Mês de Referencia");

        gerarContratoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gerarContratoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/imprimir.png"))); // NOI18N
        gerarContratoBtn.setText("Gerar para Imprimir");
        gerarContratoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarContratoBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Contrato:");

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Data do Pagamento:");

        dataPagamento.setFocusable(false);
        dataPagamento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        anoReferencia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        anoReferencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano" }));

        mesReferencia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        mesReferencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelarContratoBtn)
                        .addGap(26, 26, 26)
                        .addComponent(gerarContratoBtn))
                    .addComponent(valorPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locatarioSelect, javax.swing.GroupLayout.Alignment.LEADING, 0, 644, Short.MAX_VALUE)
                    .addComponent(localContrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modeloContrato, javax.swing.GroupLayout.Alignment.LEADING, 0, 644, Short.MAX_VALUE)
                    .addComponent(imovelSelect, javax.swing.GroupLayout.Alignment.LEADING, 0, 644, Short.MAX_VALUE)
                    .addComponent(dataPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(mesReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 131, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(locatarioSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(anoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerarContratoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarContratoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPagoActionPerformed

    private void gerarContratoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarContratoBtnActionPerformed
        // VERIFICANDO SE TODOS OS CAMPOS ESTÃO PREENCHIDOS
        if (modeloContrato.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione um modelo de contrato.");
            return;
        }
        if (imovelSelect.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o endereço do imóvel.");
            return;
        }
        if (locatarioSelect.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione um locatário.");
            return;
        }

        if (valorPago.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o valor do Aluguel.");
            return;
        }
        if (localContrato.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o local de assinatura.");
            return;
        }
        if (dataPagamento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Selecione a data de assinatura.");
            return;
        }
        ModeloContrato con = (ModeloContrato) modeloContrato.getSelectedItem();
        Inquilino inquilino = (Inquilino) locatarioSelect.getSelectedItem();
        Imovel imovel = (Imovel) imovelSelect.getSelectedItem();
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        String dataExtensoContrato;
        int index;
        int lenght;
        
        String contrato = "Recebi de " + inquilino.getNome() + ", " + inquilino.getProfissao() + ", "
                + "inscrito(a) no CPF sob o nº " + inquilino.getCpf() + ", a importância de R$ " + valorPago.getText() + ", "
                + "referente ao pagamento do aluguel do mês de " + mesReferencia.getSelectedItem() + " de "
                + anoReferencia.getSelectedItem() + " concernemente ao"
                + " imóvel localizado à " + imovel.getEndereco();

        CriarContratoRecibo cContrato = new CriarContratoRecibo();
        // FORMATO A DATA, O FORMATADOR ME RETORNA 
        // A STRING DA DATA FORMATADA 
        dataExtensoContrato = formatador.format(dataPagamento.getDate());
        index = dataExtensoContrato.indexOf(",");
        lenght = dataExtensoContrato.length();

        File documento = cContrato.criarPDFRecibo(con, inquilino, contrato,
                localContrato.getText(), dataExtensoContrato.substring(++index, lenght));
        
        FileInputStream fis;
        try {
            fis = new FileInputStream(documento);
            Impressao printPDFFile = new Impressao(fis, "NOME ARQUIVO");
            printPDFFile.print();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PrinterException ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_gerarContratoBtnActionPerformed

    private void cancelarContratoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarContratoBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelarContratoBtnActionPerformed

    private void localContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localContratoActionPerformed

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
            java.util.logging.Logger.getLogger(ImprimirRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ImprimirRecibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anoReferencia;
    private javax.swing.JButton cancelarContratoBtn;
    private com.toedter.calendar.JDateChooser dataPagamento;
    private javax.swing.JButton gerarContratoBtn;
    private javax.swing.JComboBox<String> imovelSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField localContrato;
    private javax.swing.JComboBox<String> locatarioSelect;
    private javax.swing.JComboBox<String> mesReferencia;
    private javax.swing.JComboBox<String> modeloContrato;
    private javax.swing.JTextField valorPago;
    // End of variables declaration//GEN-END:variables
}
