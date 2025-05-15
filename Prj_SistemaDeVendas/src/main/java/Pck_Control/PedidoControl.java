package Pck_Control;

import Pck_DAO.PedidoDAO;
import Pck_Model.PedidoModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class PedidoControl {

    // Iniciar novo pedido no banco de dados e retornar o código gerado
    public int iniciarNovoPedido(int codigoCliente) {
        PedidoModel pedido = new PedidoModel();
        pedido.setA02_data(LocalDate.now()); // data atual
        pedido.setA02_valortotal(0.0); // valor inicial do pedido
        pedido.setA01_codigo(codigoCliente); // cliente associado

        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            return pedidoDAO.inserirPedidoRetornandoId(pedido); // retorna o ID gerado no banco
        } catch (SQLException e) {
            System.err.println("Erro ao iniciar pedido: " + e.getMessage());
            return -1;
        }
    }

    // Atualizar o valor total do pedido
    public boolean atualizarValorPedido(int codigoPedido, double novoValorTotal) {
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            PedidoModel pedido = pedidoDAO.buscarPedidoPorCodigo(codigoPedido);

            if (pedido != null) {
                pedido.setA02_valortotal(novoValorTotal);
                pedidoDAO.alterarPedido(pedido);
                return true;
            } else {
                System.err.println("Pedido não encontrado para atualização.");
                return false;
            }

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar pedido: " + e.getMessage());
            return false;
        }
    }

    // Remover um pedido
    public boolean removerPedido(int codigoPedido) {
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.deletarPedido(codigoPedido);
            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao remover pedido: " + e.getMessage());
            return false;
        }
    }

    // Buscar valor total de um pedido por código
    public String buscarValorPorCodigo(int codigoPedido) {
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            PedidoModel pedido = pedidoDAO.buscarPedidoPorCodigo(codigoPedido);

            if (pedido != null) {
                return "Valor total: R$ " + String.format("%.2f", pedido.getA02_valortotal());
            } else {
                return "Pedido não encontrado.";
            }

        } catch (SQLException e) {
            return "Erro ao buscar pedido: " + e.getMessage();
        }
    }

    public void atualizarValorTotal(int codigoPedido, double valorTotal) throws SQLException {
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.atualizarValorTotal(codigoPedido, valorTotal);
    }

    public void finalizarPedido(int codigoPedido) {
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            pedidoDAO.finalizarPedido(codigoPedido);
        } catch (SQLException e) {
            System.err.println("Erro ao finalizar pedido: " + e.getMessage());
        }
    }

}
