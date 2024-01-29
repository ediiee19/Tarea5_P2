/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_p2;

/**
 *
 * @author caste
 */
public class GranosBasicos {
    private String nombre;
    private int cant;
    private double precio;
    private String unidad;
    private String lugar;

    public GranosBasicos(String nombre, int cant, double precio, String unidad, String lugar) {
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio;
        this.unidad = unidad;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "GranosBasicos{" + "nombre=" + nombre + ", cant=" + cant + ", precio=" + precio + ", unidad=" + unidad + ", lugar=" + lugar + '}';
    }
    
    
    
    
    
}
