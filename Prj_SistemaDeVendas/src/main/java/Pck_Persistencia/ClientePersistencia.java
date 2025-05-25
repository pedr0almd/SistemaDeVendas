package Pck_Persistencia;

import Pck_Model.ClienteModel;
import Pck_DAO.ConexaoMySQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientePersistencia implements AutoCloseable {

    private final Connection connection;

    // Construtor que inicializa a conexão com o banco de dados
    public ClientePersistencia() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    //01- Inserir cliente usando procedure
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

    //02- Listar clientes
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

    //03- Atualizar cliente usando procedure
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

    //04- Apagar cliente por CPF usando procedure
    public void apagarCliente(String sCpf) throws SQLException {
        try (CallableStatement stmt = connection.prepareCall("CALL Proc_DelCLIENTE(?)")) {
            stmt.setString(1, sCpf);
            stmt.execute();
            System.out.println("Cliente excluído com sucesso!");
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir cliente: " + e.getMessage());
        }
    }

    public void buscarClientePorCPF(ClienteModel cliente) throws SQLException {
    String sql = "SELECT A01_codigo FROM CLIENTE_01 WHERE A01_cpf = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, cliente.getA01_cpf());
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                cliente.setA01_codigo(rs.getInt("A01_codigo"));
            } else {
                cliente.setA01_codigo(-1);
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
