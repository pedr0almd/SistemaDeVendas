package Pck_Model;

import Pck_Persistencia.ProdutoPersistencia;
import java.sql.SQLException;

public class ProdutoModel {

    private int a03_codigo;
    private String a03_descricao;
    private double a03_valorUnitario;
    private int a03_estoque;

    //Getters e setters
    public int getA03_codigo() {
        return a03_codigo;
    }

    public void setA03_codigo(int a03_codigo) {
        this.a03_codigo = a03_codigo;
    }

    public String getA03_descricao() {
        return a03_descricao;
    }

    public void setA03_descricao(String a03_descricao) {
        this.a03_descricao = a03_descricao;
    }

    public double getA03_valorUnitario() {
        return a03_valorUnitario;
    }

    public void setA03_valorUnitario(double a03_valorUnitario) {
        this.a03_valorUnitario = a03_valorUnitario;
    }

    public int getA03_estoque() {
        return a03_estoque;
    }

    public void setA03_estoque(int a03_estoque) {
        this.a03_estoque = a03_estoque;
    }

    //Lógica do negócio
    public void descontarEstoque(int quantidadeVendida) throws Exception {
        try (ProdutoPersistencia persistencia = new ProdutoPersistencia()) {
            boolean sucesso = persistencia.descontarEstoque(this.a03_codigo, quantidadeVendida);

            if (!sucesso) {
                throw new Exception("Estoque insuficiente para o produto: " + this.a03_descricao);
            }

            // Se quiser atualizar o objeto com o novo estoque
            ProdutoModel atualizado = persistencia.buscarProdutoPorCodigo(this.a03_codigo);
            if (atualizado != null) {
                this.a03_estoque = atualizado.getA03_estoque();
            }

        } catch (SQLException e) {
            throw new Exception("Erro ao realizar venda: " + e.getMessage());
        }
    }
}
