/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pck_Control;

import Pck_Model.ProdutoModel;

public class ProdutoControl {
    ProdutoModel objProdutoModel = new ProdutoModel();

    public void  inserirProduto (String sDescricao, double sValorUnitario, String sEstoque){
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(sValorUnitario);
        objProdutoModel.setA03_estoque(sEstoque);
    }

    public void atualizarProduto (int iCodigo_03, String sDescricao, double dValorUnitario, String sEstoque){
        objProdutoModel.setA03_codigo(iCodigo_03);
        objProdutoModel.setA03_descricao(sDescricao);
        objProdutoModel.setA03_valorUnitario(dValorUnitario);
        objProdutoModel.setA03_estoque(sEstoque);
    }

    public void removerProduto (int iCodigo_03){
        objProdutoModel.setA03_codigo(iCodigo_03);
    }
}

