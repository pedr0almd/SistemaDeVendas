package Pck_View;

import Pck_DAO.ProdutoDAO;
import Pck_Model.ProdutoModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaPedido extends javax.swing.JFrame {

    public TelaPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        pnlBackground = new javax.swing.JPanel();
        tfPedido = new javax.swing.JLabel();
        lblCodigoProduto = new javax.swing.JLabel();
        tfCodigoProduto = new javax.swing.JTextField();
        lblCodigoItem = new javax.swing.JLabel();
        tfCodigoItem = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        tfValorUnitario = new javax.swing.JTextField();
        lblValorItem = new javax.swing.JLabel();
        tfValorItem = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnInserirItem = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        tfPedido.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfPedido.setText("Pedido");
        tfPedido.setToolTipText("");

        lblCodigoProduto.setText("Código do Produto");

        lblCodigoItem.setText("Código do item");

        tfCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoItemActionPerformed(evt);
            }
        });

        lblQuantidade.setText("Quantidade (UN)");

        lblDescricao.setText("Descrição");

        tfDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        lblValorUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorUnitario.setText("Valor Unitário (R$)");

        tfValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });

        lblValorItem.setText("Valor Item (R$)");

        tfValorItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserirItem.setText("Inserir item");
        btnInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirItemActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Cod. Item", "Cod. Produto", "Descrição", "Qtde", "Valor Uni.", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(tblPedido);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(26, 26, 26)
                        .addComponent(btnInserirItem)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar)
                        .addGap(52, 52, 52))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoProduto)
                            .addComponent(lblQuantidade)
                            .addComponent(lblCodigoItem)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorUnitario))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValorItem)
                    .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblCodigoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigoItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValorItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFinalizar)
                                    .addComponent(btnInserirItem)
                                    .addComponent(btnConsultar)
                                    .addComponent(btnCancelar))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoItemActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Produto: Café Pelé 500g\nDescrição: Quero caféeeee\nPreço: R$100,00\n", "Consultar valor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirItemActionPerformed

        try {
            int codigoProduto = Integer.parseInt(tfCodigoProduto.getText());
            int quantidade = Integer.parseInt(tfQuantidade.getText());

            ProdutoDAO produtoDAO = new ProdutoDAO();
            ProdutoModel produto = produtoDAO.buscarProdutoPorCodigo(codigoProduto);

            if (produto != null) {
                tfDescricao.setText(produto.getA03_descricao());
                tfValorUnitario.setText(String.valueOf(produto.getA03_valorUnitario()));

                double valorItem = produto.getA03_valorUnitario() * quantidade;
                tfValorItem.setText(String.format("%.2f", valorItem));

                tfCodigoItem.setText(String.valueOf(System.currentTimeMillis()));

                // Insere os dados na tabela
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPedido.getModel();
                model.addRow(new Object[]{
                    tfCodigoItem.getText(),
                    tfCodigoProduto.getText(),
                    tfDescricao.getText(),
                    tfQuantidade.getText(),
                    tfValorUnitario.getText(),
                    tfValorItem.getText()
                });

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos para código e quantidade.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage());
        }


    }//GEN-LAST:event_btnInserirItemActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        javax.swing.JOptionPane.showConfirmDialog(this,
                "Venda finalizada com sucesso! Deseja iniciar outra venda?",
                "Venda Finalizada",
                javax.swing.JOptionPane.YES_NO_OPTION);

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void tfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorUnitarioActionPerformed

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInserirItem;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoItem;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValorItem;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField tfCodigoItem;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JLabel tfPedido;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValorItem;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
