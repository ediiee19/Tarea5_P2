/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_p2;

/**
 *
 * @author caste
 */
public class ProductosDeLimpieza {
    
    private String tipo;
    private String codigo;
    private String size;
    private String proveedor;
    private String nombre;

    public ProductosDeLimpieza(String tipo, String size, String proveedor, String nombre) {
        this.tipo = tipo;
        this.size = size;
        this.proveedor = proveedor;
        this.nombre = nombre;
    }

    public ProductosDeLimpieza(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ProductosDeLimpieza{" + "tipo=" + tipo + ", codigo=" + codigo + ", size=" + size + ", proveedor=" + proveedor + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
