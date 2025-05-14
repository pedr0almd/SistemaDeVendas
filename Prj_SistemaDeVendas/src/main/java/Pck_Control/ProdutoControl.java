package Pck_Control;

import Pck_Model.ProdutoModel;
import Pck_Persistencia.ProdutoPersistencia;
import java.sql.SQLException;

public class ProdutoControl {

    private ProdutoPersistencia produtoPersistencia;

    // Construtor que inicializa a persistência
    public ProdutoControl() {
        produtoPersistencia = new ProdutoPersistencia();
    }

    // Inserir produto
    public void inserirProduto(String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        produtoPersistencia.inserirProduto(sDescricao, dValorUnitario, iEstoque);
    }

    // Atualizar produto
    public void atualizarProduto(int iCodigo_03, String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        produtoPersistencia.atualizarProduto(iCodigo_03, sDescricao, dValorUnitario, iEstoque);
    }

    // Remover produto
    public void removerProduto(int iCodigo_03) throws SQLException {
        produtoPersistencia.removerProduto(iCodigo_03);
    }

    // Buscar produto por código
    public ProdutoModel buscarProdutoPorCodigo(int iCodigo_03) throws SQLException {
        return produtoPersistencia.buscarProdutoPorCodigo(iCodigo_03);
    }

}
