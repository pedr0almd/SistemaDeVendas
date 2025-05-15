package Pck_Persistencia;

import Pck_DAO.ItemDAO;
import Pck_Model.ItemModel;
import java.sql.SQLException;
import java.util.List;

public class ItemPersistencia {

    // Inserir item
    public void inserirItem(ItemModel objClienteModel) {
        try {
            ItemDAO dao = new ItemDAO();
            dao.inserirItem(objClienteModel);
        } catch (SQLException e) {
            System.err.println("Erro ao inserir item: " + e.getMessage());
        }
    }

    // Remover item
    public void removerItem(ItemModel objClienteModel) {
        try {
            ItemDAO dao = new ItemDAO();
            dao.deletarItem(objClienteModel.getA04_codigo());
        } catch (SQLException e) {
            System.err.println("Erro ao remover item: " + e.getMessage());
        }
    }

    // Listar itens (opcional)
    public List<ItemModel> listarItens() {
        try {
            ItemDAO dao = new ItemDAO();
            return dao.listarItens();
        } catch (SQLException e) {
            System.err.println("Erro ao listar itens: " + e.getMessage());
            return null;
        }
    }

}

