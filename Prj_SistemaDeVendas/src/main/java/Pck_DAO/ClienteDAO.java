package Pck_DAO;

import Pck_Model.ClienteModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements AutoCloseable {

    private final Connection connection;

    // Construtor que inicializa a conexão com o banco de dados
    public ClienteDAO() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    // Inserir cliente usando procedure
    public void inserirCliente(ClienteModel cliente) throws SQLException {
        try (CallableStatement stmt = connection.prepareCall("CALL PROC_InsCLIENTE(?, ?, ?, ?, ?)")) {
            stmt.setString(1, cliente.getA01_nome());
            stmt.setString(2, cliente.getA01_endereco());
            stmt.setString(3, cliente.getA01_telefone());
            stmt.setString(4, cliente.getA01_cpf());
            stmt.setDouble(5, cliente.getA01_credito());
            stmt.execute();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir cliente: " + e.getMessage());
        }
    }

    // Atualizar cliente usando procedure
    public void atualizarCliente(ClienteModel cliente) throws SQLException {
        try (CallableStatement stmt = connection.prepareCall("CALL PROC_AltCLIENTE(?, ?, ?, ?, ?)")) {
            stmt.setString(1, cliente.getA01_nome());
            stmt.setString(2, cliente.getA01_endereco());
            stmt.setString(3, cliente.getA01_telefone());
            stmt.setDouble(4, cliente.getA01_credito());
            stmt.setString(5, cliente.getA01_cpf());
            stmt.execute();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar cliente: " + e.getMessage());
        }
    }

    // Remover cliente por CPF usando procedure
    public void removerCliente(String sCpf) throws SQLException {
        try (CallableStatement stmt = connection.prepareCall("CALL Proc_DelCLIENTE(?)")) {
            stmt.setString(1, sCpf);
            stmt.execute();
            System.out.println("Cliente excluído com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir cliente: " + e.getMessage());
        }
    }

    // Listar todos os clientes
    public List<ClienteModel> listarClientes() throws SQLException {
        List<ClienteModel> lista = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement("SELECT * FROM CLIENTE_01"); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ClienteModel cliente = new ClienteModel();
                cliente.setA01_codigo(rs.getInt("A01_codigo"));
                cliente.setA01_nome(rs.getString("A01_nome"));
                cliente.setA01_endereco(rs.getString("A01_endereco"));
                cliente.setA01_telefone(rs.getString("A01_telefone"));
                cliente.setA01_cpf(rs.getString("A01_cpf"));
                cliente.setA01_credito(rs.getDouble("A01_credito"));
                lista.add(cliente);
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao listar clientes: " + e.getMessage());
        }
        return lista;
    }

    public int buscarCodigoPorCPF(String cpf) throws SQLException {
        String sql = "SELECT A01_codigo FROM CLIENTE_01 WHERE A01_cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("A01_codigo");
                } else {
                    return -1; // cliente não encontrado
                }
            }
        }
    }

    // Fechar a conexão
    @Override
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
