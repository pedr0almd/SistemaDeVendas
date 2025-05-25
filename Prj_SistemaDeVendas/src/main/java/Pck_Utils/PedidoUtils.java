package Pck_Utils;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PedidoUtils {
    public static double calcularValorTotal(JTable tblPedido) {
        double soma = 0.0;

        DefaultTableModel model = (DefaultTableModel) tblPedido.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String valorItemStr = model.getValueAt(i, 4).toString();
            valorItemStr = valorItemStr.replace("R$", "").replace(",", ".").trim();
            try {
                soma += Double.parseDouble(valorItemStr);
            } catch (NumberFormatException ex) {
                System.out.println("Erro ao converter valor: " + valorItemStr);
            }
        }

        return soma;
    }
}
