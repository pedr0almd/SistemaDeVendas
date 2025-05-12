package Pck_View;

import Pck_DAO.ProdutoDAO;
import Pck_Model.ProdutoModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class PedidoView extends javax.swing.JFrame {

    public PedidoView() {
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
        lblProduto = new javax.swing.JLabel();
        tfProduto = new javax.swing.JTextField();
        lblValorUnitario = new javax.swing.JLabel();
        tfValorUnitario = new javax.swing.JTextField();
        lblValorItem = new javax.swing.JLabel();
        tfValorItem = new javax.swing.JTextField();
        btnConsultarValor = new javax.swing.JButton();
        btnInserirItem = new javax.swing.JButton();
        scrollTblPedido = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        btnConcluirVenda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JToggleButton();
        lblItemTabela = new javax.swing.JLabel();
        lblProdutoTabela = new javax.swing.JLabel();
        lblQuantidadeTabela = new javax.swing.JLabel();
        lblValorItemTabela = new javax.swing.JLabel();
        lblCodigoTabela = new javax.swing.JLabel();
        btnInserirCliente = new javax.swing.JButton();
        tfPedido1 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(40, 42, 53));

        tfPedido.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tfPedido.setForeground(new java.awt.Color(255, 255, 255));
        tfPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tfPedido.setText("Último item");
        tfPedido.setToolTipText("");

        lblCodigoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoProduto.setText("Código do Produto");

        lblCodigoItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoItem.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoItem.setText("Código do item");

        tfCodigoItem.setBackground(new java.awt.Color(204, 204, 204));
        tfCodigoItem.setForeground(new java.awt.Color(102, 102, 102));
        tfCodigoItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoItemActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade.setText("Quantidade (UN)");

        lblProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(255, 255, 255));
        lblProduto.setText("Produto");

        tfProduto.setBackground(new java.awt.Color(204, 204, 204));
        tfProduto.setForeground(new java.awt.Color(102, 102, 102));
        tfProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProdutoActionPerformed(evt);
            }
        });

        lblValorUnitario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorUnitario.setForeground(new java.awt.Color(255, 255, 255));
        lblValorUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorUnitario.setText("Valor Unitário");

        tfValorUnitario.setBackground(new java.awt.Color(204, 204, 204));
        tfValorUnitario.setForeground(new java.awt.Color(102, 102, 102));
        tfValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });

        lblValorItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorItem.setForeground(new java.awt.Color(255, 255, 255));
        lblValorItem.setText("Valor Item ");

        tfValorItem.setBackground(new java.awt.Color(204, 204, 204));
        tfValorItem.setForeground(new java.awt.Color(102, 102, 102));
        tfValorItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorItemActionPerformed(evt);
            }
        });

        btnConsultarValor.setBackground(new java.awt.Color(85, 81, 74));
        btnConsultarValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultarValor.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarValor.setText("Consultar Valor");
        btnConsultarValor.setBorderPainted(false);               // Remove borda
        btnConsultarValor.setFocusPainted(false);                // Remove destaque de foco
        btnConsultarValor.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnConsultarValor.setOpaque(true);  // Necessário para aplicar o fundo
        btnConsultarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarValorActionPerformed(evt);
            }
        });

        btnInserirItem.setBackground(new java.awt.Color(0, 153, 255));
        btnInserirItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInserirItem.setForeground(new java.awt.Color(255, 255, 255));
        btnInserirItem.setText("+ Inserir item");
        btnInserirItem.setBorderPainted(false);               // Remove borda
        btnInserirItem.setFocusPainted(false);                // Remove destaque de foco
        btnInserirItem.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnInserirItem.setOpaque(true);  // Necessário para aplicar o fundo
        btnInserirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirItemActionPerformed(evt);
            }
        });

        // Estilizar a barra de rolagem vertical
        scrollTblPedido.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(100, 100, 255); // Cor da "pegada" do scroll
            }
        });

        // Corrigir fundo da área "vazia" da tabela
        scrollTblPedido.getViewport().setBackground(Color.WHITE);

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Cod. Item", "Cod. Produto", "Descrição", "Qtde", "Valor Total"
            }
        ) );
        // Estilo geral da tabela
        tblPedido.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblPedido.setRowHeight(30);
        tblPedido.setShowGrid(false);
        tblPedido.setIntercellSpacing(new Dimension(0, 0));
        tblPedido.setSelectionBackground(new Color(0x55, 0x51, 0x4A));
        tblPedido.setSelectionForeground(Color.WHITE);

        tblPedido.setTableHeader(null);
        tblPedido.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblPedidoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        scrollTblPedido.setViewportView(tblPedido);
        // Remove a borda padrão do scroll (opcional, para ficar mais limpo)
        scrollTblPedido.setBorder(BorderFactory.createEmptyBorder());

        btnConcluirVenda.setBackground(new java.awt.Color(51, 153, 255));
        btnConcluirVenda.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnConcluirVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnConcluirVenda.setText("Concluir Venda");
        btnConcluirVenda.setBorderPainted(false);               // Remove borda
        btnConcluirVenda.setFocusPainted(false);                // Remove destaque de foco
        btnConcluirVenda.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnConcluirVenda.setOpaque(true);  // Necessário para aplicar o fundo
        btnConcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirVendaActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);               // Remove borda
        btnCancelar.setFocusPainted(false);                // Remove destaque de foco
        btnCancelar.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnCancelar.setOpaque(true);  // Necessário para aplicar o fundo
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblItemTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblItemTabela.setForeground(new java.awt.Color(255, 255, 255));
        lblItemTabela.setText("Item");

        lblProdutoTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProdutoTabela.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutoTabela.setText("Produto");

        lblQuantidadeTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidadeTabela.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidadeTabela.setText("Quantidade");

        lblValorItemTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorItemTabela.setForeground(new java.awt.Color(255, 255, 255));
        lblValorItemTabela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorItemTabela.setText("Valor Item");

        lblCodigoTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoTabela.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoTabela.setText("Código");

        btnInserirCliente.setBackground(new java.awt.Color(40, 42, 53));
        btnInserirCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInserirCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnInserirCliente.setText("Inserir cliente");
        btnInserirCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        //btnConsultar.setBorderPainted(false);               // Remove borda
        btnInserirCliente.setFocusPainted(false);                // Remove destaque de foco
        btnInserirCliente.setContentAreaFilled(false);           // Remove preenchimento padrão
        btnInserirCliente.setOpaque(true);  // Necessário para aplicar o fundo
        btnInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirClienteActionPerformed(evt);
            }
        });

        tfPedido1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfPedido1.setForeground(new java.awt.Color(255, 255, 255));
        tfPedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfPedido1.setText("Pedido");
        tfPedido1.setToolTipText("");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(tfPedido1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigoItem)
                                    .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorUnitario)
                                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValorItem)))
                            .addComponent(tfProduto)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProduto))
                                .addGap(230, 230, 230))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConsultarValor)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigoProduto)
                                .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInserirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantidade)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTblPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblItemTabela)
                        .addGap(91, 91, 91)
                        .addComponent(lblCodigoTabela)
                        .addGap(81, 81, 81)
                        .addComponent(lblProdutoTabela)
                        .addGap(66, 66, 66)
                        .addComponent(lblQuantidadeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblValorItemTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(btnInserirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcluirVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tfPedido1)
                        .addGap(61, 61, 61)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblCodigoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultarValor)
                            .addComponent(btnInserirItem))
                        .addGap(77, 77, 77)
                        .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorItem)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblCodigoItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItemTabela)
                            .addComponent(lblProdutoTabela)
                            .addComponent(lblQuantidadeTabela)
                            .addComponent(lblCodigoTabela)
                            .addComponent(lblValorItemTabela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollTblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        tfCodigoItem.setEditable(false);
        tfProduto.setEditable(false);
        tfValorUnitario.setEditable(false);
        tfValorItem.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoItemActionPerformed

    private void btnConsultarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarValorActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Produto: Café Pelé 500g\nDescrição: Quero caféeeee\nPreço: R$100,00\n", "Consultar valor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConsultarValorActionPerformed

    private void btnInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirItemActionPerformed

        try {
            int codigoProduto = Integer.parseInt(tfCodigoProduto.getText());
            int quantidade = Integer.parseInt(tfQuantidade.getText());

            ProdutoDAO produtoDAO = new ProdutoDAO();
            ProdutoModel produto = produtoDAO.buscarProdutoPorCodigo(codigoProduto);

            if (produto != null) {
                tfProduto.setText(produto.getA03_descricao());

                // Formata o valor unitário com "R$" e duas casas decimais
                String valorUnitarioFormatado = String.format("R$ %.2f", produto.getA03_valorUnitario()).replace(".", ",");
                tfValorUnitario.setText(valorUnitarioFormatado);

                // Calcula e formata o valor do item (valor unitário x quantidade)
                double valorItem = produto.getA03_valorUnitario() * quantidade;
                String valorItemFormatado = String.format("R$ %.2f", valorItem).replace(".", ",");
                tfValorItem.setText(valorItemFormatado);

                tfCodigoItem.setText(String.valueOf(System.currentTimeMillis()));

                // Insere os dados na tabela
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPedido.getModel();
                model.addRow(new Object[]{
                    tfCodigoItem.getText(),
                    tfCodigoProduto.getText(),
                    tfProduto.getText(),
                    tfQuantidade.getText(),
                    valorItemFormatado
                });

                atualizarValorTotal();

                DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
                centralizado.setHorizontalAlignment(SwingConstants.CENTER);

// Aplica o renderizador para todas as colunas
                for (int i = 0; i < tblPedido.getColumnCount(); i++) {
                    tblPedido.getColumnModel().getColumn(i).setCellRenderer(centralizado);
                }

                tblPedido.setDefaultEditor(Object.class, null);

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite valores válidos para código e quantidade.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage());
        }


    }//GEN-LAST:event_btnInserirItemActionPerformed

    private void btnConcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirVendaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this,
                "Venda finalizada com sucesso! Deseja iniciar outra venda?",
                "Venda Finalizada",
                JOptionPane.YES_NO_OPTION);

