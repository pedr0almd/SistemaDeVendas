package Pck_Control;

import Pck_Model.ProdutoModel;
import Pck_DAO.ProdutoDAO;
import java.sql.SQLException;

public class ProdutoControl {

    ProdutoModel objProdutoModel = new ProdutoModel();

    public ProdutoControl() {
    }

    public void inserirProduto(String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(dValorUnitario);
        objProdutoModel.setA03_estoque(iEstoque);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.inserirProduto(objProdutoModel);
    }

    public void atualizarProduto(int iCodigo_03, String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        objProdutoModel.setA03_codigo(iCodigo_03);
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(dValorUnitario);
        objProdutoModel.setA03_estoque(iEstoque);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.alterarProduto(objProdutoModel);
    }

    public void removerProduto(int iCodigo_03) throws SQLException {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.deletarProduto(iCodigo_03);
    }

    public ProdutoModel buscarProdutoPorCodigo(int iCodigo_03) throws SQLException {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.buscarProdutoPorCodigo(iCodigo_03);
    }
}
