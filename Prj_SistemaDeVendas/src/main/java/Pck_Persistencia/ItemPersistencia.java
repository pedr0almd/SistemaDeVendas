package Pck_Persistencia;

import Pck_DAO.ConexaoMySQL;
import Pck_Model.ItemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemPersistencia {

    private final Connection connection;

    public ItemPersistencia() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    //01- Inserir Item
    public void inserirItem(ItemModel item) throws SQLException {
        String sql = "CALL PROC_InsITEM(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getA02_codigo());
            stmt.setInt(2, item.getA03_codigo());
            stmt.setInt(3, item.getA04_item());
            stmt.setInt(4, item.getA04_quantidade());
            stmt.setDouble(5, item.getA04_valoritem());
            stmt.execute();
        }
    }

    //02- Listar Itens
    public List<ItemModel> listarItens() throws SQLException {
        List<ItemModel> itens = new ArrayList<>();
        String sql = "SELECT * FROM ITEM_04";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ItemModel item = new ItemModel();
                item.setA02_codigo(rs.getInt("A02_codigo"));
                item.setA03_codigo(rs.getInt("A03_codigo"));
                item.setA04_quantidade(rs.getInt("A04_quantidade"));
                item.setA04_valoritem(rs.getDouble("A04_valorItem"));
                item.setA04_item(rs.getInt("A04_item"));
                itens.add(item);
            }
        }
        return itens;
    }

    //03- Alterar Item
    public void alterarItem(ItemModel item) throws SQLException {
        String sql = "CALL PROC_AltITEM(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getA04_codigo());
            stmt.setInt(2, item.getA02_codigo());
            stmt.setInt(3, item.getA03_codigo());
            stmt.setInt(4, item.getA04_quantidade());
            stmt.setDouble(5, item.getA04_valoritem());
            stmt.executeUpdate();
        }
    }

    //04- Apagar Item
    public void apagarItem(ItemModel item) throws SQLException {
        String sql = "CALL PROC_DelITEM(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, item.getA04_codigo());
            stmt.executeUpdate();

        }
    }
}
