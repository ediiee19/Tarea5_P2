/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_p2;

/**
 *
 * @author caste
 */
public class Liquidos {
    private String categoria;
    private String empaaquetado;
    private String size;
    private String nombre;
    private double precio;

    public Liquidos(String categoria, String empaaquetado, String size, String nombre, double precio) {
        this.categoria = categoria;
        this.empaaquetado = empaaquetado;
        this.size = size;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaaquetado() {
        return empaaquetado;
    }

    public void setEmpaaquetado(String empaaquetado) {
        this.empaaquetado = empaaquetado;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Liquidos{" + "categoria=" + categoria + ", empaaquetado=" + empaaquetado + ", size=" + size + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
