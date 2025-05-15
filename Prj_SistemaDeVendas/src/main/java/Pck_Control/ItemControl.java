package Pck_Control;

import Pck_Model.ItemModel;
import Pck_Persistencia.ItemPersistencia;
import java.sql.SQLException;

public class ItemControl {

public void inserirItem( int iCodigo_03, int iCodigo_02, int iQuantidade, double dValorItem) {
    ItemModel objClienteModel = new ItemModel(); // Aqui você pode lançar RuntimeException, ou usar JOptionPane para avisar, dependendo da camada de UI
    objClienteModel.setA03_codigo(iCodigo_03);
    objClienteModel.setA02_codigo(iCodigo_02);
    objClienteModel.setA04_quantidade(iQuantidade);
    objClienteModel.setA04_valoritem(dValorItem);
    ItemPersistencia persistencia = new ItemPersistencia();
    persistencia.inserirItem(objClienteModel);
}


    public void removerItem(int iCodigo_04) {
        ItemModel objClienteModel = new ItemModel();
        objClienteModel.setA04_codigo(iCodigo_04);

        ItemPersistencia persistencia = new ItemPersistencia();
        persistencia.removerItem(objClienteModel);
    }
    
}
