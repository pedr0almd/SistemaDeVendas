/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pck_Model;
import java.time.LocalDate;

public class PedidoModel {
    
    private int         a02_codigo;
    private double      a02_valortotal;
    private LocalDate   a02_data;
    private int         a01_codigo;
    
    
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
    
}
