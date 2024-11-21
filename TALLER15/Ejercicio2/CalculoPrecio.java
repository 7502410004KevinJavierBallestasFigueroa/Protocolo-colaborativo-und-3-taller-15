package Ejercicio2;

public class CalculoPrecio {

    public double calculoPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * (producto.getImpuestosAlProducto()/100));
    }
}

