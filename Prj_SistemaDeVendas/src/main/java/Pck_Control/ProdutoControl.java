package Pck_Control;

import Pck_Model.ProdutoModel;
import Pck_Persistencia.ProdutoPersistencia;
import java.sql.SQLException;
import java.util.List;

public class ProdutoControl {

    //01- Inserir produto
    public void inserirProduto(String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        ProdutoModel objProdutoModel = new ProdutoModel();
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(dValorUnitario);
        objProdutoModel.setA03_estoque(iEstoque);

        ProdutoPersistencia persistencia = new ProdutoPersistencia();
        persistencia.inserirProduto(objProdutoModel);
    }

    //02- Listar produtos
    public List<ProdutoModel> listarProdutos() throws SQLException {
        ProdutoPersistencia persistencia = new ProdutoPersistencia();
        return persistencia.listarProdutos();
    }

    //03- Atualizar produto
    public void atualizarProduto(String sDescricao, double dValorUnitario, int iEstoque) throws SQLException {
        ProdutoModel objProdutoModel = new ProdutoModel();
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(dValorUnitario);
        objProdutoModel.setA03_estoque(iEstoque);

        ProdutoPersistencia persistencia = new ProdutoPersistencia();
        persistencia.atualizarProduto(objProdutoModel);
    }

    //04- Apagar produto
    public void apagarProduto(int iCodigo_03) throws SQLException {
        ProdutoPersistencia persistencia = new ProdutoPersistencia();
        persistencia.apagarProduto(iCodigo_03);
    }

    //05- Buscar produto por código
    public ProdutoModel buscarProdutoPorCodigo(int iCodigo_03) throws SQLException {
        ProdutoPersistencia persistencia = new ProdutoPersistencia();
        ProdutoModel produto = persistencia.buscarProdutoPorCodigo(iCodigo_03);
        return produto; 
    }

    //06- Descontar estoque após venda
    public String descontarEstoque(int iCodigo_03, int iQuantidade) {
        try (ProdutoPersistencia persistencia = new ProdutoPersistencia()) {
            boolean sucesso = persistencia.descontarEstoque(iCodigo_03, iQuantidade);
            if (sucesso) {
                return "Estoque atualizado com sucesso!";
            } else {
                return "Estoque insuficiente para o produto ID: " + iCodigo_03;
            }
        } catch (SQLException e) {
            return "Erro ao descontar estoque: " + e.getMessage();
        }
    }
}
