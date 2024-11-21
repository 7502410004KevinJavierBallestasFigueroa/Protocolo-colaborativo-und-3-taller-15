package Ejercicio3;

public class Autenticacion {

    public boolean autenticar(Usuario usuario, String contrasenaIngresada, String usuarioIngresado) {
        return usuario.getContrasena().equals(contrasenaIngresada) && usuario.getNombreUsuario().equals(usuarioIngresado);
    }
}

