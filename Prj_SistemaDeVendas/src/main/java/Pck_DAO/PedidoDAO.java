package Pck_DAO;

import Pck_Model.PedidoModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {

    private Connection connection;

    public PedidoDAO() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    // Inserir Pedido
    public void inserirPedido(PedidoModel pedido) throws SQLException {
        String sql = "CALL PROC_InsPEDIDO(?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(pedido.getA02_data()));
            stmt.setDouble(2, pedido.getA02_valortotal());
            stmt.setInt(3, pedido.getA01_codigo());  // Cliente associado
            stmt.executeUpdate();
        }
    }

    // Listar Pedidos
    public List<PedidoModel> listarPedidos() throws SQLException {
        List<PedidoModel> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM PEDIDO_02";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                PedidoModel pedido = new PedidoModel();
                pedido.setA02_codigo(rs.getInt("A02_codigo"));
                pedido.setA02_data(rs.getDate("A02_data").toLocalDate());
                pedido.setA02_valortotal(rs.getDouble("A02_valortotal"));
                pedido.setA01_codigo(rs.getInt("A01_codigo"));
                pedidos.add(pedido);
            }
        }
        return pedidos;
    }

    // Alterar Pedido
    public void alterarPedido(PedidoModel pedido) throws SQLException {
        String sql = "CALL PROC_AltPEDIDO(?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pedido.getA02_codigo());
            stmt.setDate(2, Date.valueOf(pedido.getA02_data()));
            stmt.setDouble(3, pedido.getA02_valortotal());
            stmt.setInt(4, pedido.getA01_codigo());
            stmt.executeUpdate();
        }
    }

    // Deletar Pedido
    public void deletarPedido(int codigo) throws SQLException {
        String sql = "CALL PROC_DelPEDIDO(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        }
    }

    // Buscar Pedido por Código
    public PedidoModel buscarPedidoPorCodigo(int codigo) throws SQLException {
        String sql = "SELECT * FROM PEDIDO_02 WHERE A02_codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    PedidoModel pedido = new PedidoModel();
                    pedido.setA02_codigo(rs.getInt("A02_codigo"));
                    pedido.setA02_data(rs.getDate("A02_data").toLocalDate());
                    pedido.setA02_valortotal(rs.getDouble("A02_valortotal"));
                    pedido.setA01_codigo(rs.getInt("A01_codigo"));
                    return pedido;
                } else {
                    return null; // Nenhum pedido encontrado
                }
            }
        }
    }
}
