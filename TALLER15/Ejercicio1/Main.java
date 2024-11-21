package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El principito","Exupery","La torre","120");
        Reportes reportes = new Reportes();
        Persistencia persistencia = new Persistencia(libro);

        String reporte = reportes.generarReporte(libro);
        System.out.println(reporte);

        persistencia.guardarEnArchivo(libro);
    }
}

