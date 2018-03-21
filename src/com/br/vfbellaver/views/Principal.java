/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.vfbellaver.views;

import com.br.vfbellaver.Implements.ContratoDaoImp;
import com.br.vfbellaver.Implements.ImovelDaoImp;
import com.br.vfbellaver.Implements.InquilinoDaoImp;
import com.br.vfbellaver.models.Inquilino;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vfbellaver
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        iniciaObjetosImp();
        iniciaTabelaInquilino();
    }

    InquilinoDaoImp inqDaoImp;
    ContratoDaoImp contDaoImp;
    ImovelDaoImp imovDaoImp;

    private void iniciaObjetosImp() {
        inqDaoImp = new InquilinoDaoImp();
        contDaoImp = new ContratoDaoImp();
        imovDaoImp = new ImovelDaoImp();
    }

    public void iniciaTabelaInquilino() {
        try {

            List<Inquilino> listaInquilinos = inqDaoImp.listarTodos(Inquilino.class);
            DefaultTableModel dtmInquilinos = (DefaultTableModel) tabela_inquilinos.getModel();
            dtmInquilinos.setNumRows(0);
            for (int i = 0; i < listaInquilinos.size(); i++) {
                System.out.println("NOVO CADASTRO - "+ listaInquilinos.get(i).getNome());
                Object dados[] = {
                    listaInquilinos.get(i).getNome(),
                    listaInquilinos.get(i).getCpf(),
                    listaInquilinos.get(i).getTelefone()
                };
                dtmInquilinos.addRow(dados);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void limpaTabela(){
        DefaultTableModel dtm = (DefaultTableModel) tabela_inquilinos.getModel();
        dtm.setNumRows(0);
        iniciaTabelaInquilino();
        System.out.println("CHEGUEI AQUI");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_inquilinos = new javax.swing.JTable();
        menuControleKitnets = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        exit_system = new javax.swing.JMenuItem();
        menuLocatario = new javax.swing.JMenu();
        cadInquilinoSmenu = new javax.swing.JMenuItem();
        listInquilinoSmenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        cadKitnetSmenu = new javax.swing.JMenuItem();
        listaKitnetsSmenu = new javax.swing.JMenuItem();
        novoContrato = new javax.swing.JMenu();
        novoContratoSmenu = new javax.swing.JMenuItem();
        definicoesContratoSmenu = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        novoRecibo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista dos inquilinos ");

        tabela_inquilinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Tel", "Inicio do Contrato"
            }
        ));
        jScrollPane1.setViewportView(tabela_inquilinos);

        menuControleKitnets.setMaximumSize(new java.awt.Dimension(400, 32769));
        menuControleKitnets.setMinimumSize(new java.awt.Dimension(80, 26));
        menuControleKitnets.setPreferredSize(new java.awt.Dimension(349, 38));
        menuControleKitnets.setRequestFocusEnabled(false);

        menuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/config-icon.png"))); // NOI18N
        menuSistema.setText("Sistema");

        exit_system.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit_system.setText("Sair");
        exit_system.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_systemActionPerformed(evt);
            }
        });
        menuSistema.add(exit_system);

        menuControleKitnets.add(menuSistema);

        menuLocatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/inquilino.png"))); // NOI18N
        menuLocatario.setText("Locatário");

        cadInquilinoSmenu.setText("Cadastrar");
        cadInquilinoSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadInquilinoSmenuActionPerformed(evt);
            }
        });
        menuLocatario.add(cadInquilinoSmenu);

        listInquilinoSmenu.setText("Listar todos");
        listInquilinoSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listInquilinoSmenuActionPerformed(evt);
            }
        });
        menuLocatario.add(listInquilinoSmenu);

        menuControleKitnets.add(menuLocatario);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/house-icon.png"))); // NOI18N
        jMenu3.setText("Kitnets");

        cadKitnetSmenu.setText("Cadastrar");
        cadKitnetSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadKitnetSmenuActionPerformed(evt);
            }
        });
        jMenu3.add(cadKitnetSmenu);

        listaKitnetsSmenu.setText("Listar todas");
        listaKitnetsSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaKitnetsSmenuActionPerformed(evt);
            }
        });
        jMenu3.add(listaKitnetsSmenu);

        menuControleKitnets.add(jMenu3);

        novoContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/contrato-icon.png"))); // NOI18N
        novoContrato.setText("Contratos");

        novoContratoSmenu.setText("Novo contrato");
        novoContratoSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoContratoSmenuActionPerformed(evt);
            }
        });
        novoContrato.add(novoContratoSmenu);

        definicoesContratoSmenu.setText("Definições de Contrato");
        definicoesContratoSmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definicoesContratoSmenuActionPerformed(evt);
            }
        });
        novoContrato.add(definicoesContratoSmenu);

        menuControleKitnets.add(novoContrato);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/recibo_icon2.png"))); // NOI18N
        jMenu5.setText("Recibos");

        novoRecibo.setText("Gerar Recibo");
        jMenu5.add(novoRecibo);

        menuControleKitnets.add(jMenu5);

        setJMenuBar(menuControleKitnets);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadInquilinoSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadInquilinoSmenuActionPerformed
        CadastroInquilino cad = new CadastroInquilino();
        cad.setVisible(true);
    }//GEN-LAST:event_cadInquilinoSmenuActionPerformed

    private void listInquilinoSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listInquilinoSmenuActionPerformed
        ListaInquilinos list = new ListaInquilinos();
        list.setVisible(true);
    }//GEN-LAST:event_listInquilinoSmenuActionPerformed

    private void listaKitnetsSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaKitnetsSmenuActionPerformed
        ListaKitnets listk = new ListaKitnets();
        listk.setVisible(true);
    }//GEN-LAST:event_listaKitnetsSmenuActionPerformed

    private void exit_systemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_systemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_systemActionPerformed

    private void definicoesContratoSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definicoesContratoSmenuActionPerformed
        DefinicoesDeContrato def = new DefinicoesDeContrato();
        def.setVisible(true);
    }//GEN-LAST:event_definicoesContratoSmenuActionPerformed

    private void cadKitnetSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadKitnetSmenuActionPerformed
        CadastroKitnet cadkit = new CadastroKitnet();
        cadkit.setVisible(true);
    }//GEN-LAST:event_cadKitnetSmenuActionPerformed

    private void novoContratoSmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoContratoSmenuActionPerformed
        NovoContrato novoContrato = new NovoContrato();
        novoContrato.setVisible(true);
    }//GEN-LAST:event_novoContratoSmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadInquilinoSmenu;
    private javax.swing.JMenuItem cadKitnetSmenu;
    private javax.swing.JMenuItem definicoesContratoSmenu;
    private javax.swing.JMenuItem exit_system;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listInquilinoSmenu;
    private javax.swing.JMenuItem listaKitnetsSmenu;
    private javax.swing.JMenuBar menuControleKitnets;
    private javax.swing.JMenu menuLocatario;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenu novoContrato;
    private javax.swing.JMenuItem novoContratoSmenu;
    private javax.swing.JMenuItem novoRecibo;
    private javax.swing.JTable tabela_inquilinos;
    // End of variables declaration//GEN-END:variables

}
