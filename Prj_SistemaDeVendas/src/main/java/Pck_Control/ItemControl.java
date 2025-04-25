package Pck_Control;

import Pck_Model.ItemModel;

public class ItemControl {
    ItemModel objItensModel = new ItemModel();

    public void inserirItem (int iQuantidade, double dValoritem ){
        objItensModel.setA04_quantidade(iQuantidade);
        objItensModel.setA04_valoritem(dValoritem);
    }

    public void atualizarPedido(int iCodigo_04, int iQuantidade, double dValoritem){
        objItensModel.setA04_codigo(iCodigo_04);
        objItensModel.setA04_quantidade(iQuantidade);
        objItensModel.setA04_valoritem(dValoritem);
    }

    public void removerCliente(int iCodigo_04){
        objItensModel.setA04_codigo(iCodigo_04);
    }

}