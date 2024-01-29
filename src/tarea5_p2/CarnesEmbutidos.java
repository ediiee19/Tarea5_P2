/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_p2;

/**
 *
 * @author caste
 */
public class CarnesEmbutidos {
    private String lugar;
    private String cant;
    private String tipo;
    private double precio;

    public CarnesEmbutidos(String lugar, String cant, String tipo, double precio) {
        this.lugar = lugar;
        this.cant = cant;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CarnesEmbutidos{" + "lugar=" + lugar + ", cant=" + cant + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    
}
