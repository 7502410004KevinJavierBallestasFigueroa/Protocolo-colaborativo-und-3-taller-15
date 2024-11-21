package Ejercicio1;

public class Reportes {
    public String generarReporte(Libro libro) {

        String reporte = "El título del libro es: " + libro.getTitulo() + "\n" +
        "La editorial del libro es: " + libro.getEditorial() + "\n" +
        "El autor del libro es: " + libro.getAutor() + "\n" +
        "Y tiene: " + libro.getNumeroDePaginas() + " páginas";

        return reporte;
    }
}


