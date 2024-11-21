package Ejercicio2;

public class Producto {

    private String nombre;
    private String descripcion;
    private double precioBase;
    private double impuestosAlProducto;

    public Producto(String nombre, String descripcion, double precioBase, double impuestosAlProducto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.impuestosAlProducto = impuestosAlProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getImpuestosAlProducto() {
        return impuestosAlProducto;
    }

    public void setImpuestosAlProducto(double impuestosAlProducto) {
        this.impuestosAlProducto = impuestosAlProducto;
    }

    


}
