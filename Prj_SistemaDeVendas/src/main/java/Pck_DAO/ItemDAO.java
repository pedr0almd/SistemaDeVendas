package Pck_DAO;

import Pck_Model.ItemModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    private final Connection connection;

    public ItemDAO() throws SQLException {
        this.connection = new ConexaoMySql().getConnection();
    }

    // Inserir Item
    public void inserirItem(ItemModel item) throws SQLException {
        String sql = "CALL PROC_InsITENS(?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getA02_codigo());  // Pedido
            stmt.setInt(2, item.getA03_codigo());  // Produto
            stmt.setInt(3, item.getA04_quantidade());
            stmt.setDouble(4, item.getA04_valoritem());
            stmt.executeUpdate();
        }
    }

    // Listar Itens
    public List<ItemModel> listarItens() throws SQLException {
        List<ItemModel> itens = new ArrayList<>();
        String sql = "SELECT * FROM ITEM_04";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ItemModel item = new ItemModel();
                item.setA04_codigo(rs.getInt("A04_codigo"));
                item.setA02_codigo(rs.getInt("A02_codigo"));
                item.setA03_codigo(rs.getInt("A03_codigo"));
                item.setA04_quantidade(rs.getInt("A04_quantidade"));
                item.setA04_valoritem(rs.getDouble("A04_valorItem"));
                itens.add(item);
            }
        }
        return itens;
    }

    // Alterar Item
    public void alterarItem(ItemModel item) throws SQLException {
        String sql = "CALL PROC_AltITENS(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getA04_codigo());
            stmt.setInt(2, item.getA02_codigo());
            stmt.setInt(3, item.getA03_codigo());
            stmt.setInt(4, item.getA04_quantidade());
            stmt.setDouble(5, item.getA04_valoritem());
            stmt.executeUpdate();
        }
    }

    // Deletar Item
    public void deletarItem(int codigo) throws SQLException {
        String sql = "CALL PROC_DelITEM(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        }
    }
}
