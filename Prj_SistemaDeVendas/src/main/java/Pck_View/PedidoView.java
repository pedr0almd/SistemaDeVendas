package Pck_View;

import Pck_DAO.ProdutoDAO;
import Pck_Model.ProdutoModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.BorderFactory;
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
        lblDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
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
        tfPedido1 = new javax.swing.JLabel();
        lblQuantidade1 = new javax.swing.JLabel();
        lblQuantidade2 = new javax.swing.JLabel();
        lblQuantidade3 = new javax.swing.JLabel();
        lblQuantidade4 = new javax.swing.JLabel();
        lblQuantidade5 = new javax.swing.JLabel();
        lblQuantidade6 = new javax.swing.JLabel();
        btnInserirCliente = new javax.swing.JButton();

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

        tfCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoItemActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade.setText("Quantidade (UN)");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descrição");

        tfDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        lblValorUnitario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorUnitario.setForeground(new java.awt.Color(255, 255, 255));
        lblValorUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorUnitario.setText("Valor Unitário (R$)");

        tfValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });

        lblValorItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValorItem.setForeground(new java.awt.Color(255, 255, 255));
        lblValorItem.setText("Valor Item (R$)");

        tfValorItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        tblPedido.setBackground(new java.awt.Color(40, 42, 53));
        tblPedido.setForeground(new java.awt.Color(255, 255, 255));
        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Cod. Item", "Cod. Produto", "Descrição", "Qtde", "Valor Uni.", "Valor Total"
            }

        ));
        // Estilo geral da tabela
        tblPedido.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblPedido.setRowHeight(30);
        tblPedido.setShowGrid(false);
        tblPedido.setIntercellSpacing(new Dimension(0, 0));
        tblPedido.setSelectionBackground(new Color(0x28, 0x2A, 0x35));
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

        tfPedido1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tfPedido1.setForeground(new java.awt.Color(255, 255, 255));
        tfPedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfPedido1.setText("Pedido");
        tfPedido1.setToolTipText("");

        lblQuantidade1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade1.setText("Item");

        lblQuantidade2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade2.setText("Produto");

        lblQuantidade3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade3.setText("Quantidade");

        lblQuantidade4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade4.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade4.setText("Valor Total");

        lblQuantidade5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade5.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade5.setText("Código");

        lblQuantidade6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantidade6.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade6.setText("Subtotal");

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

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescricao)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnConsultarValor)
                                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblCodigoProduto)))
                                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnInserirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblQuantidade)
                                                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCodigoItem)
                                                .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblValorUnitario)
                                                .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(12, 12, 12)
                                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblValorItem)
                                                .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConcluirVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblQuantidade1)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuantidade5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblQuantidade2)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuantidade3)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuantidade6)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuantidade4))
                            .addComponent(scrollTblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(tfPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(lblCodigoProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultarValor)
                            .addComponent(btnInserirItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorItem)
                            .addComponent(lblValorUnitario)
                            .addComponent(lblCodigoItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade1)
                            .addComponent(lblQuantidade2)
                            .addComponent(lblQuantidade3)
                            .addComponent(lblQuantidade4)
                            .addComponent(lblQuantidade5)
                            .addComponent(lblQuantidade6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollTblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInserirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnConcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
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
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new MenuView().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblPedidoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblPedidoAncestorAdded

    }//GEN-LAST:event_tblPedidoAncestorAdded

    private void btnInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirClienteActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JButton btnConcluirVenda;
    private javax.swing.JButton btnConsultarValor;
    private javax.swing.JButton btnInserirCliente;
    private javax.swing.JButton btnInserirItem;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel lblCodigoItem;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblQuantidade1;
    private javax.swing.JLabel lblQuantidade2;
    private javax.swing.JLabel lblQuantidade3;
    private javax.swing.JLabel lblQuantidade4;
    private javax.swing.JLabel lblQuantidade5;
    private javax.swing.JLabel lblQuantidade6;
    private javax.swing.JLabel lblValorItem;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JScrollPane scrollTblPedido;
    private javax.swing.JTable tblPedido;
    private javax.swing.JTextField tfCodigoItem;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JLabel tfPedido;
    private javax.swing.JLabel tfPedido1;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfValorItem;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
