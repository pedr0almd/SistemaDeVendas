
package Pck_Control;

import java.time.LocalDate;
import Pck_Model.PedidoModel;

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
}