// Se o usuário clicar "Não" (valor retornado é JOptionPane.NO_OPTION)
        if (resposta == JOptionPane.NO_OPTION) {
            // Abre o menu
            new MenuView().setVisible(true);

            // Fecha a tela atual (assumindo que está em TelaVenda, por exemplo)
            this.dispose();
        }


    }//GEN-LAST:event_btnConcluirVendaActionPerformed

    private void tfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorUnitarioActionPerformed

    private void tfProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProdutoActionPerformed
        tfProduto.setEditable(false);
    }//GEN-LAST:event_tfProdutoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new MenuView().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblPedidoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblPedidoAncestorAdded

    }//GEN-LAST:event_tblPedidoAncestorAdded

    private void btnInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirClienteActionPerformed

    private void tfValorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorItemActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PedidoView().setVisible(true);
            }
        });
    }

    private void atualizarValorTotal() {
        double soma = 0.0;

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblPedido.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String valorItemStr = model.getValueAt(i, 4).toString();
            valorItemStr = valorItemStr.replace("R$", "").replace(",", ".").trim();
            try {
                soma += Double.parseDouble(valorItemStr);
            } catch (NumberFormatException ex) {
                System.out.println("Erro ao converter valor: " + valorItemStr);
            }
        }

        btnConcluirVenda.setText("Concluir Venda (R$ " + String.format("%.2f", soma).replace(".", ",") + ")");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnConsultarValor;
    private javax.swing.JButton btnInserirCliente;
    private javax.swing.JButton btnInserirItem;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblCodigoItem;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblCodigoTabela;
    private javax.swing.JLabel lblItemTabela;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblProdutoTabela;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblQuantidadeTabela;
    private javax.swing.JLabel lblValorItem;
    private javax.swing.JLabel lblValorItemTabela;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrollTblPedido;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField tfCodigoItem;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JLabel tfPedido;
    private javax.swing.JLabel tfPedido1;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValorItem;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
