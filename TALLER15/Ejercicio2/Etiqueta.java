package Ejercicio2;

public class Etiqueta {

    public String generarEtiqueta(Producto producto, double precioFinal) {
        return "Producto: " + producto.getNombre() + ", Precio Base: " + producto.getPrecioBase()+" pesos, " +"Precio Final: " + precioFinal + " pesos";
    }
}

