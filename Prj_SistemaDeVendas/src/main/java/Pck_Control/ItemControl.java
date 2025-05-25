package Pck_Control;

import Pck_Model.ItemModel;
import Pck_Persistencia.ItemPersistencia;
import java.sql.SQLException;

public class ItemControl {

    public void inserirItem(int iCodigo_02, int iCodigo_03, int iItem, int iQuantidade, double dValorItem) throws SQLException {
        ItemModel objItemModel = new ItemModel();
        objItemModel.setA03_codigo(iCodigo_02);
        objItemModel.setA02_codigo(iCodigo_03);
        objItemModel.setA04_item(iItem);
        objItemModel.setA04_quantidade(iQuantidade);
        objItemModel.setA04_valoritem(dValorItem);

        ItemPersistencia persistencia = new ItemPersistencia();
        persistencia.inserirItem(objItemModel); 
    }

    public void removerItem(int iCodigo_04) throws SQLException {
        ItemModel objItemModel = new ItemModel();
        objItemModel.setA04_codigo(iCodigo_04);

        ItemPersistencia persistencia = new ItemPersistencia();
        persistencia.apagarItem(objItemModel);
    }

}
