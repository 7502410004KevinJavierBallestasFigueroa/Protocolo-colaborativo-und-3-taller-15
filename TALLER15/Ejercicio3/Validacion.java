package Ejercicio3;

public class Validacion {
    public boolean validarUsuario(Usuario usuario) {
        return usuario.getNombreUsuario() != null && !usuario.getNombreUsuario().isEmpty()
                && usuario.getContrasena() != null && !usuario.getContrasena().isEmpty();
    }
}
