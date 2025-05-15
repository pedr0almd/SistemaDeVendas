package Pck_Model;

import java.time.LocalDate;

public class PedidoModel {
    
    private int         a02_codigo;
    private double      a02_valortotal;
    private LocalDate   a02_data;
    private int         a01_codigo;
    private String      a02_status;              // novo
    private LocalDate   a02_dataFinalizacao;     // novo

    public int getA02_codigo() {
        return a02_codigo;
    }

    public void setA02_codigo(int a02_codigo) {
        this.a02_codigo = a02_codigo;
    }

    public double getA02_valortotal() {
        return a02_valortotal;
    }

    public void setA02_valortotal(double a02_valortotal) {
        this.a02_valortotal = a02_valortotal;
    }

    public LocalDate getA02_data() {
        return a02_data;
    }

    public void setA02_data(LocalDate a02_data) {
        this.a02_data = a02_data;
    }

    public int getA01_codigo() {
        return a01_codigo;
    }

    public void setA01_codigo(int a01_codigo) {
        this.a01_codigo = a01_codigo;
    }

    public String getA02_status() {
        return a02_status;
    }

    public void setA02_status(String a02_status) {
        this.a02_status = a02_status;
    }

    public LocalDate getA02_dataFinalizacao() {
        return a02_dataFinalizacao;
    }

    public void setA02_dataFinalizacao(LocalDate a02_dataFinalizacao) {
        this.a02_dataFinalizacao = a02_dataFinalizacao;
    }
}
