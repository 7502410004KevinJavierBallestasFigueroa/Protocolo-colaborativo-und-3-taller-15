package Ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String numeroDePaginas;
    
    public Libro(String titulo, String autor, String editorial, String numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numeroDePaginas = numeroDePaginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    

}
