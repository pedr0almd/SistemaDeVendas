package Pck_Control;

import Pck_DAO.PedidoDAO;
import java.time.LocalDate;
import Pck_Model.PedidoModel;
import java.sql.Connection;
import java.sql.SQLException;

public class PedidoControl {
    PedidoModel objPedidoModel = new PedidoModel();
    
    public void inserirPedido (double dValorTotal, LocalDate ldData, int iCodigo_01){
        objPedidoModel.setA02_valortotal(dValorTotal);
        objPedidoModel.setA02_data(ldData);
        objPedidoModel.setA01_codigo(iCodigo_01);
    }
    
    public void atualizarPedido(int iCodigo_02, double dValorTotal){
        objPedidoModel.setA02_codigo(iCodigo_02);
        objPedidoModel.setA02_valortotal(dValorTotal);
    }
    
    public void removerPedido(int iCodigo_02){
        objPedidoModel.setA02_codigo(iCodigo_02);
    }
    
    public String buscarValorPorCodigo(int iCodigo_02) {
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            PedidoModel pedido = pedidoDAO.buscarPedidoPorCodigo(iCodigo_02);
            if (pedido != null) {
                return "Valor total: R$ " + String.format("%.2f", pedido.getA02_valortotal());
            } else {
                return "Pedido não encontrado.";
            }
        } catch (SQLException e) {
            return "Erro ao buscar pedido: " + e.getMessage();
        }
    }
}
