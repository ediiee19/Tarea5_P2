/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_p2;

import java.util.ArrayList;

/**
 *
 * @author caste
 */
public class FrutasVerduras {
    private double precio;
    private String categoria;
    private ArrayList valores;

    public FrutasVerduras(double precio, String categoria, ArrayList valores) {
        this.precio = precio;
        this.categoria = categoria;
        this.valores = valores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getValores() {
        return valores;
    }

    public void setValores(ArrayList valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return "FrutasVerduras{" + "precio=" + precio + ", categoria=" + categoria + ", valores=" + valores + '}';
    }
    
    
    
}
