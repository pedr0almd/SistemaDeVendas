package Pck_Control;

import Pck_Model.PedidoModel;
import Pck_Persistencia.PedidoPersistencia;
import java.sql.SQLException;
import java.time.LocalDate;

public class PedidoControl {

    //01- Iniciar pedido
    public int iniciarNovoPedido(int iCodigo_01) {
        PedidoModel objPedidoModel = new PedidoModel();
        objPedidoModel.setA02_data(LocalDate.now());
        objPedidoModel.setA02_valortotal(0.0);
        objPedidoModel.setA01_codigo(iCodigo_01);

        try {
            PedidoPersistencia pedidoPersistencia = new PedidoPersistencia();
            return pedidoPersistencia.inserirPedidoRetornandoId(objPedidoModel); // retorna o ID gerado no banco
        } catch (SQLException e) {
            System.err.println("Erro ao iniciar pedido: " + e.getMessage());
            return -1;
        }
    }

    //03- Atualizar o valor total do pedido
    public boolean atualizarPedido(int iCodigo_01, int iCodigo_02, double dNovoValor) {
        try {
            PedidoPersistencia pedidoPersistencia = new PedidoPersistencia();
            PedidoModel objPedidoModel = pedidoPersistencia.buscarPedidoPorCodigo(iCodigo_02);

            if (objPedidoModel != null) {
                // Atualiza o valor total
                objPedidoModel.setA02_codigo(iCodigo_02);
                objPedidoModel.setA02_valortotal(dNovoValor);
                objPedidoModel.setA01_codigo(iCodigo_01);
                // Salva alteração no banco
                pedidoPersistencia.alterarPedido(objPedidoModel);
                return true;
            } else {
                return false; // Pedido não encontrado
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar valor do pedido: " + e.getMessage());
            return false;
        }
    }

    //04- Apagar pedido
    public void cancelarPedido(int codigoPedido) throws SQLException {
        PedidoPersistencia pedidoPersistencia = new PedidoPersistencia();
        pedidoPersistencia.cancelarPedido(codigoPedido);
    }

    // Buscar valor total de um pedido por código
    public String buscarValorPorCodigo(int codigoPedido) {
        try {
            PedidoPersistencia pedidoPersistencia = new PedidoPersistencia();
            PedidoModel pedido = pedidoPersistencia.buscarPedidoPorCodigo(codigoPedido);

            if (pedido != null) {
                return "Valor total: R$ " + String.format("%.2f", pedido.getA02_valortotal());
            } else {
                return "Pedido não encontrado.";
            }

        } catch (SQLException e) {
            return "Erro ao buscar pedido: " + e.getMessage();
        }
    }

    public void finalizarPedido(int codigoPedido) {
        try {
            PedidoPersistencia persistencia = new PedidoPersistencia();
            persistencia.finalizarPedido(codigoPedido);
        } catch (SQLException e) {
            System.err.println("Erro ao finalizar pedido: " + e.getMessage());
        }
    }

}
