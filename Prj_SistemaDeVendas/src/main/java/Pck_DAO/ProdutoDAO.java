package Pck_DAO;

import Pck_Model.ProdutoModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements AutoCloseable {
    private final Connection connection;

    // Construtor que inicializa a conexão com o banco de dados
    public ProdutoDAO() throws SQLException {
        this.connection = new ConexaoMySQL().getConnection();
    }

    // Inserir produto usando procedure
    public void inserirProduto(ProdutoModel produto) throws SQLException {
        String sql = "CALL PROC_InsPRODUTO(?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getA03_descricao());
            stmt.setDouble(2, produto.getA03_valorUnitario());
            stmt.setInt(3, produto.getA03_estoque());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto: " + e.getMessage());
        }
    }

    // Listar todos os produtos
    public List<ProdutoModel> listarProdutos() throws SQLException {
        List<ProdutoModel> produtos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO_03";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ProdutoModel produto = new ProdutoModel();
                produto.setA03_codigo(rs.getInt("A03_codigo"));
                produto.setA03_descricao(rs.getString("A03_descricao"));
                produto.setA03_valorUnitario(rs.getDouble("A03_valorUnitario"));
                produto.setA03_estoque(rs.getInt("A03_estoque"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao listar produtos: " + e.getMessage());
        }
        return produtos;
    }

    // Atualizar produto usando procedure
    public void atualizarProduto(ProdutoModel produto) throws SQLException {
        String sql = "CALL PROC_AltPRODUTO(?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, produto.getA03_codigo());
            stmt.setString(2, produto.getA03_descricao());
            stmt.setDouble(3, produto.getA03_valorUnitario());
            stmt.setInt(4, produto.getA03_estoque());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    // Deletar produto
    public void deletarProduto(int codigo) throws SQLException {
        String sql = "CALL PROC_DelPRODUTO(?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar produto: " + e.getMessage());
        }
    }

    // Buscar produto por código
    public ProdutoModel buscarProdutoPorCodigo(int codigo) throws SQLException {
        String sql = "SELECT * FROM PRODUTO_03 WHERE A03_codigo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ProdutoModel produto = new ProdutoModel();
                    produto.setA03_codigo(rs.getInt("A03_codigo"));
                    produto.setA03_descricao(rs.getString("A03_descricao"));
                    produto.setA03_valorUnitario(rs.getDouble("A03_valorUnitario"));
                    produto.setA03_estoque(rs.getInt("A03_estoque"));
                    return produto;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produto por código: " + e.getMessage());
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
