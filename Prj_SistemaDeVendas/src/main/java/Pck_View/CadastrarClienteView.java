package Pck_View;

import Pck_DAO.ClienteDAO;
import Pck_Model.ClienteModel;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import static java.time.InstantSource.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class CadastrarClienteView extends javax.swing.JFrame {

    public CadastrarClienteView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new java.awt.Panel();
        tfCPF = new javax.swing.JTextField();
        tfNomeCompleto = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfCredito = new javax.swing.JTextField();
        lblCadastroCliente = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCredito = new javax.swing.JLabel();
        btnInserir = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(40, 42, 53));

        tfCPF.setBorder(null);
        // Torna o fundo transparente
        tfCPF.setBackground(new Color(0, 0, 0, 0));  // (R, G, B, A) - A=0 para totalmente transparente

        // Define uma borda branca
        tfCPF.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        // Se você quiser que o texto também tenha cor, defina a cor do texto
        tfCPF.setForeground(Color.WHITE);  // Texto branco
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        // Torna o fundo transparente
        tfNomeCompleto.setBackground(new Color(0, 0, 0, 0));  // (R, G, B, A) - A=0 para totalmente transparente

        // Define uma borda branca
        tfNomeCompleto.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        // Se você quiser que o texto também tenha cor, defina a cor do texto
        tfNomeCompleto.setForeground(Color.WHITE);  // Texto branco
        tfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCompletoActionPerformed(evt);
            }
        });

        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        tfCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCreditoActionPerformed(evt);
            }
        });

        lblCadastroCliente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCliente.setText("CADASTRAR CLIENTE");
        lblCadastroCliente.setToolTipText("");

        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF (Somente números)");

        lblNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setText("Nome Completo");

        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");

        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone");

        lblCredito.setForeground(new java.awt.Color(255, 255, 255));
        lblCredito.setText("Crédito");

        btnInserir.setBackground(new java.awt.Color(51, 153, 255));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setText("Salvar");
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

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(0, 262, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCompleto)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelefone)
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(328, 328, 328))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCredito)
                            .addComponent(tfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndereco))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblNomeCompleto)
                .addGap(10, 10, 10)
                .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCompletoActionPerformed

    }//GEN-LAST:event_tfNomeCompletoActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void tfCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCreditoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        try {
            // Captura os dados da tela
            String nomeCompleto = tfNomeCompleto.getText();
            String endereco = tfEndereco.getText();
            String telefone = tfTelefone.getText();
            String cpf = tfCPF.getText();
            double credito = Double.parseDouble(tfCredito.getText());

            // Cria o modelo
            ClienteModel cliente = new ClienteModel();
            cliente.setA01_nome(nomeCompleto);
            cliente.setA01_endereco(endereco);
            cliente.setA01_telefone(telefone);
            cliente.setA01_cpf(cpf);
            cliente.setA01_credito(credito);

            // Cria o DAO e chama o método de inserção
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserirCliente(cliente);

            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");

        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente: " + ex.getMessage());
        }


    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CadastrarClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnInserir;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastroCliente;
    private javax.swing.JLabel lblCredito;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblTelefone;
    private java.awt.Panel pnlBackground;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCredito;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
