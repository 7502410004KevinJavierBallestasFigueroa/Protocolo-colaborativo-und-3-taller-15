package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("juan123", "contrasena123");
        Validacion validacionService = new Validacion();
        Autenticacion autenticacionService = new Autenticacion();

        if (validacionService.validarUsuario(usuario)) {
            boolean autenticado = autenticacionService.autenticar(usuario, "contrasena123","Kevin");
            if (autenticado) {
                System.out.println("Usuario autenticado con éxito.");
            } else {
                System.out.println("La autenticación ha fallado.");
            }
        } else {
            System.out.println("Los datos del usuario son inválidos.");
        }
    }
}
