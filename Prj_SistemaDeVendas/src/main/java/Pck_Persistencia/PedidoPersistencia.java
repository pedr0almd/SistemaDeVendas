package Pck_Persistencia;

import Pck_DAO.ConexaoMySQL;
import Pck_Model.PedidoModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PedidoPersistencia {

    private final Connection connection;

    public PedidoPersistencia() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    //01- Inserir pedido e retornar o ID gerado
    public int inserirPedidoRetornandoId(PedidoModel pedido) throws SQLException {
        String sql = "INSERT INTO PEDIDO_02 (A02_data, A02_valortotal, A01_codigo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setDate(1, Date.valueOf(pedido.getA02_data()));
            stmt.setDouble(2, pedido.getA02_valortotal());

            if (pedido.getA01_codigo() > 0) {
                stmt.setInt(3, pedido.getA01_codigo()); // Cliente existente
            } else {
                stmt.setNull(3, java.sql.Types.INTEGER); // Cliente ainda não informado
            }

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                } else {
                    throw new SQLException("Falha ao obter o ID do pedido.");
                }
            }
        }
    }

    // Inserir pedido (sem retorno do ID) - ainda útil em alguns casos
    public void inserirPedido(PedidoModel pedido) throws SQLException {
        String sql = "CALL PROC_InsPEDIDO(?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, Date.valueOf(pedido.getA02_data()));
            stmt.setDouble(2, pedido.getA02_valortotal());
            stmt.setInt(3, pedido.getA01_codigo());
            stmt.executeUpdate();
        }
    }

    // Listar todos os pedidos
    public List<PedidoModel> listarPedidos() throws SQLException {
        List<PedidoModel> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM PEDIDO_02";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
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

    // Alterar pedido existente
    public void alterarPedido(PedidoModel pedido) throws SQLException {
        String sql = "CALL PROC_AltPEDIDO(?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pedido.getA02_codigo());
            stmt.setDouble(2, pedido.getA02_valortotal());
            stmt.setInt(3, pedido.getA01_codigo());
            stmt.executeUpdate();
        }
    }

    // Deletar pedido
    public void cancelarPedido(int codigo) throws SQLException {
        String sql = "CALL PROC_DelPEDIDO(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        }
    }

    // Buscar um pedido específico por código
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
                    pedido.setA02_status(rs.getString("A02_status"));
                    Date dataFinalizacao = rs.getDate("A02_dataFinalizacao");
                    if (dataFinalizacao != null) {
                        pedido.setA02_dataFinalizacao(dataFinalizacao.toLocalDate());
                    }

                    return pedido;
                } else {
                    return null;
                }
            }
        }
    }

    public void finalizarPedido(int codigoPedido) throws SQLException {
        String sql = "UPDATE pedido_02 SET A02_status = 'FECHADO', A02_dataFinalizacao = NOW() WHERE A02_codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigoPedido);
            stmt.executeUpdate();
        }
    }
}
