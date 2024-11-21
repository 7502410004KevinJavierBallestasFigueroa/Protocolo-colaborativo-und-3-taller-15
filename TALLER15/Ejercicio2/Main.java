package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", "Computador ho",1000000,19);
        CalculoPrecio calculadora = new CalculoPrecio();
        Etiqueta Etiqueta1 = new Etiqueta();

        double precioFinal = calculadora.calculoPrecioFinal(producto1);

        String etiqueta = Etiqueta1.generarEtiqueta(producto1, precioFinal);

        System.out.println(etiqueta);
    }
}

