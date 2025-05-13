package Pck_DAO;

import Pck_Model.ClienteModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    // Inserir cliente usando procedure
    public void inserirCliente(ClienteModel cliente) throws SQLException {
        CallableStatement stmt = null;
        try {
            stmt = connection.prepareCall("CALL PROC_InsCLIENTE(?, ?, ?, ?, ?)");
            stmt.setString(1, cliente.getA01_nome());
            stmt.setString(2, cliente.getA01_endereco());
            stmt.setString(3, cliente.getA01_telefone());
            stmt.setString(4, cliente.getA01_cpf());
            stmt.setDouble(5, cliente.getA01_credito());
            stmt.execute();
            System.out.println("Cliente inserido com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir cliente: " + e.getMessage());
        } finally {
            fecharRecursos(null, stmt);
        }
    }

    // Atualizar cliente usando procedure
    public void atualizarCliente(ClienteModel cliente) throws SQLException {
        CallableStatement stmt = null;
        try {
            stmt = connection.prepareCall("CALL Proc_UpdCLIENTE(?, ?, ?, ?, ?)");
            stmt.setInt(1, cliente.getA01_codigo());
            stmt.setString(2, cliente.getA01_nome());
            stmt.setString(3, cliente.getA01_endereco());
            stmt.setString(4, cliente.getA01_telefone());
            stmt.setDouble(5, cliente.getA01_credito());
            stmt.execute();
            System.out.println("Cliente atualizado com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar cliente: " + e.getMessage());
        } finally {
            fecharRecursos(null, stmt);
        }
    }

    // ✅ Remover cliente por CPF usando procedure
    public void excluirCliente(String cpf) throws SQLException {
        CallableStatement stmt = null;
        try {
            stmt = connection.prepareCall("CALL Proc_DelCLIENTE(?)");
            stmt.setString(1, cpf);
            stmt.execute();
            System.out.println("Cliente excluído com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir cliente: " + e.getMessage());
        } finally {
            fecharRecursos(null, stmt);
        }
    }

    // Listar clientes
    public List<ClienteModel> listarClientes() throws SQLException {
        List<ClienteModel> lista = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = connection.prepareStatement("SELECT * FROM CLIENTE_01");
            rs = stmt.executeQuery();

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
        } finally {
            fecharRecursos(rs, stmt);
        }

        return lista;
    }

    // Fechar recursos auxiliares
    private void fecharRecursos(ResultSet rs, Statement stmt) {
        try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
        try { if (stmt != null) stmt.close(); } catch (Exception e) { e.printStackTrace(); }
    }

    // Fechar conexão
    public void fecharConexao() {
        try { if (connection != null && !connection.isClosed()) connection.close(); } 
        catch (SQLException e) { e.printStackTrace(); }
    }
}
