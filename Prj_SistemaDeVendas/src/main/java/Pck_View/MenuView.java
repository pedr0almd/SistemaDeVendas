package Pck_View;

import Pck_Control.PedidoControl;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class MenuView extends javax.swing.JFrame {

    private int codigoPedido;

    public MenuView() {
        initComponents();
        // setExtendedState(JFrame.MAXIMIZED_BOTH);

        /*Icone do Botão iniciar venda*/
        ImageIcon iconeProduto = new ImageIcon(getClass().getResource("/imagens/carrinho-de-compras.png"));
        btnIniciarVenda.setIcon(iconeProduto);
        btnIniciarVenda.setVerticalTextPosition(SwingConstants.BOTTOM);   // Texto embaixo da imagem
        btnIniciarVenda.setHorizontalTextPosition(SwingConstants.CENTER);  // Texto centralizado horizontalmente

        /*Icone do Botão clientes*/
        ImageIcon iconeClientes = new ImageIcon(getClass().getResource("/imagens/cliente.png"));
        btnClientes.setIcon(iconeClientes);
        btnClientes.setVerticalTextPosition(SwingConstants.BOTTOM);   // Texto embaixo da imagem
        btnClientes.setHorizontalTextPosition(SwingConstants.CENTER);  // Texto centralizado horizontalmente

        /*Icone do Botão produtos*/
        ImageIcon iconeProdutos = new ImageIcon(getClass().getResource("/imagens/trabalhador-carregando-caixas.png"));
        btnProdutos.setIcon(iconeProdutos);
        btnProdutos.setVerticalTextPosition(SwingConstants.BOTTOM);   // Texto embaixo da imagem
        btnProdutos.setHorizontalTextPosition(SwingConstants.CENTER);  // Texto centralizado horizontalmente

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnIniciarVenda = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 23, 33));

        jPanel1.setBackground(new java.awt.Color(40, 42, 53));

        btnClientes.setBackground(new java.awt.Color(85, 81, 74));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorderPainted(false);               // Remove borda
        btnClientes.setFocusPainted(false);                // Remove destaque de foco
        btnClientes.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnClientes.setOpaque(true);  // Necessário para aplicar o fundo
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnIniciarVenda.setBackground(new java.awt.Color(51, 153, 255));
        btnIniciarVenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIniciarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarVenda.setText("Iniciar Venda");
        btnIniciarVenda.setBorderPainted(false);               // Remove borda
        btnIniciarVenda.setFocusPainted(false);                // Remove destaque de foco
        btnIniciarVenda.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnIniciarVenda.setOpaque(true);  // Necessário para aplicar o fundo
        btnIniciarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarVendaActionPerformed(evt);
            }
        });

        btnProdutos.setBackground(new java.awt.Color(89, 108, 128));
        btnProdutos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setText("Produtos");
        btnIniciarVenda.setBorderPainted(false);               // Remove borda
        btnProdutos.setFocusPainted(false);                // Remove destaque de foco
        btnProdutos.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnProdutos.setOpaque(true);  // Necessário para aplicar o fundo
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnIniciarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIniciarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        this.setVisible(false);
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        this.setVisible(false);
        new ProdutoView().setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnIniciarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVendaActionPerformed

        try {
            // Inicia pedido com cliente 0 ou um valor padrão (cliente ainda não definido)
            PedidoControl pedidoControl = new PedidoControl();
            int codigoPedido = pedidoControl.iniciarNovoPedido(0); // cliente = 0 ou valor que represente "sem cliente"

            if (codigoPedido != -1) {
                JOptionPane.showMessageDialog(this, "Pedido iniciado! Código: " + codigoPedido);
                this.setVisible(false);
                new PedidoView(codigoPedido).setVisible(true); // abre a tela do pedido
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao iniciar pedido.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnIniciarVendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnIniciarVenda;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
