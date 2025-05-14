package Pck_Persistencia;

import Pck_DAO.ProdutoDAO;
import Pck_Model.ProdutoModel;
import java.sql.SQLException;

public class ProdutoPersistencia {

    private ProdutoDAO produtoDAO;

    // Construtor que inicializa o ProdutoDAO
    public ProdutoPersistencia() {
        try {
            produtoDAO = new ProdutoDAO();
        } catch (SQLException e) {
            // Tratar a exceção adequadamente ou lançar uma RuntimeException
            throw new RuntimeException("Erro ao inicializar o ProdutoDAO", e);
        }
    }

    // Inserir produto
    public void inserirProduto(String descricao, double valorUnitario, int estoque) throws SQLException {
        ProdutoModel produto = new ProdutoModel();
        produto.setA03_descricao(descricao);
        produto.setA03_valorUnitario(valorUnitario);
        produto.setA03_estoque(estoque);
        produtoDAO.inserirProduto(produto);
    }

    // Atualizar produto
    public void atualizarProduto(int codigo, String descricao, double valorUnitario, int estoque) throws SQLException {
        ProdutoModel produto = new ProdutoModel();
        produto.setA03_codigo(codigo);
        produto.setA03_descricao(descricao);
        produto.setA03_valorUnitario(valorUnitario);
        produto.setA03_estoque(estoque);
        produtoDAO.atualizarProduto(produto);
    }

    // Remover produto
    public void removerProduto(int codigo) throws SQLException {
        produtoDAO.deletarProduto(codigo);
    }

    // Buscar produto por código
    public ProdutoModel buscarProdutoPorCodigo(int codigo) throws SQLException {
        return produtoDAO.buscarProdutoPorCodigo(codigo);
    }
}
