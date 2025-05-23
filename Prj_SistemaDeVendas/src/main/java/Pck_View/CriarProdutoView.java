package Pck_View;

import Pck_Control.ProdutoControl;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CriarProdutoView extends javax.swing.JFrame {


    public CriarProdutoView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        pnlBackground = new java.awt.Panel();
        tfEstoque = new javax.swing.JTextField();
        tfCodigoProduto = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        tfValorUnitario = new javax.swing.JTextField();
        btnInserir = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        lblAdicionarProduto = new javax.swing.JLabel();
        lblCodigoProduto = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 42, 53));

        pnlBackground.setBackground(new java.awt.Color(40, 42, 53));
        pnlBackground.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        pnlBackground.setForeground(new java.awt.Color(255, 255, 255));

        tfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoProdutoActionPerformed(evt);
            }
        });

        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(51, 153, 255));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText(" Salvar");
        btnInserir.setBorderPainted(false);               // Remove borda
        btnInserir.setFocusPainted(false);                // Remove destaque de foco
        btnInserir.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnInserir.setOpaque(true);  // Necessário para aplicar o fundo
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCancelar.setText(" Cancelar");
        btnCancelar.setBackground(Color.WHITE);            // Fundo branco
        btnCancelar.setForeground(Color.BLACK);            // Cor do texto (pode ser branco se quiser invisível)
        btnCancelar.setBorderPainted(false);               // Remove borda
        btnCancelar.setFocusPainted(false);                // Remove destaque de foco
        btnCancelar.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnCancelar.setOpaque(true);  // Necessário para aplicar o fundo
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblAdicionarProduto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblAdicionarProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdicionarProduto.setText("Adicionar Produto");
        lblAdicionarProduto.setToolTipText("");

        lblCodigoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoProduto.setText("Código");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descrição");

        lblValorUnitario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorUnitario.setForeground(new java.awt.Color(255, 255, 255));
        lblValorUnitario.setText("Valor Unitário (R$)");

        lblEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lblEstoque.setText("Estoque (UN)");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoProduto)
                            .addComponent(lblDescricao)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblEstoque)))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(lblAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lblCodigoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblValorUnitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoProdutoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            String sDescricao = tfDescricao.getText();
            double dValorUnitario = Double.parseDouble(tfValorUnitario.getText());
            int iEstoque = Integer.parseInt(tfEstoque.getText());

            ProdutoControl produtoControl = new ProdutoControl();
            produtoControl.inserirProduto(sDescricao, dValorUnitario, iEstoque);

            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");

            // Redirecionar tela para a tabela
            this.setVisible(false);
            new ProdutoView().setVisible(true);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conversão: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void tfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorUnitarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new ProdutoView().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnInserir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lblAdicionarProduto;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblValorUnitario;
    private java.awt.Panel pnlBackground;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
