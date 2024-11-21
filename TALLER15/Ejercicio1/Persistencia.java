package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {
    public String nombreArchivo;

    public Persistencia(Libro libro) {
        nombreArchivo = libro.getTitulo()+".txt";
    }

    public void guardarEnArchivo(Libro libro) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            writer.write("Título: " + libro.getTitulo() + "\n");
            writer.write("Título: " + libro.getEditorial() + "\n");
            writer.write("Autor: " + libro.getAutor() + "\n");
            writer.write("ISBN: " + libro.getNumeroDePaginas() + "\n");
        } catch (IOException error) {
            System.err.println("Error al guardar el archivo: " + error.getMessage());
        }
    }
}

