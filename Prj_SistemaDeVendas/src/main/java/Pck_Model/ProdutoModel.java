package Pck_Model;

public class ProdutoModel {

    private int a03_codigo;
    private String a03_descricao;
    private double a03_valorUnitario;
    private int a03_estoque; // Agora como inteiro

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
}

